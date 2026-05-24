/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question03;


public class Appointment {
    
    private String patientName;
    private String appointmentType;
    private String patientCategory;
    private double baseFee;

    
    public Appointment(String patientName, String appointmentType, String patientCategory, double baseFee) {
        this.patientName = patientName;
        this.appointmentType = appointmentType;
        this.patientCategory = patientCategory;
        this.baseFee = baseFee;
    }

    
    public String getPatientName() { return patientName; }
    public String getAppointmentType() { return appointmentType; }
    public String getPatientCategory() { return patientCategory; }
    public double getBaseFee() { return baseFee; }

    
    public double calculateFinalFee() {
        double finalFee = this.baseFee;

        
        if (this.appointmentType.equals("Specialist")) {
            finalFee += 1500;
        } else if (this.appointmentType.equals("Online")) {
            finalFee -= 500;
        }

        
        if (this.patientCategory.equals("Child")) {
            finalFee -= 300;
        } else if (this.patientCategory.equals("Senior")) {
            finalFee -= 500;
        }

        return finalFee;
    }

    
    public String getAppointmentMessage() {
        return this.appointmentType + " appointment selected";
    }
}