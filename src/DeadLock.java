
class Warrior1 extends Thread{
	String res1="brahmastra";
	String res2="pashupatastra";
	String res3="sarpastra";
	
	
	
     @Override
       public void run() {
    	String name= Thread.currentThread().getName();
    	if(name.equals("Arjuna")) {
	             arjuna();
    	}
	
    	else {
    		karna();
    	}
     }
     public void arjuna() {
    	 try {
			Thread.sleep(3000);
			synchronized(res1) {
				System.out.println("Arjun acquired" +res1);
				Thread.sleep(3000);
				synchronized(res2) {
					System.out.println("Arjun acquired" +res2);
					Thread.sleep(3000);
				
				
				synchronized(res3) {
					System.out.println("Arjun acquired" +res3);
				}
			}
			
		}
    	 }
    	 catch (InterruptedException e) {
			
			e.printStackTrace();
		}
    	 
     }
     public void karna() {
    	 try {
 			Thread.sleep(3000);
 			synchronized(res3) {
 				System.out.println("karna acquired" +res3);
 				Thread.sleep(3000);
 				synchronized(res2) {
 					System.out.println("Karna acquired" +res2);
 					Thread.sleep(3000);
 				
 				
 				synchronized(res1) {
 					System.out.println("Karna acquired" +res1);
 				}
 			}
 			
 		}
     	 }
     	 catch (InterruptedException e) {
 			
 			e.printStackTrace();
 		}
    	 
     }
}






public class DeadLock {

	public static void main(String[] args) {
	
			Warrior1 w1=new Warrior1();
			Warrior1 w2=new Warrior1();
			w1.setName("Arjuna");
			w2.setName("Karna");
			w1.start();
			w2.start();
			
		}

	

}
