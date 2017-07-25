package exercicio09;

public class Teste {
	public static void main(String[] args) {
		Pais p1 = new Pais("Peru", "Lima", 1285220);
		Pais p2 = new Pais("Colombia", "Bogotá", 1138914);
		Pais p3 = new Pais("Peru", "Lima", 1234);
		
				
		System.out.println("------------------");
		System.out.println("País = "+p1.getNome()+"\nCapital = "+p1.getNomeCapital()+"\nDimensão = "+p1.getDimensão()+" km²"+"\nFronteira com: "+PaisesFronteira.PERU.fronteira);
		System.out.println("------------------");
		System.out.println("País = "+p2.getNome()+"\nCapital = "+p2.getNomeCapital()+"\nDimensão = "+p2.getDimensão()+" km²"+"\nFronteira com: "+PaisesFronteira.COLOMBIA.fronteira);
		System.out.println("------------------");
		System.out.println("País = "+p3.getNome()+"\nCapital = "+p3.getNomeCapital()+"\nDimensão = "+p3.getDimensão()+" km²"+"\nFronteira com: "+PaisesFronteira.COLOMBIA.fronteira);
		
		System.out.println("------------------");
		System.out.println("País 1 é igual a País 2? = "+p1.equals(p2));
		System.out.println("País 1 é igual a País 3? = "+p1.equals(p3));
		
		
	}

}
