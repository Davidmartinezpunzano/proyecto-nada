import java.util.Scanner;
public class HolaMartinez {
 
	public static void main(String[] args) {
		int num1;
		int num2 = 7;
		int num3;
		Scanner mensaje = new Scanner(System.in);
//Mostrar mensaje		
	System.out.println("introduce numero uno");
		num1 = mensaje.nextInt();
//Lo que se introduce se almacena en la variable num1		
	System.out.println("introduce numero dos");
		num2 = mensaje.nextInt();
		
		num3 = num1+num2;

		System.out.println("El resultado de la suma es: "+num3);
	}
 
}
