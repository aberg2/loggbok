import java.io.Serializable;
import java.util.Date;

/**
 * This is a class
 * Created 2019-09-10
 *
 * @author Magnus Silverdal
 */
public class loggbok implements Serializable{
    private Date createdAt;
    private Date updatedAt;
    private String message;

    // Optional ArrayList<LogEntry> history;

    public loggbok(String message) {
        this.message = message;
        createdAt = new Date();
        updatedAt = new Date();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {

        model myObj = new model();
        return createdAt+" - " + myObj.message;
    }

    // Optional: add old version to history
    public void update(String newMessage) {

    }
}