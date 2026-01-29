public class Appointment {
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private String date;
    private String time;
    private String status;

    public Appointment(int appointmentId, int patientId, int doctorId, String date, String time) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
        this.status = "Scheduled";
    }

    // Getters and Setters
    public int getAppointmentId() { return appointmentId; }
    public int getPatientId() { return patientId; }
    public int getDoctorId() { return doctorId; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getStatus() { return status; }
    
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Appointment [ID=" + appointmentId + ", Date=" + date + ", Time=" + time + ", Status=" + status + "]";
    }
}
