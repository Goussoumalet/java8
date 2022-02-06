package thread;

//le multithreading en java
class MonRunnable implements Runnable{
	
	private int valeur;
	
	
 public MonRunnable(int val) {
	   valeur = val;
 }
	

	@Override
	public void run() {
		 for(int i=0; i<5; i++) {
			 System.out.println("coucou" +" " +" run " + valeur);
		 }
		
	}
	
	
}
public class Main {

	
	public static void main(String[] args) {
		MonRunnable runnable1 = new MonRunnable(1);
		MonRunnable runnable2 = new MonRunnable(2);
		
		//création de thread 
        Thread td1  = new Thread(runnable1);
        td1.start(); // lancement de thread;
        
      //création de thread 
        Thread td2  = new Thread(runnable2);
        td2.start(); // lancement de thread;
        
        
        
        System.out.println("fin de main");
	}

}
