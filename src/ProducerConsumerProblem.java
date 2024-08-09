
class Queue{
	private int data;
	boolean dataIsPresent=false;
	
	

	

	public Queue() {
		super();
		//this.data = data;
	}
	synchronized public void setData(int data) {
	if(dataIsPresent==false) {
		this.data = data;
		
		
		System.out.println("producer produced the value "+ data);
		dataIsPresent= true;
		notify();
	}
	else {
		try {
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	}
	synchronized public void  getData() {
		
		if(dataIsPresent==true) {
		System.out.println("Consumer consumed the data "+data);
		dataIsPresent= false;
		notify();
		}
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	}
	
}
class Producer extends Thread{
	Queue q;
	
	public Producer(Queue q) {
		this.q=q;
		
		
	}

	@Override
	public void run() {
//		q.setData(1);
//		q.setData(2);
//		q.setData(3);
//		q.setData(4);
		int i=1;
		for(; ;) {
			q.setData(i++);
		}
		
	}
}
class Consumer extends Thread{
	Queue q;
	Consumer(Queue q){
		this.q=q;
	}
	@Override
	public void run() {
		for( ; ;) {
			q.getData();
		}
	}
}


public class ProducerConsumerProblem {

	public static void main(String[] args) {
		Queue q=new Queue();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		p.setName("producer");
		c.setName("consumer");
		p.start();
		c.start();
	}
}
