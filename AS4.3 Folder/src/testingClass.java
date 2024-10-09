public class testingClass {
    /*I appologize in advance that this section of the assignment and the employee classes are unfinished. 
      I have officially hit my limit of working for the last four weeks and 
      the assignment no longer sparks joy. 
      
      I am in desperate need of sleep (and it is 100% my own fault lol) 

      Have a wonderful fall break! :D 
    */
    employee emp = new employee();

        FullTimeJob ft = new FullTimeJob("Google", "Software Engineer", 1015, 1025);
        PartTimeJob pt = new PartTimeJob("Intel", "Web Developer", 1013, 1024);
        ContractJob ct = new ContractJob("Zillow", "Project Consultant", 1015, 0316);


        emp.addHistory(ft);
        emp.addHistory(pt);
        emp.addhistory(ct);

        emp.getJobDetails();
        
        // Demonstrating additional methods
        System.out.println("Full-Time Job Salary: " + ft.calculateSalary(20, 40, 3));
        System.out.println("Full-Time Work-Life Balance: " + ft.evaluateWorkLifeBalance(43, 2, 5));
        
        System.out.println("Contract Job Payment: " + ct.calculatePayment(15.50, 1270, -500));
        System.out.println("Contract Job Security: " + ct.evaluateJobSecurity());

        System.out.println("Contract Job Payment: " + pt.calculateSalary(12.75, 25));
        System.out.println("Is the part time a livable wage: " + pt.liveableWage(6080, 12.75, 25)); //6080 is an avg statistic pulled from the internet


}
