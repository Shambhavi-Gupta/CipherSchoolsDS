package program;

public class linkedListQueue {
	
	  Node front, rear; 
	  int currentSize; 
	 
	 
	 private class Node
	 { 
	 int data;
	 Node next;
	 }
	 
	 
	 public linkedListQueue()
	 {
	 front = null;
	 rear = null;
	 currentSize = 0;
	 }
	 
	 public boolean isEmpty()
	 {
	 return (currentSize == 0);
	 }
	 
	 
	 public int dequeue()
	 {
	 int data = front.data;
	 front = front.next;
	 if (isEmpty()) 
	 {
	 rear = null;
	 }
	 currentSize--;
	 System.out.println(data);
	 return data;
	 }
	 
	 
	 public void enqueue(int data)
	 {
	 Node oldRear = rear;
	 rear = new Node();
	 rear.data = data;
	 rear.next = null;
	 if (isEmpty()) 
	 {
	 front = rear;
	 }
	 else 
	 {
	 oldRear.next = rear;
	 }
	 currentSize++;
	 System.out.println(data);
	 }
	 public static void main(String arg[]){
	 
      linkedListQueue queue= new linkedListQueue();
	 queue.enqueue(6);
	// queue.dequeue();
	 queue.enqueue(3);
	 queue.enqueue(99);
	 queue.enqueue(56);
	// queue.dequeue();
	 queue.enqueue(43);
	// queue.dequeue();
	 queue.enqueue(89);
	 queue.enqueue(77);
	// queue.dequeue();
	 queue.enqueue(32);
	 queue.enqueue(232);
	
	 
	 }
}
