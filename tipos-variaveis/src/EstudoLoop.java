import java.util.Arrays;
import java.util.List;

public class EstudoLoop {
	public static void main(String[] args) {

		String nomePrimeiro = "Rafaell";
		String nomeSegundo = "Bruno";
		int numPrimeiro = 11;
		
		System.out.println("Bom dia, vamos checar o seu nome: ");
		
		if (nomePrimeiro == "Rafael") {
			do
			{
				System.out.println("Topper");
			}
			while (numPrimeiro < 10);
		}
		else {
			System.out.println(nomeSegundo);
		}
		for (int i = 0; i <= 10; i = i + 5)
		{
			System.out.println(i);
		}
		List<String> Cars = Arrays.asList("BMW", "FORD", "AUDI");
		
		for(String Car : Cars) {
			System.out.println(Car);
		}
}
}
