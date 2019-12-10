package prueba_babel1;
import java.util.Scanner;
public class name_sumatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 50;
		int b = 16;
	
		System.out.println();
		int men = menor(a,b);
		int may = mayor(a,b);
		System.out.println("suma de los pares" + suma(men,may));
		
	private static int suma(int a, int b) {
		int suma=0;
		for (int i = a; i < b; ++i) {
			if(i%2==0) {
				suma+=i;
			}
	}
		
	}
	
	private static int menor (int a, int b) {
		return a>b?b:a;
	}
	private static int mayor (int a, int b) {
		return a>b?a:b;
	}
}
