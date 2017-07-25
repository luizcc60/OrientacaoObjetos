package exercicios10;

public class TestePorta {
	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.abre();
		porta.setCor(CorPinta.BRANCO);
		porta.setDimensaoX(2.10d);
		porta.setDimensaoY(0.80);
		porta.setDimensaoZ(0.05);
		porta.estaAberta();
		
		Porta porta2 = new Porta();
		porta2.fecha();
		porta2.setCor(CorPinta.PRETO);
		porta2.setDimensaoX(2.10d);
		porta2.setDimensaoY(0.80);
		porta2.setDimensaoZ(0.10);
		porta2.estaAberta();
		
		Porta porta3 = new Porta();
		porta3.fecha();
		porta3.setCor(CorPinta.VERMELHO);
		porta3.setDimensaoX(2.35d);
		porta3.setDimensaoY(0.85);
		porta3.setDimensaoZ(0.15);
		porta3.estaAberta();
		
		System.out.println(porta.Status());
		System.out.println("----------------------------");
		System.out.println(porta2.Status());
		System.out.println("----------------------------");
		System.out.println(porta3.Status());
		
	
	}

}
