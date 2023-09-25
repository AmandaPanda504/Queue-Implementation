public class Queue{

	int front; 
	int rear;
	int size ;
	int[] queue = new int[6];

	
	public boolean isEmpty(){

		return getSize()== 0;
	}

	public boolean isFull(){

		return getSize()==6;
	}

	public int getSize(){

		return size;
	}


	public void enqueue(int data){
		if(!isFull()){
			queue[rear] = data;
			rear = (rear + 1)%6; // modolo 6 to create rotation with array
			size++;
		}

		else{
			System.out.println("Queue is Full");
		}
			
	}


	public int dequeue(){
		int data = queue[front];
		
		if(!isEmpty()){		
			front = (front+1)%6;
			size--;		
		}

		else{
			System.out.println("Queue is Empty");
		}	
		
		return data;
	}

	public void display(){
		for(int i = 0; i < size; i++){
			System.out.println(queue[(front+i)%6]);
		}
	}

	
}