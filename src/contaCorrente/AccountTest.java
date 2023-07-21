package contaCorrente;
import java.util.Scanner;
public class AccountTest {
	
 public static void main(String[] args) {
	
	Account account1 =  new Account("Jane Grenn", 50.00);
	Account account2= new Account("Jonh Blue", -7.53);
	
	//exibe saldo inicial de cada objeto
	System.out.printf("%sbalance: $%.2f %n",
			account1.getName(),account1.getBalance());

	System.out.printf("%sbalance: $%.2f %n%n",
			account2.getName(),account2.getBalance());
	
	//cria um Scanner para obter entrada a partir da janela de comando
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter deposit amount for account1: ");//prompt
	double depositAmount = input.nextDouble();//pbtém a entrada do usuário
	System.out.printf("%nadding %.2f to account1 balance%n%n", 
			depositAmount);
	account1.deposit(depositAmount);//Adiciona o sando de account1
 
	//exibe os saldos
	System.out.printf("%s balance: $%.2f %n",
			account1.getName(), account1.getBalance());
	
	System.out.printf("%s balance: $%.2f %n%n",
			account2.getName(), account2.getBalance());
	


	System.out.print("Enter deposit amount for account2: ");//prompt
    depositAmount = input.nextDouble();//obtém a entrada do usuário
	System.out.printf("%nadding %.2f to account2 balance%n%n", 
			depositAmount);
	account2.deposit(depositAmount);//Adiciona o sando de account1
	
	//exibe os saldos
	System.out.printf("%s balance: $%.2f %n",
			account1.getName(), account1.getBalance());

System.out.printf("%s balance: $%.2f %n%n",
		account2.getName(), account2.getBalance());

	
 }
 
	
	

}
