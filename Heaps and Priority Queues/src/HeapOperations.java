import java.util.ArrayList;

public class HeapOperations {
    static class Heap{
        ArrayList<Integer> list=new ArrayList<>();
        public void add(int data){
//            ADD AT LAST INDEX
            list.add(data);
            int x=list.size()-1; //x IS THE INDEX OF CHILD
            int par=(x-1)/2;

//            THE TIME COMPLEXITY OF THIS WHILE LOOP WILL BE O(logn) BCOS COMPARISON IS DONE BETWEEN THE NODES OF 2 LEVELS WHICH CAN BE DONE TOTAL LEVEL NUMBER OF TIME
            while(list.get(x)<list.get(par)){
//                SWAP THE NODES' DATA
                int temp=list.get(x);
                list.set(x,list.get(par));
                list.set(par,temp);

                x=par;
                par=(x-1)/2;
            }
        }
        public void print(){
            for(int i:list){
                System.out.print(i+", ");
            }
        }
        public int peek(){
            return list.get(0);
        }

        private void heapify(int index){
            int left=2*index+1;
            int right=2*index+2;
            int min=index;

            if(left<list.size() && list.get(min)>list.get(left)){
                min=left;
            }
            if(right<list.size() && list.get(min)>list.get(right)){
                min=right;
            }

            if(min!=index){
//                SWAP
                int temp=list.get(index);
                list.set(index,list.get(min));
                list.set(min,temp);

                heapify(min);
            }
        }

        public int remove(){
            int data=list.get(0);
//            STEP 1- SWAP FIRST AND LAST ELEMENT
            int temp=list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1,temp);

//            STEP 2- DELETE LAST NODE
            list.remove(list.size()-1);

//            STEP 3- HEAPIFY
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return list.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(1);

        while(h.isEmpty()==false){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
