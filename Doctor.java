public class Doctor {
    private int doctorId;
    private String name;
    private String specialization;
    private String contact;

    public Doctor(int doctorId, String name, String specialization, String contact) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.contact = contact;
    }

    // Getters and Setters
    public int getDoctorId() { return doctorId; }
    public void setDoctorId(int doctorId) { this.doctorId = doctorId; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    
    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public void displayDoctorInfo() {
        System.out.println("Doctor Information:");
        System.out.println("ID: " + doctorId);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    @Override
    public String toString() {
        return "Doctor [ID=" + doctorId + ", Name=" + name + ", Specialization=" + specialization + "]";
    }
}
