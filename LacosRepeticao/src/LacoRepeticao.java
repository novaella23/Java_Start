
public class LacoRepeticao {

	public static void main(String[] args) {
		// comando WHILE: laço pré testado

		int qtdVezes = 1;

		while (qtdVezes <= 10) {

			System.out.println("Estou fazendo a " + qtdVezes + "ª vez");

			qtdVezes++;
		}
		System.out.println("Saí do laço e executei " + (qtdVezes - 1) + " vezes.");

		System.out.println("=========================================");
		// comando DO WHILE: laço pós testado

		qtdVezes = 1;

		do {

			System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
			qtdVezes++;

		} while (qtdVezes <= 10);
		System.out.println("Saí do laço e executei " + (qtdVezes - 1) + " vezes.");

	}
}
