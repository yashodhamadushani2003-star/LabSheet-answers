public class Lecturer extends StaffMember { 
    private int courseCount; 
    private double paymentPerCourse;

    public Lecturer(String fullName, String staffID, String department, int courseCount, double paymentPerCourse) {
        super(fullName, staffID, department);
        this.courseCount = courseCount;
        this.paymentPerCourse = paymentPerCourse;
    }

    @Override
    public double calculateMonthlyPayment() {
        return courseCount * paymentPerCourse; 
    }

    public void displayLecturerDetails() {
        displayBasicDetails(); 
        System.out.println("Courses: " + courseCount);
    }
}