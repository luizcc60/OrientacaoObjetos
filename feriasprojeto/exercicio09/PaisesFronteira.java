package exercicio09;

public enum PaisesFronteira {
	
	COLOMBIA("VENEZUELA,BRASIL,PERU,EQUADOR,PANAM�"), PERU("EQUADOR,COL�MBIA,BRASIL,BOL�VIA,CHILE"); 
	
	public String fronteira;
	PaisesFronteira(String fronteira){
		this.fronteira = fronteira;
	}

}
