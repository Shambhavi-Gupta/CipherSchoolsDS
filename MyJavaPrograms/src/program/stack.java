package program;

public class stack {

	 class Node { 
		  
        int data;  
        Node link;  
    } 
    
    Node top; 
     
    stack() 
    { 
        this.top = null; 
    } 
  
    
    public void push(int x) 
    { 
        
        Node temp = new Node(); 
  
       if (temp == null) { 
            System.out.println("\nHeap Overflow"); 
            return; 
        } 
  
        
        temp.data = x; 
  
       
        temp.link = top; 
  
     
        top = temp; 
    } 
  
   
    public boolean isEmpty() 
    { 
        return top == null; 
    } 
  
    
    public int peek() 
    { 
       
        if (!isEmpty()) { 
            return top.data; 
        } 
        else { 
            System.out.println("Stack is empty"); 
            return -1; 
        } 
    } 
  
    
    public void pop()
    { 
        
        if (top == null) { 
            System.out.println("Stack Underflow"); 
            return; 
        } 
  
        
        top = (top).link; 
    } 
  
    public void display() 
    { 
        
        if (top == null) { 
            System.out.println("Stack Underflow"); 
           // return -1; 
        } 
        else { 
            Node temp = top; 
            while (temp != null) { 
  
                // print node data 
               // System.out.print("%d->", temp.data); 
  
                
                temp = temp.link; 
            } 
        } 
    } 

// main class 
  
    public static void main(String[] args) 
    { 
        
    	stack lls=new stack();
		lls.push(20);
		lls.push(50);
		lls.push(80);
		lls.push(40);
		lls.push(60);
		lls.push(75);
       
        //System.out.println(push(lls));
        // print Top element of Stack 
        System.out.println( lls.peek()); 
  
        // Delete top element of Stack 
        lls.pop(); 
        lls.pop(); 
  
        // print Stack elements 
        lls.display(); 
  
        // print Top element of Stack 
        System.out.println( lls.peek()); 
    } 


	

	}


