import java.util.concurrent.TimeUnit;

public class FineCalculator {
    private static final double FINE_PER_DAY = 2.0;
    private static final int GRACE_PERIOD_DAYS = 14;

    public double calculateFine(long borrowDurationDays) {
        if (borrowDurationDays <= GRACE_PERIOD_DAYS) {
            return 0.0;
        }
        long overdueDays = borrowDurationDays - GRACE_PERIOD_DAYS;
        return overdueDays * FINE_PER_DAY;
    }

    public boolean isOverdue(long borrowDurationDays) {
        return borrowDurationDays > GRACE_PERIOD_DAYS;
    }
}
