package Map;

import java.util.*;

public class HashMapImplementation {
    static class HashMap<K,V>{ //K and V are called Generics which are parameterised types which are not fixed and are generalised and able to work for any data type
//        The Node class represents the nodes of LinkedList stored in every bucket
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        private int size; //This represents the total number of nodes present in the HashMap or LinkedList
        private int N; //This represents the size of buckets array
        private LinkedList<Node> buckets[]; //This represents the Array of LinkedLists of type Node

        public HashMap(){
            this.size=0;
            N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
//        We need to implement the methods given below
        private int hashFunction(K key){
            int hashCode=key.hashCode();
//            this hashcode can be +ve or -ve
            return Math.abs(hashCode) % N;
        }
        private int searchInLL(K key, int bucketIndex){
            LinkedList<Node> ll=buckets[bucketIndex];
            int dataIndex=0;
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return dataIndex;
                }
                dataIndex++;
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBuckets[]=buckets;
            buckets=new LinkedList[N*2];
            N=N*2;

            for(int i=0;i< buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }

//            add old Nodes from oldBucket into new Bucket
            for(int i=0;i< oldBuckets.length;i++){
                LinkedList<Node> ll=oldBuckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value){ //Time complexity = O(lambda) -> O(1)

            int bucketIndex=hashFunction(key); //this should be between 0 and 3 but hashcode can be any number, so we will take hashcode % number of buckets to get answer between 0 and 3
            int dataIndex=searchInLL(key, bucketIndex); //return a valid index if the key already exists in HashMap else return -1

            if(dataIndex!=-1){
//                key already exists in that bucket, so we need to update the value of the key inside that Node
                Node node=buckets[bucketIndex].get(dataIndex);
                node.value=value;
            }
            else{
//                it is a new Node that needs to be added in the LinkedList at bucketIndex returned by hashFunction
                buckets[bucketIndex].add(new Node(key,value));
                size++;
            }

//            Check for re-hashing if lambda is more than the threshold constant
            double lambda=(double)size / N;
            if(lambda>2.0){
//                we need to re-hash
                rehash();
            }
        }
        public boolean containsKey(K key){ //Time complexity = O(lambda)->O(1)
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);

            if(di!=-1){
                return true;
            }
            return false;
        }
        public V remove(K key){ //Time complexity = O(lambda)->O(1)
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);

            if(di!=-1){
                Node node=buckets[bi].remove(di);
                size--;
                return node.value;
            }
            return null;
        }
        public V get(K key){ //Time complexity = O(lambda)->O(1)
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);

            if(di!=-1){
                Node node=buckets[bi].get(di);
                return node.value;
            }
            return null;
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i< buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return size==0;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("USA",50);
        hm.put("Indonesia",30);
        hm.put("Australia",50);

        ArrayList<String> keys=hm.keySet();
        for(String key:keys){
            System.out.println(key);
        }
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm.get("Indonesia"));
    }
}
