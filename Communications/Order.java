package Communications;

import java.util.Date;

public class Order {

    private int orderId; 
    private Date orderDate;
    private String executer;
    private String orderInfo;

    public Order() {
        super();
        this.orderDate = new Date();
    }

    public Order(int orderId, Date orderDate, String executer, String orderInfo) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.executer = executer;
        this.orderInfo = orderInfo;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getExecuter() {
        return executer;
    }

    public void setExecuter(String executer) {
        this.executer = executer;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", executer='" + executer + '\'' +
                ", orderInfo='" + orderInfo + '\'' +
                '}';
    }
}
