package Communications ;




public class Order
{
	
	private int order_id;
	
	private Date orderDate;
	
	private String executer;
	
	private String orderInfo;
	public Order(){
		super();
	}
	
	public int getOrder_id() {
		// TODO implement me
		return 0;	
	}
	
	public Date getOrderDate() {
		// TODO implement me
		return new Date();	
	}
	
	public String getExecuter() {
		// TODO implement me
		return "";	
	}
	
	public String getOrderinfo() {
		// TODO implement me
		return "";	
	}
}
