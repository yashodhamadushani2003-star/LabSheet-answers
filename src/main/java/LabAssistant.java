public class LabAssistant extends StaffMember { 
    private int hoursWorked; 
    private double hourlyRate; 

    public LabAssistant(String fullName, String staffID, String department, int hoursWorked, double hourlyRate) {
        super(fullName, staffID, department); 
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlyPayment() {
        return hoursWorked * hourlyRate; 
    }

    public void displayLabAssistantDetails() {
        displayBasicDetails(); 
        System.out.println("Hours Worked: " + hoursWorked);
    }
}
