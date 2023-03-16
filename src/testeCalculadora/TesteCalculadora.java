package testeCalculadora;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		//instanciando a classe CalculadoraAula5
		CalculadoraAula5 c = new CalculadoraAula5();
		
		c.setN1(10d);
		c.setN2(999.11d);
		c.aplicaDesconto();
		
		System.out.println(c.getResult());
		
		
		
		//System.out.println(c.getN1());
		
		//c.setN1(12d);
		
		//System.out.println(c.getN1());
		
		//System.out.println(1 + 1);
	}
}
