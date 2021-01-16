package testes;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cadastrador cadastrador = new Cadastrador("José", 30);
		
		Cadastrado c1 = new Cadastrado();
		System.out.println(c1.getNome());
		
		cadastrador.cadastrar(c1, "Maria", 28);

	}

}
