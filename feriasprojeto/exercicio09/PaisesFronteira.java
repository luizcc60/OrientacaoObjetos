package exercicio09;

public enum PaisesFronteira {
	
	COLOMBIA("VENEZUELA,BRASIL,PERU,EQUADOR,PANAMÁ"), PERU("EQUADOR,COLÔMBIA,BRASIL,BOLÍVIA,CHILE"); 
	
	public String fronteira;
	PaisesFronteira(String fronteira){
		this.fronteira = fronteira;
	}

}
