import java.util.Scanner;
public class Repeticao03{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe 3 notas: \n");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float soma = 0f;
		float media = 0f; 
		
		if (n1<=10 && n1>=0 && n2<=10 && n2>=0 && n3<=10 && n3>=0){
			soma = n1 + n2 + n3;
			media = soma / 3;
			System.out.printf("Foram lidas 3 notas e a média é %.2f \n", media);
		}
		else if (n1>10 || n1<0 && n2<=10 && n2>=0 && n3<=10 && n3>=0){
			soma = n2 + n3;
			media = soma / 2;
			System.out.printf("Foram lidas 2 notas e a média é %.2f \n", media);
		}
		else if (n1<=10 && n1>=0 && n2>10 || n2<0 && n3<=10 && n3>=0){
			soma = n1 + n3;
			media = soma / 2;
			System.out.printf("Foram lidas 2 notas e a média é %.2f \n", media);
		}
		else if (n1<=10 && n1>=0 && n2<=10 && n2>=0 && n3>10 || n3<0){
			soma = n1 + n2;
			media = soma / 2;
			System.out.printf("Foram lidas 2 notas e a média é %.2f \n", media);
		}
		else if (n1>10 || n1<0 && n2>10 || n2<0 && n3<=10 && n3>=0){
			System.out.printf("A única nota válida é %.2f", n3);
		}
		else if (n1>10 || n1<0 && n2<=10 && n2>=0 && n3>10 || n3<0)
			System.out.printf("A única nota válida é %.2f", n2);
		else if (n1<=10 && n1>=0 && n2>10 || n2<0 && n3>10 || n3<0)
			System.out.printf("A única nota válida é %.2f", n1);
		else
			System.out.printf("Nenhuma nota é válida");
	}
}
