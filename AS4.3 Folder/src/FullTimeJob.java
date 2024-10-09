

public class FullTimeJob extends Job{

    public FullTimeJob(String companyName, String position, int startDate, int endDate){
        super(companyName, position, startDate, endDate); 
    }
    
    //displays details relevant to fulltime job 
    @Override
    void displayJobDetails(){
        String info = "Full time position at: " + companyName + "\tWith name: " + position + ".\tStarting Date: " + startDate + "\tEnding date: " + endDate;
        System.out.println(info);
    }

    //takes into account hourly wage, num of hours per week, overtime and returns calculated salary as a double value
    public double calculateSalary(double hourly, int hoursPerWeek, double overtimeHours){
        //overtime pay going to be considered time and a half
        double overtimeModifier = 1.5;
        double payment = (hourly*hoursPerWeek) + (overtimeHours*overtimeModifier);

        //internet statistic: avg amt of working days in one year is 260
        int numWeeksWorked = 260/7; 
        double salary = payment *numWeeksWorked; 
        return salary; 
    }

    //considers number of working hours per week, flexibility of schedule, additional stress factors
    //Stressfactors is an int listed from 1-5 with 1 being low, 5 being high
    //flexibility has the same rating factor 
    public String evaluateWorkLifeBalance(int hoursPerWeek, int stressFactors, int flexibility){
        String response = ""; 

        //conditions that tend to automatically mean rough work life balance 
        if (hoursPerWeek >= 60 || flexibility == 1 || stressFactors == 5){
            response = "Poor";
        }

        //parameters selected somewhat arbitrarily on what I think would constitute what kind of work life balance 
        if (hoursPerWeek <=40 && stressFactors <= 2 && flexibility >=3){
            response = "Excellent";
        }else if((hoursPerWeek <=50 && stressFactors<=3) || (hoursPerWeek <=50 && flexibility >=2) || (stressFactors <=3 && flexibility >=2)){
            response = "Moderate";
        }else{
            response = "Poor";
        }
    
        return response; 
    }
}