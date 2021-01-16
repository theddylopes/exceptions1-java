package abstrata;

public class Circle extends Shape {
	private Double radius;

	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public Double area() {
		Double PI = 3.14;
		return PI * Math.pow(radius, 2);
	}
}
