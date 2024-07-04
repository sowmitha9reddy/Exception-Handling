


class Captian extends Thread{
	@Override
	public void run() {
		System.out.println("Captian entered the ground");
		try {
			BattingCoach b=new BattingCoach();
			b.setName("Batting Coach");
			 BowlingCoach bo=new  BowlingCoach();
			 bo.setName("bowling coach");
			 b.setDaemon(true);
			 bo.setDaemon(true);
			 b.start();
			 bo.start();
			sleep(3000);
			System.out.println("Captian on warmup");
			sleep(3000);
		   System.out.println("Captian doing pratice");
		   sleep(3000);
		   System.out.println("captioan do batting");
		   sleep(3000);
		   System.out.println("Captian on warmup");
		   sleep(3000);
		  System.out.println("Captian doing pratice");
		  sleep(3000);
		  System.out.println("captioan do batting");
		   sleep(3000);
		   System.out.println("captain will do bowling");
		   sleep(3000);
		   System.out.println("Captian on warmup");
		   sleep(3000);
			System.out.println("Captian doing pratice");
			sleep(3000);
		   System.out.println("captioan do batting");
			sleep(3000);
			System.out.println("captain will do bowling");
			sleep(3000);
		    
		   
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("captain will go to hotel");
	}
		
		
}
class BattingCoach extends Thread {
     @Override
      public void run() {
    	 
    	 for( ; ; ) {
    		 System.out.println("Batting coach in the ground ");
    		 try {
    				sleep(3000);
    			}
    			catch(Exception e) {
    				e.printStackTrace();
    			}
    	 }
   }
}
class BowlingCoach extends Thread{
	@Override
	public void run() {
		for( ; ; ) {
			System.out.println("Bowling coach in the ground ");
   		 try {
   				sleep(3000);
   			}
   			catch(Exception e) {
   				e.printStackTrace();
   			}
			
		}
		
	}
}
public class DemonThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Captian c=new Captian();
		c.setName("captain");
		//BattingCoach b=new BattingCoach();
		//b.setName("Batting Coach");
		 //BowlingCoach bo=new  BowlingCoach();
		 //bo.setName("bowling coach");
		 c.start();
		 //b.start();
		 //bo.start();
		

	}

}
