import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={1,3,2,5};
        int end[]={2,4,3,6};

//        SORT THE VALUES OF END TIME ARRAY IF NOT SORTED AND ALSO TAKE CARE OF THEIR RESPECTIVE INDEXES
        int activities[][]=new int [start.length][3];
//        IN EVERY ROW WE WILL KEEP 3 DETAILS OF EVERY ACTIVITY IN 3 COLUMNS, THE INDEX IN FIRST COLUMN, START TIME IN SECOND COLUMN AND END TIME IN THIRD COLUMN
        for(int i=0;i< start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
//        LAMBDA FUNCTION AND COMPARATOR FOR SORTING THE 2D ARRAY ON THE BASIS OF END TIME WHICH IS THE 3RD COLUMN IN 2D ARRAY
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));

        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
//        CHOOSE THE FIRST ACTIVITY AS OUT FIRST PERFORMED ACTIVITY BCOS IT IS GETTING FINISHED AT THE EARLIEST
        maxAct=1;
//        AFTER SORTING THE FIRST ROW WILL HAVE THE INDEX OF ACTIVITY WHOSE END TIME IS SMALLEST
        ans.add(activities[0][0]);
//        MONITOR THE LAST CHOSEN ACTIVITY'S END TIME
        int lastActEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastActEnd){
//                SELECT THAT ACTIVITY TO PERFORM IT
                maxAct++;
                ans.add(activities[i][0]);
                lastActEnd=activities[i][2];
            }
        }
        System.out.println("Maximum number of activities performed "+maxAct);
        for(int i:ans){
            System.out.print("A"+i+" ");
        }
    }
}