import java.util.Scanner; 

abstract class Job {
    public static Scanner scnr = new Scanner(System.in);

    public Job(String companyName, String position, int startDate, int endDate){
        this.companyName = companyName; 
        this.position = position; 
        this.startDate = startDate; 
        this.endDate = endDate;
    }
    //basic attributes: 
    //company name, position, startdate, enddate
    String companyName; 
    String position; 
    int startDate; 
    int endDate; 

    //Three methods that perform distinct actions 
    //displayjobdetails
    //calculatingjobduration 
    //assessJobSatisfaction

    //constructor for any type of job
    void displayJobDetails(){
        String info = "Company name: " + companyName + "\tPosition: " + position + "\tStarting Date: " + startDate + "\tEnding date: " + endDate;
        System.out.println(info);
    }

    int calculateJobDuration(){
        int jobDuration = endDate - startDate; 
        return jobDuration; 
    }

    int assessJobSatisfaction(){
        System.out.println("On a scale of 1-5, 1 being not very and 5 being very, how satisfied are you with this job?");
        int satisfaction = scnr.nextInt(); 
        return satisfaction; 
        //TODO build method later 
        //ask question on a scale of 1-5 how satisfied were you with this job? 
    } 
}