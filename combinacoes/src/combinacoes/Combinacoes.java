package combinacoes;

public class Combinacoes {

	public static void main(String[] args) {
		
		int teste = 4321;
		String texto = "";
		
		for (int i = 0; i < Math.pow(10, String.valueOf(teste).length()); i++) {
		texto = String.valueOf(i);
		if(texto.contains("1") && texto.contains("2") &&  texto.contains("3") && texto.contains("4")) {
		System.out.println(texto);
		}
		}
		
		
	}

}
