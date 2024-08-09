


class BathRoom {
	synchronized void bathRoom() { //synchronized locking java
	
		try {
		//	Thread t=Thread.currentThread();
			//System.out.println("i am bathroom");
			//System.out.println(t.getName());
			String t1=Thread.currentThread().getName();
			System.out.println(t1+	"entered the  bathroom");
			Thread.sleep(3000);
			System.out.println(t1+"using bathroom");
			Thread.sleep(3000);
			System.out.println(t1+	"exited the  bathroom");
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
	}
}
class Boy extends Thread{
	BathRoom ba=null;
	public Boy(BathRoom ba){
		this.ba=ba;
		
	}
			@Override
			public void run() {
				//System.out.println("boyusing bathroom");
				ba.bathRoom();
			
			}	
	
}
class Girl extends Thread{
	BathRoom ba=null;
	public Girl(BathRoom ba){
		this.ba=ba;
	}
	@Override
	public void run() {
		//System.out.println("girl using bathroom");
	ba.bathRoom();
	}
		
}
class Others extends Thread {
	BathRoom ba=null;
	public  Others(BathRoom ba){
    	this.ba=ba;
    	
	}
	@Override
	public void run() {
		//System.out.println("others using bathroom");
		ba.bathRoom();
	}
}
public class Synchronoization {
  public static void main(String[] args) {
	  BathRoom ba=new BathRoom();
	  
	  Boy b=new Boy(ba);
	  Girl g=new Girl(ba);
	  Others o=new Others(ba);
	  b.setName("Boy");
	  g.setName("Girl");
	  o.setName("Others");
	
	  try {
		  b.start();
		//  b.join();
		  g.start();
		//  b.join();
		  o.start();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	  
	  
  }
  
}
