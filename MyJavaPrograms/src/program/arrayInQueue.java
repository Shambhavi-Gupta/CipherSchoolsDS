package program;



	class Queue { 
	   static  int front, rear, capacity; 
	   static  int queue[]; 
	  
	    Queue(int c) 
	    { 
	        front = rear = 0; 
	        capacity = c; 
	        queue = new int[capacity]; 
	    } 
	  
	    
	    static void queueEnqueue(int data) 
	    { 
	        
	        if (capacity == rear) { 
	            System.out.println("Queue is full"); 
	            return; 
	        } 
	  
	        
	        else { 
	            queue[rear] = data; 
	            rear++; 
	        } 
	        return; 
	    } 
	  
	    
	    static void queueDequeue() 
	    { 
	        
	        if (front == rear) { 
	            System.out.println("Queue is empty"); 
	            return; 
	        } 
	  
	       
	        else { 
	            for (int i = 0; i < rear - 1; i++) { 
	                queue[i] = queue[i + 1]; 
	            } 
	  
	           
	            if (rear < capacity) 
	            	queue[rear] = 0; 
	            
	           
	            rear--; 
	        } 
	        return; 
	    } 
	  
	    
	    static void queueDisplay() 
	    { 
	        int i; 
	        if (front == rear) { 
	            System.out.println("Queue is Empty"); 
	            return; 
	        } 
	  
	        
	        for (i = front; i < rear; i++) { 
	            System.out.println( queue[i]); 
	        } 
	        return; 
	    } 
	  
	   
	    static void queueFront() 
	    { 
	        if (front == rear) { 
	            System.out.println("Queue is Empty"); 
	            return; 
	        } 
	        System.out.println( queue[front]); 
	        return; 
	    } 
	} 
	  
	public class arrayInQueue { 
	  
	    
	    public static void main(String[] args) 
	    { 
	       
	        Queue q = new Queue(4); 
	  
	        
	        q.queueDisplay(); 
	  
	       
	        q.queueEnqueue(20); 
	        q.queueEnqueue(30); 
	        q.queueEnqueue(40); 
	        q.queueEnqueue(50); 
	  
	        
	        q.queueDisplay(); 
	  
	        
	        q.queueEnqueue(60); 
	  
	        
	        q.queueDisplay(); 
	  
	        q.queueDequeue(); 
	        q.queueDequeue(); 
	        System.out.println("after two node deletion"); 
	  
	         
	        q.queueDisplay(); 
	  
	         
	        q.queueFront(); 
	    } 
	} 

