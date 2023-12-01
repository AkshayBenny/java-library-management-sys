import java.util.Calendar;
import java.util.Date;

/**
 * This class manages the access duration to a library and tracks its expiry.
 * It allows setting the duration of access and calculates the expiry date based
 * on that duration.
 *
 * @author Akshay
 * @version 1.0
 */
public class LibraryAccess {
    private int duration;
    private Date expiryDate;

    /**
     * Constructor for LibraryAccess.
     * Initializes a new LibraryAccess instance with a specified duration.
     *
     * @param duration Duration of access in days. Must be a positive number.
     */
    public LibraryAccess(int duration) {
        setDuration(duration);
        calculateExpiryDate();
    }

    /**
     * Sets the duration of access to the library.
     * If the duration is negative, an error message is printed.
     *
     * @param duration Duration of access in days. Must be a positive number.
     */
    public void setDuration(int duration) {
        if (duration > 0) {
            this.duration = duration;
        } else {
            System.out.println("Duration cannot be a negative number.");
        }
    }

    /**
     * Calculates and sets the expiry date based on the current date and the
     * duration.
     */
    private void calculateExpiryDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, duration);
        this.expiryDate = calendar.getTime();
    }

    /**
     * Checks if the library access has expired based on the current date.
     *
     * @return true if the current date is after the expiry date, false otherwise.
     */
    public boolean isExpired() {
        Date currentDate = new Date();
        return currentDate.after(expiryDate);
    }

    /**
     * Retrieves the duration of library access.
     *
     * @return Duration of access in days.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Retrieves the expiry date of the library access.
     *
     * @return Expiry date as a Date object.
     */
    public Date getExpiryDate() {
        return expiryDate;
    }
}
