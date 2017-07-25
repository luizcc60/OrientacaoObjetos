package exercicios10;

public class TesteCasa {

	public static void main(String[] args) {
		Casa casa = new Casa();
		casa.setCor(CorPinta.ROXO);
		casa.setPorta1(false);
		casa.setPorta2(false);
		casa.setPorta3(true);
		System.out.println("Cor da casa: " + casa.getCor() + "\nQuantidade de portas abertas: "+ casa.quantasPortasEstaoAbertas() + "\nQuantidade de portas na casa: " + casa.totalDePortas());
	}

}
