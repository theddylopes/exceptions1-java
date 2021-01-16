package composicao3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidade.enums.OrderStatus;

public class Order {
	private Date moment;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> orderItems = new ArrayList<>();

	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	
	public void addItem(OrderItem item) {
		orderItems.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItems.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		for(OrderItem item : orderItems) {
			total += item.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + sdf2.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
		sb.append("Order Items:\n");
		for(OrderItem item : orderItems) {
			sb.append(item.getProduct().getName() + ", $" +
					  item.getProduct().getPrice() + 
					  ", Quantity: " + item.getQuantity() +
					  ", Subtotal: $" + item.subTotal() + "\n"
					);
		}
		sb.append("Total price: $" + total());
		return sb.toString();
	}
}
