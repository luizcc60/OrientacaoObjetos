package exercicio09;

public class Teste {
	public static void main(String[] args) {
		Pais p1 = new Pais("Peru", "Lima", 1285220);
		Pais p2 = new Pais("Colombia", "Bogot�", 1138914);
		Pais p3 = new Pais("Peru", "Lima", 1234);
		
				
		System.out.println("------------------");
		System.out.println("Pa�s = "+p1.getNome()+"\nCapital = "+p1.getNomeCapital()+"\nDimens�o = "+p1.getDimens�o()+" km�"+"\nFronteira com: "+PaisesFronteira.PERU.fronteira);
		System.out.println("------------------");
		System.out.println("Pa�s = "+p2.getNome()+"\nCapital = "+p2.getNomeCapital()+"\nDimens�o = "+p2.getDimens�o()+" km�"+"\nFronteira com: "+PaisesFronteira.COLOMBIA.fronteira);
		System.out.println("------------------");
		System.out.println("Pa�s = "+p3.getNome()+"\nCapital = "+p3.getNomeCapital()+"\nDimens�o = "+p3.getDimens�o()+" km�"+"\nFronteira com: "+PaisesFronteira.COLOMBIA.fronteira);
		
		System.out.println("------------------");
		System.out.println("Pa�s 1 � igual a Pa�s 2? = "+p1.equals(p2));
		System.out.println("Pa�s 1 � igual a Pa�s 3? = "+p1.equals(p3));
		
		
	}

}
