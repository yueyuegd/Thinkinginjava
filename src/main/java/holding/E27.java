package holding;

import java.util.LinkedList;
import java.util.Queue;

class Command{
	private String s;
	
	Command(String s) { this.s = s; }
	public void operation(){
		System.out.print(s+" ");
	}
}

//生产者
class Producer{
	public static void produce(Queue<Command> q){
		q.offer(new Command("wang"));
		q.offer(new Command("jun"));
		q.offer(new Command("kai"));
		
	}
}
//消费者
class Consumer {
	 public static void consume(Queue<Command> q) {
	 while(q.peek() != null)
	 q.remove().operation();
	 }
	}

public class E27 {
	public static void main(String[] args) {
		Queue<Command> goods = new LinkedList<Command>();
		Producer.produce(goods);
		Consumer.consume(goods);
	}

}
