package testeCalculadora;

public class CalculadoraAula5 {
	
	//Atributos
		private Double numero1;
		private Double numero2;
		private Double result;
		
		
		//acessores e modificadores
		public void setN1(Double n) {
			numero1 = n;
			
		}
		
		public Double getN1() {
			return numero1;
		}
		
		public void setN2(Double n) {
			numero2 = n;
			
		}
		
		public Double getN2() {
			return numero2;
			
		}
		
		public Double getResult() {
			return result;
		}
		
		//metodos operacionais
		public void add() {
			this.result = numero1 + numero2;
		}
		
		public void aplicaDesconto() {
			this.result = (this.numero1 + this.numero2) * 8767;
		}
		
		public void sub() {
			this.result = numero1 - numero2;
		}
		
		public void mult () {
			this.result = numero1 * numero2;
			
		}
		
		public void div () {
			this.result = numero1 / numero2;
			
		}
		
	
}
