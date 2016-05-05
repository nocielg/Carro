
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro c1 = new Carro();
		c1.potencia = 10;
		c1.nome = "Corsel";
		c1.velocidade = 0;
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		
		c1.imprimir();
		
		Carro c2 = new Carro();
		c2.potencia = 15;
		c2.nome = "Carango";
		c2.velocidade = 0;
		c2.acelerar();
		c2.acelerar();
		c2.imprimir();
		
		Carro c3 = new Carro();
		c3.potencia = 10;
		c3.nome = "Corsel";
		c3.velocidade = 0;
		
		System.out.println("Imprimindo c3");
		c3.imprimir();
	}

}
