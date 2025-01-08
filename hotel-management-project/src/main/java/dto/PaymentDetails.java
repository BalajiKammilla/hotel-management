package dto;

public class PaymentDetails {
	
	private Long id;
	private Double stayDays;
	private Double totalPrice;
	private PaymentMethod paymentMethod;
	private PaymentStatus paymentStatus;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getStayDays() {
		return stayDays;
	}
	public void setStayDays(Double stayDays) {
		this.stayDays = stayDays;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "PaymentDetails [id=" + id + ", stayDays=" + stayDays + ", totalPrice=" + totalPrice + ", paymentMethod="
				+ paymentMethod + ", paymentStatus=" + paymentStatus + "]";
	}
	
	
}

enum PaymentMethod {
	UPI,
	CREDITCARD,
	DEBITCARD,
	CASH,
}

enum PaymentStatus {
	SUCCESS,
	FAILED,
}