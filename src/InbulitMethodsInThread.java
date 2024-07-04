

class Demo33 extends Thread{
	@Override
	public void run() {
		Thread t= Thread.currentThread();
		
		System.out.println(t);
		System.out.println(t.getName()+"stated excute");
		System.out.println(t.getName()+"stated excuteing");
		System.out.println(t.getName()+"stated excuted");
		
	}
}


public class InbulitMethodsInThread {

	public static void main(String[] args) {
		Thread t1= Thread.currentThread();
		 System.out.println(t1.getName()+"started excute");
		 System.out.println(t1.getName()+"is excuting");
		 System.out.println(t1.getName()+"is excuting");
		 System.out.println(t1.getName()+"is excuting");
        //Thread t= Thread.currentThread();
         
	//System.out.println(t);
		Demo33 d1=new Demo33();
		d1.start();
		try {
			d1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(d1.isAlive());
	    d1.setName("Sowmitha");
	    d1.setPriority(3);
	    System.out.println(d1.getName()+"is excuting");
	    System.out.println(d1.getPriority());
	    System.out.println(t1.getName()+"is excuting");
	    System.out.println(t1.getName()+"is excuted");
	}

}