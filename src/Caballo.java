import java.util.Random;
public class Caballo extends Thread {
	
	private static Random rnd=new Random();
	
	
	public int miId;
	public int participante;
	private int distancia; //distancia recorrida
	
	public Caballo(int id){
		miId=id;
		
	}//Caballo
	
	@Override
	public void run(){
		
		System.out.printf("*** El  Caballo %d recorrió la carrera***%n", miId);
		
		while(distancia<20){
			
			distancia=distancia+rnd.nextInt(3)+1;
			System.out.printf("El caballo %d recorrió %d%n", miId, distancia);
			
			
		}
		System.out.printf("*** El Caballo %d finalizó la carrera!!! *** %n", miId);
		
	}//run
	public join{
		if(distancia==20){
		System.out.printf("*** El  Caballo %d ***%n terminó la carrera!!!", participante);
		}
		
	}//join
}//Caballo 
