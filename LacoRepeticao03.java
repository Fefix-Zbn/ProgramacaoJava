import java.util.Scanner;
public class LacoRepeticao03{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe 3 notas: \n");
	
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		int contador = 0;
		float somador = 0f;
		float media = 0f;
		
		if (n1>= 0 && n1<=10){
			contador = contador + 1;
			somador = somador + n1;
		}if (n2>=0 && n2<=10){
			contador = contador + 1;
			somador = somador + n2;
		}if (n3>=0 && n3<=10){
			contador = contador + 1;
			somador = somador + n3;
		}
			
		if (contador == 3){
			media = somador / 3;
			System.out.printf("Foram lidas 3 notas válidas e a média é %.2f", media);	
		} else if (contador == 2) {
			media = somador / 2;
			System.out.printf("Foram lidas 2 notas válidas e a média é %.2f", media);
		} else if (contador == 1)
			System.out.printf("A única nota válida é %.2f", somador);
		else
			System.out.printf("Nenhuma nota é válida.");
	}
}
