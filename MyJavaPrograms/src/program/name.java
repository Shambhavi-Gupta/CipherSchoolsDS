package program;

public class name {

	
	static int height = 5; 
	  
	
	static int width = (2 * height) - 1; 
	  
	
	static int abs(int d) 
	{ 
	    return d < 0 ? -1 * d : d; 
	} 

	

	public static void main(String[] args) {
		
		int i, j; 
	    for (i = 0; i < height; i++) 
	    { 
	        for (j = 0; j < height; j++)  
	        { 
	            if ((i == 0 || i == height / 2
	                || i == height - 1))             // S
	                System.out.print("*"); 
	            else if (i < height / 2
	                    && j == 0) 
	                System.out.print("*"); 
	            else if (i > height / 2
	                    && j == height - 1) 
	                System.out.print("*"); 
	            else
	                System.out.print(" "); 
	        } 
	      System.out.print("\n"); 
	    } 
	   
	    {  
	        for (i = 0; i < height; i++)  
	        { 
	            System.out.print("*"); 
	            for (j = 0; j < height; j++)           //H
	            { 
	                if ((j == height - 1) 
	                    || (i == height / 2)) 
	                    System.out.print("*"); 
	                else
	                    System.out.print(" "); 
	            } 
	            System.out.print("\n"); 
	        } 
	    
		int n = width / 2 ; 
		for (i = 0; i < height; i++)  
	    { 
	        for (j = 0; j <= width; j++) 
	        { 
	            if (j == n || j == (width - n)                //A
	                || (i == height / 2 && j > n 
	                    && j < (width - n))) 
	                System.out.print("*"); 
	            else
	                System.out.print(" "); 
	        } 
	        System.out.print("\n"); 
	        n--; 
	    } 
	    
		{ 
		    int  counter = 0; 
		    for (i = 0; i < height; i++) 
		    { 
		        System.out.print("*"); 
		        for (j = 0; j <= height; j++) 
		        { 
		            if (j == height) 
		                System.out.print("*"); 
		            else if (j == counter                //M
		                    || j == height - counter - 1) 
		                System.out.print("*"); 
		            else
		                System.out.print(" "); 
		        } 
		        if (counter == height / 2) 
		        { 
		            counter = -99999; 
		        } 
		        else
		            counter++; 
		       System.out.print("\n"); 
		    } 
	    
		    { 
		        int  half = (height / 2); 
		        for (i = 0; i < height; i++) 
		        { 
		            System.out.print("*"); 
		            for (j = 0; j < width; j++) 
		            { 
		                if ((i == 0 || i == height - 1 || i == half) 
		                    && j < (width - 2))                         //B
		                    System.out.print("*"); 
		                else if (j == (width - 2) 
		                        && !(i == 0 || i == height - 1
		                            || i == half)) 
		                    System.out.print("*"); 
		                else
		                    System.out.print(" "); 
		            } 
		            System.out.print("\n"); 
		        } 
		        
		        {  
			        for (i = 0; i < height; i++)  
			        { 
			            System.out.print("*"); 
			            for (j = 0; j < height; j++)           //H
			            { 
			                if ((j == height - 1) 
			                    || (i == height / 2)) 
			                    System.out.print("*"); 
			                else
			                    System.out.print(" "); 
			            } 
			            System.out.print("\n"); 
			        } 
				
			         
					for (i = 0; i < height; i++)  
				    { 
				        for (j = 0; j <= width; j++) 
				        { 
				            if (j == n || j == (width - n)                //A
				                || (i == height / 2 && j > n 
				                    && j < (width - n))) 
				                System.out.print("*"); 
				            else
				                System.out.print(" "); 
				        } 
				        System.out.print("\n"); 
				        n--; 
				    }  
					
					{    
						    for (i = 0; i < height; i++)  
						    { 
						        for (j = 0; j <= width; j++)  
						        { 
						            if (j == counter 
						                || j == width - counter - 1)     //V
						                System.out.print("*"); 
						            else
						                System.out.print(" "); 
						        } 
						        counter++; 
						       System.out.print("\n"); 
						    } 
						} 
		
					{ 
				        for (i = 0; i < height; i++)  
					    { 
					        for (j = 0; j < height; j++) 
					        { 
					            if (i == 0 || i == height - 1)     //I
					                System.out.print("*"); 
					            else if (j == height / 2) 
					                System.out.print("*"); 
					            else
					                System.out.print(" "); 
					        } 
					        System.out.print("\n"); 
					    } 
					} 
			}		
	    }
	}		

	    }
 }
}
