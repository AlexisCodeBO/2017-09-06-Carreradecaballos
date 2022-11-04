import java.util.Scanner;

public class PruebaCaballo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Ingrese el numero de caballos: ");
		int nCaballos=entrada.nextInt();
		
		Caballo[]caballos= new Caballo[nCaballos];
		
		for(int h=0;h< nCaballos; h++){
			caballos[h]=new Caballo(h);
		}
		
		for(int h=0;h< nCaballos; h++ ){
			caballos[h].start();
		}
	}

}
