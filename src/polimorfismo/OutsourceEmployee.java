package polimorfismo;

public class OutsourceEmployee extends Employee{
	private Double addicionalCharge;

	public OutsourceEmployee() {
		super();
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double addicionalCharge) {
		super(name, hours, valuePerHour);
		this.addicionalCharge = addicionalCharge;
	}

	public Double getAddicionalCharge() {
		return addicionalCharge;
	}

	public void setAddicionalCharge(Double addicionalCharge) {
		this.addicionalCharge = addicionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + addicionalCharge * 1.1;
	}
	
	
}
