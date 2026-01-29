public class Billing {
    private int billId;
    private int patientId;
    private double amount;
    private String paymentStatus;

    public Billing(int billId, int patientId, double amount) {
        this.billId = billId;
        this.patientId = patientId;
        this.amount = amount;
        this.paymentStatus = "Pending";
    }

    public void processPayment() {
        this.paymentStatus = "Paid";
        System.out.println("Payment processed for Bill ID: " + billId);
    }

    // Getters
    public int getBillId() { return billId; }
    public double getAmount() { return amount; }
    public String getPaymentStatus() { return paymentStatus; }
}
