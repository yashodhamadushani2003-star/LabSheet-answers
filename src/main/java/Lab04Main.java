public class Lab04Main {
    public static void main(String[] args) {
        StaffMember.showSystemName(); 
        UniversityPolicy.showPolicyHeader(); 

        
        Lecturer l1 = new Lecturer("Dr. Kasun", "LEC01", "Computing", 3, 15000);
        Lecturer l2 = new Lecturer("Dr. Nimmi", "LEC02", "Science", 4, 15000);
        LabAssistant la1 = new LabAssistant("Mr. Perera", "LAB01", "Computing", 40, 500);

        
        l1.changeDepartment("Information Technology");

        
        StaffMember[] staff = {l1, l2, la1};
        double totalSalary = 0;

        for (StaffMember s : staff) {
            s.displayBasicDetails();
            double salary = s.calculateMonthlyPayment();
            System.out.println("Monthly Payment: " + salary);
            System.out.println("Bonus: " + UniversityPolicy.calculateBonus(salary));
            s.showCommonNotice();
            totalSalary += salary;
            System.out.println("--------------------");
        }

        System.out.println("Total Monthly Payment: " + totalSalary); 
        System.out.println("Total Staff Count: " + StaffMember.getStaffCount());
    }
}