import java.util.Date;

public class Transaction {
    private int transactionId;
    private int bookId;
    private int memberId;
    private Date borrowDate;
    private Date returnDate;
    private String status;

    public Transaction(int transactionId, int bookId, int memberId) {
        this.transactionId = transactionId;
        this.bookId = bookId;
        this.memberId = memberId;
        this.borrowDate = new Date();
        this.status = "Borrowed";
    }

    public void returnBook() {
        this.returnDate = new Date();
        this.status = "Returned";
    }

    // Getters
    public int getTransactionId() { return transactionId; }
    public int getBookId() { return bookId; }
    public int getMemberId() { return memberId; }
    public Date getBorrowDate() { return borrowDate; }
    public Date getReturnDate() { return returnDate; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "Transaction [ID=" + transactionId + ", Book=" + bookId + ", Member=" + memberId + ", Status=" + status + "]";
    }
}
