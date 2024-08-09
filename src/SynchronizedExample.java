class BathRoom2 {
	 void bathRoom() { //synchronized locking java
	
		try {
		//	Thread t=Thread.currentThread();
			//System.out.println("i am bathroom");
			//System.out.println(t.getName());
			String t1=Thread.currentThread().getName();
			System.out.println(t1+	"is executing stmt1");
			Thread.sleep(3000);
			System.out.println(t1+"is executing stmt2");
			Thread.sleep(3000);
			System.out.println(t1+	"is executing stmt3");
			Thread.sleep(3000);
			System.out.println(t1+	"is executing stmt4");
			Thread.sleep(3000);
			System.out.println(t1+	"is executing stmt5");
			Thread.sleep(3000);
			synchronized(this)
			{
				System.out.println(t1+	"is executing stmt6");
				Thread.sleep(3000);
				System.out.println(t1+	"is executing stmt7");
				Thread.sleep(3000);
				System.out.println(t1+	"is executing stmt8");   //like bedroom
				Thread.sleep(3000);
				System.out.println(t1+	"is executing stmt9");
				Thread.sleep(3000);
			}
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
	}
}
class Boy12 extends Thread{
	BathRoom2 ba=null;
	public Boy12(BathRoom2 ba){
		this.ba=ba;
		
	}
			@Override
			public void run() {
				//System.out.println("boyusing bathroom");
				ba.bathRoom();
			
			}	
	
}
class Girl12 extends Thread{
	BathRoom2 ba=null;
	public Girl12(BathRoom2 ba){
		this.ba=ba;
	}
	@Override
	public void run() {
		//System.out.println("girl using bathroom");
	ba.bathRoom();
	}
		
}
class Others12 extends Thread {
	BathRoom2 ba=null;
	public  Others12(BathRoom2 ba){
    	this.ba=ba;
    	
	}
	@Override
	public void run() {
		//System.out.println("others using bathroom");
		ba.bathRoom();
	}
}


	 

public class SynchronizedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BathRoom2 ba=new BathRoom2();
		  
		  Boy12 b=new Boy12(ba);
		  Girl12 g=new Girl12(ba);
		  Others12 o=new Others12(ba);
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
