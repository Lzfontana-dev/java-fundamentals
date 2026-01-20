package Entradadedadosemjava;
import java.util.Locale;
import java.util.Scanner;
public class Exercises {

	public static void main(String[] args) {
		// Meu primeiro projeto / exercício mais complexo , uma parte que eu tenho muita dificuldade é aprender
		// 3 coisas e não conseguir utiliza las juntas , nesse miniprojeto por assim dizer , vou usar 
		// Entrada de dados , processamento de dados e saída de dados em java
	 Locale.setDefault(Locale.US);	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Digite seu nome");
	 String name; 
	 name = sc.nextLine();
	 System.out.printf("Olá aluno %s %n", name);
	 
	 System.out.println("Digite sua nota de português");
	 double portuguese;
	 portuguese = sc.nextDouble();
	 
	 System.out.println("Digite sua nota de matemática");
	 double math;
	 math = sc.nextDouble();
	 
	 System.out.println("Digite sua nota de inglês");
	 double english;
	 english = sc.nextDouble();
	 
	 double media;
	 double maiornota;
	 double menornota;
	 double difference;
	 
	 System.out.println("Agora vamos calcular sua média aritmética");
	 media = (portuguese + math + english) / 3; 
	 System.out.printf("Média aritmética: %.2f  %n", media);
	 
	 System.out.println("Agora vamos ver qual sua maior nota");
	 maiornota = Math.max(portuguese, Math.max(math, english));
	 System.out.printf("Maior nota: %.2f %n", maiornota);
	 
	 System.out.println("Agora vamos ver qual a sua menor nota");
	 menornota = Math.min(portuguese, Math.min(math, english));
	 System.out.printf("Menor nota: %.2f%n", menornota);
	 
	 System.out.println("Agora vamos verificar a diferença entre sua maior e menor nota");
	 difference = (maiornota - menornota);
	 System.out.printf("Diferença: %.2f%n ", difference);
	 
     sc.close();
	}

}
