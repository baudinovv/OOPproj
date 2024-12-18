package Communications;

import java.util.Date;
import Users.*;
import EnumsAndComparators.*;

public class Message {

    private Employee sender;
    private User recipient;
    private String content;
    private Date timestamp;
    private UrgencyLevel level;
    private MessageStatus status;
    private String request;

    public Message() {
        super();
        this.timestamp = new Date();
        this.status = MessageStatus.UNREAD;  // По умолчанию сообщение не прочитано
    }

    public Employee getSender() {
        return sender;
    }

    public void setSender(Employee sender) {
        this.sender = sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public UrgencyLevel getLevel() {
        return level;
    }

    public void setLevel(UrgencyLevel level) {
        this.level = level;
    }

    public MessageStatus getStatus() {
        return status;
    }

    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void sendComplaint(Student student, UrgencyLevel level, String complaintText) {
        this.setSender(student); 
        this.setLevel(level);
        this.setContent(complaintText);
        this.setTimestamp(new Date());
    }

    public void sendRequest(Employee sender, Admin dean, String request) {
        this.setSender(sender);
        this.setRecipient(dean);
        this.setRequest(request);
        this.setTimestamp(new Date());
        this.setStatus(MessageStatus.UNREAD);
    }
}
