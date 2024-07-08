import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    static class Job{
        int deadline;
        int profit;
        int id; //0 (A), 1 (B), 2 (C)...
        public Job(int deadline, int profit, int id){
            this.deadline=deadline;
            this.profit=profit;
            this.id=id;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
//        WE WILL CREATE AN ARRAY OF OBJECTS OF TYPE JOB WITH SAME DATA IN JOBINFO ARRAY
        ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(jobInfo[i][0],jobInfo[i][1],i));
        }
//        NOW WE WILL DESCENDINGLY SORT THE JOBS ON THE BASIS OF PROFIT OF EACH JOB
        Collections.sort(jobs, (obj1,obj2)->(obj2.profit-obj1.profit));

        ArrayList<Integer> sequence=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job currentJob=jobs.get(i);
            if(currentJob.deadline>time){
                sequence.add(currentJob.id);
                time++;
            }
        }
        System.out.println("Maximum jobs done "+sequence.size());
        for(int i:sequence){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
