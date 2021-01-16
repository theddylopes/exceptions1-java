package heranca1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account(1001, "Jose", 100.0);
		Account sacc = new SavingsAccount(1002, "Maria", 100.0, 0.01);
		Account bacc = new BusinessAccount(1003, "Joao", 100.0, 500.0);
		
		System.out.println("withdraw Account");
		System.out.println(acc.getBalance());
		acc.withdraw(50.0);
		System.out.println(acc.getBalance());
		
		
		//Comportamento do método withdraw sobrescrito na classe SavingsAccount
		System.out.println("withdraw SavingsAccount");
		System.out.println(sacc.getBalance());
		sacc.withdraw(50.0);
		System.out.println(sacc.getBalance());
		
		//Comportamento do método withdraw sobrescrito na classe BusinessAccount
		System.out.println("withdraw BusinessAccount");
		System.out.println(bacc.getBalance());
		bacc.withdraw(50.0);
		System.out.println(bacc.getBalance());
				
	}

}
