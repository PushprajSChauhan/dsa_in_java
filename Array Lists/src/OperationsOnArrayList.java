import java.util.ArrayList;

public class OperationsOnArrayList {
    public static void main(String[] args) {
//        ARRAYLIST IS A PART OF JAVA COLLECTION FRAMEWORK
        ArrayList <Integer> list1=new ArrayList<>();
        ArrayList <String> list2=new ArrayList<>();
        ArrayList <Boolean> list3=new ArrayList<>();

//        ADDING ELEMENTS IN AN ARRAYLIST
        list1.add(1); //TIME COMPLEXITY FOR ADDING AN ELEMENT IN ARRAYLIST IS O(1)
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

//        GETTING ELEMENTS FROM AN ARRAYLIST
        System.out.println(list1.get(2)); //TIME COMPLEXITY FOR GETTING AN ELEMENT FROM AN ARRAYLIST IS O(1)
        System.out.println(list1.get(4));
        System.out.println(list1.get(1));

//        REMOVING ELEMENT FROM ARRAYLIST
        list1.remove(2); //TIME COMPLEXITY FOR REMOVING ANY ELEMENT FROM ARRAYLIST IS O(n) AS WE TRAVERSE COMPLETE ARRAYLIST TO REACH THAT INDEX
        System.out.println(list1);
        list1.add(2,3); //IT IS ANOTHER VERSION OR WAY TO ADD ELEMENT AT A SPECIFIED INDEX WHERE ALL ELEMENTS MOVE TOWARD RIGHT AS NEW ELEMENT IS ADDED
        System.out.println(list1); //TIME COMPLEXITY FOR THIS add() METHOD IS O(n)

//        SETTING/UPDATING AN ELEMENT IN ARRAYLIST
        list1.set(2,10); //TIME COMPLEXITY FOR UPDATING ANY ELEMENT IS ALSO O(n)
        System.out.println(list1);

//        CHECKING FOR THE EXISTENCE OF AN ELEMENT
        System.out.println(list1.contains(1)); //TIME COMPLEXITY HERE IS O(n) AS COMPLETE ARRAYLIST IS TRAVERSED ONCE TO SEARCH THE ELEMENT
        System.out.println(list1.contains(11));

//        TO GET THE TOTAL NUMBER OF ELEMENTS IN THE ARRAYLIST
        System.out.println(list1.size());
        System.out.println(list2.size());
    }
}