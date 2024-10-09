
public class ContractJob extends Job{
    //check note at the top of testingClass file

    //constructor class, first calls superclass constructor and then builds 
    public ContractJob(String companyName, String position, int startDate, int endDate){
        super(companyName, position, startDate, endDate); 
    }

    
    //displays details depending on contracting job 
    @Override
    void displayJobDetails(){
        String info = "Contracting position at: " + companyName + "\tWith name: " + position + ".\tStarting Date: " + startDate + "\tEnding date: " + endDate;
        System.out.println(info);
    }

    public double calculatePayment(int hourly, int hoursWorked, double additionals){
        //bonuses and penalties lumped since you can pass in a positive or negative
        //number as a parameter
        double payment = (hourly*hoursWorked) + additionals;
        return payment;  
    }


    //going to consider long enough contract = at least a year 
    public String evaluateJobSecurity(){
        String response = ""; 

        //caculates contract duration 
        int contractDuration = calculateJobDuration(); 
        
        //parameters for stability of company 
        System.out.println("Does your company have a good relationship with its workers? Is there room for career growth? 1 for no, 0 for yes.");
        int healthyCompany = scnr.nextInt(); 

        System.out.println("Does your contract have termination clauses? 1 for no, 0 for yes.");
        int termination = scnr.nextInt(); 

        //decides if job security is high, medium or low
        if(contractDuration >= 365 && healthyCompany > 0 && termination > 0){
            response = "High";
        }else if ((contractDuration >= 365 && healthyCompany >0) || (contractDuration >= 365 && termination >0) || (termination > 0 && healthyCompany >0)){
            response = "Medium";
        }else{
            response = "Low";
        }
    
        return response; 
    }
}
