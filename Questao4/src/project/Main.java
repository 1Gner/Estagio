package project;

public class Main {
	
	

	public static void main(String[] args) {
		Double  SP = 67836.43;
		Double RJ = 36678.66;
		Double MG = 29229.88;
		Double ES = 27165.48;
		Double Outros = 19849.53;
		
		Double somaAll = SP +RJ +MG +ES +Outros;
		
		System.out.println("O percentual de SP: " + (SP/somaAll)*100 +"%");
		System.out.println("O percentual de RJ: " + (RJ/somaAll)*100 +"%");
		System.out.println("O percentual de MG: " + (MG/somaAll)*100 +"%");
		System.out.println("O percentual de ES: " + (ES/somaAll)*100 +"%");
		System.out.println("O percentual de Outros: " + (Outros/somaAll)*100 +"%");
	}

}
