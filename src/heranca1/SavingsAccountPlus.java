package heranca1;

public class SavingsAccountPlus extends SavingsAccount {
	private Double bonus;

	public SavingsAccountPlus() {
		super();
	}

	public SavingsAccountPlus(Integer number, String holder, Double balance, Double interestRate, Double bonus) {
		super(number, holder, balance, interestRate);
		this.bonus = bonus;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	
}
