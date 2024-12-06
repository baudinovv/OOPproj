package Communications ;




public class Message
{
	
	private Employee sender;
	
	private User recipient;
	
	private String content;
	
	private Date timestamp;
	
	private Urgency level urgencyLevel;
	
	private Message Status status;
	
	private String request;
	public Message(){
		super();
	}
	
	public Employee getSender() {
		// TODO implement me
		return null;	
	}
	
	public User getRecipient() {
		// TODO implement me
		return null;	
	}
	
	public String getContent() {
		// TODO implement me
		return "";	
	}
	
	public Date getTimestamp() {
		// TODO implement me
		return new Date();	
	}
	
	public Urgency level getLevel() {
		// TODO implement me
		return Urgency level.LOW;	
	}
	
	public Message Status getStatus() {
		// TODO implement me
		return Message Status.READ;	
	}
	
	public void sendComplaint(Student student, Urgency level level, String complaint_text) {
		// TODO implement me	
	}
	
	public void sendRequest(Employee sender, Admin dean, String request) {
		// TODO implement me	
	}
}
