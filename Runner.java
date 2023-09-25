public class Runner{

	public static void main(String[] args) {

		Queue q = new Queue();

		q.enqueue(99);
		q.enqueue(88);
		q.enqueue(32);
		q.enqueue(55);

		q.dequeue();
		q.dequeue();

		q.enqueue(2);
		q.enqueue(25);
		q.enqueue(77);
		q.enqueue(101);
		q.enqueue(32);
		//q.enqueue(84);

		q.dequeue();
		q.dequeue();



		q.display();

		
	}
}