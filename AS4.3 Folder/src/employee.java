import java.util.ArrayList;

public class employee {
    public ArrayList <Job> history; 

    public void addHistory(Job job){
        //pulls from job classes
        history.add(job);
    }

    public void getJobDetails(){
        for (Job job : history) {
            job.displayJobDetails();
            System.out.println("Duration: " + job.calculateJobDuration() + " months");
            System.out.println("Satisfaction: " + job.assessJobSatisfaction());
            System.out.println();
        }
    }

}
