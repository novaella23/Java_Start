package ImprimindoArray;

public class ImprimeArray {

	public static void main(String[] args) {

		//declarando o array
		String [] paises = new String[5];
		
		//inicializando o array
		paises[0] = "Brasil";
		paises[1] = "Alemanha";
		paises[2] = "Itália";
		paises[3] = "Áustria";
		paises[4] = "Polônia";
		
		//forEach
		for (String lista: paises) {
			System.out.println(lista);
		}
		
		
		
	}

}
