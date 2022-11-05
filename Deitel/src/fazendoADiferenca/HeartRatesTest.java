package fazendoADiferenca;
import java.util.Scanner;
public class HeartRatesTest {

	public static void main(String[ ] args) {
		
		HeartRates heartrates1 = new HeartRates("Flávio",35);
		 
		
		
		
		System.out.printf("O paciente: "+ heartrates1.getName() +" idade :" + heartrates1.getIdade() + " tem uma frequencia " + heartrates1.getFrequencia() + heartrates1.getFormula());
		Scanner input = new Scanner(System.in);
	
	
	}
	
	
	
}
