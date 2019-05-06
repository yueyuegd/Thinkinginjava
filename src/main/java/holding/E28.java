package holding;

import java.util.PriorityQueue;
import java.util.Random;

public class E28 {
	static Random rand = new Random(47);
	public static void printQ(PriorityQueue<Double> queue){
		for(Object data=queue.poll();data!=null;data=queue.poll()){
			System.out.println(data);
		}
	}
	public static void main(String[] args) {
		PriorityQueue<Double> doubleQueue = 
				new PriorityQueue<Double>();
		for(int i=0;i<10;i++){
			doubleQueue.offer(rand.nextDouble());
		}
		//ÒÆ³ý²¢ÏÔÊ¾
		printQ(doubleQueue);
	}

}
