import java.util.Calendar;
import java.util.Date;

public class LibraryAccess 
{
    private int duration; 
    private Date expiryDate;

    public LibraryAccess(int duration) 
    {
        setDuration(duration);
        calculateExpiryDate();
    }

    public void setDuration(int duration) 
    {
        if (duration > 0 && duration <= 3) {
            this.duration = duration;
        } else {
            throw new IllegalArgumentException("Duration must be between 1 and 3 days.");
        }
    }

    private void calculateExpiryDate() 
    {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, duration);
        this.expiryDate = calendar.getTime();
    }

    public boolean isExpired() 
    {
        Date currentDate = new Date();
        return currentDate.after(expiryDate);
    }

    public int getDuration() 
    {
        return duration;
    }

    public Date getExpiryDate() 
    {
        return expiryDate;
    }

}
