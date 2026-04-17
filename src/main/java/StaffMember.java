

abstract class StaffMember {
    private String fullName; 
    private final String staffID; 
    protected String department; 
    private static int staffCount = 0; 

    
    public StaffMember(String fullName, String staffID, String department) {
        this.fullName = fullName;
        this.staffID = staffID;
        this.department = department;
        staffCount++; 
    }

  
    public String getFullName() { return fullName; }
    public String getStaffID() { return staffID; }
    public String getDepartment() { return department; }

    
    public final void displayBasicDetails() {
        System.out.println("Staff ID: " + staffID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Department: " + department);
    }

    
    public abstract double calculateMonthlyPayment();

 
    public static void showSystemName() {
        System.out.println("System Name: Campus Staff Payment System"); 
    }

    public static int getStaffCount() {
        return staffCount; 
    }

   
    public void changeDepartment(String newDepartment) {
        if (!newDepartment.isEmpty()) { 
            this.department = newDepartment;
        }
    }

    public final void showCommonNotice() {
        System.out.println("Notice: Please submit your monthly reports on time."); 
    }
}
