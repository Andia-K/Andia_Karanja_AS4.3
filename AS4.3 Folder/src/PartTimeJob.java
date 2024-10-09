public class PartTimeJob extends Job {

    public PartTimeJob(String companyName, String position, int startDate, int endDate){
        super(companyName, position, startDate, endDate); 
      
    }

    //displays details based on part time position 
    @Override
    void displayJobDetails(){
        String info = "Part time position at: " + companyName + "\tWith name: " + position + ".\tStarting Date: " + startDate + "\tEnding date: " + endDate;
        System.out.println(info);
    }
    
    //possible additional methods: 
    public double calculateSalary(double hourly, int hoursPerWeek){
        double payment = (hourly*hoursPerWeek);

        //internet statistic: avg amt of working days in one year is 260
        //assuming that the part time job lasts through the year 
        int numWeeksWorked = 260/7;
        double salary = payment *numWeeksWorked; 
        return salary; 
    }

    public String liveableWage(int costOfLiving, int hourly, int hoursPerWeek){
        //cost of living is assumed to be a permonth number 
        String livable = "";
        double monthlySalary = calculateSalary(hourly, hoursPerWeek) / 12; 

        if (monthlySalary > costOfLiving){
            livable = "The calculated salary is livable.";
        }else{
            livable = "The calculated salary is not livable.";
        }
        return livable;
    }
}
