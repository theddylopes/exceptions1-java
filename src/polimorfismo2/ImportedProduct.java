package polimorfismo2;

public class ImportedProduct extends Product {
	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		price += customsFee;
		StringBuilder sb = new StringBuilder();
		sb.append(name + " ");
		sb.append("$ " + String.format("%.2f", price) + " ");
		sb.append("(Customs fee: $ " + String.format("%.2f", customsFee)  + ")");
		return sb.toString();
	}
	
	
}
