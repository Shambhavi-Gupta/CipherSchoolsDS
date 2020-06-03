package program;

public class name {

	// Below height and width variable can be used 
	// to create a user-defined sized alphabet's pattern 
	  
	// Number of lines for the alphabet's pattern 
	static int height = 5; 
	  
	// Number of character width in each line 
	static int width = (2 * height) - 1; 
	  
	// Function to find the absolute value 
	// of a number D 
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
	                System.out.printf("*"); 
	            else if (i < height / 2
	                    && j == 0) 
	                System.out.printf("*"); 
	            else if (i > height / 2
	                    && j == height - 1) 
	                System.out.printf("*"); 
	            else
	                System.out.printf(" "); 
	        } 
	      System.out.printf("\n"); 
	    } 
	   
	    {  
	        for (i = 0; i < height; i++)  
	        { 
	            System.out.printf("*"); 
	            for (j = 0; j < height; j++)           //H
	            { 
	                if ((j == height - 1) 
	                    || (i == height / 2)) 
	                    System.out.printf("*"); 
	                else
	                    System.out.printf(" "); 
	            } 
	            System.out.printf("\n"); 
	        } 
	    
		int n = width / 2 ; 
		for (i = 0; i < height; i++)  
	    { 
	        for (j = 0; j <= width; j++) 
	        { 
	            if (j == n || j == (width - n)                //A
	                || (i == height / 2 && j > n 
	                    && j < (width - n))) 
	                System.out.printf("*"); 
	            else
	                System.out.printf(" "); 
	        } 
	        System.out.printf("\n"); 
	        n--; 
	    } 
	    
		{ 
		    int  counter = 0; 
		    for (i = 0; i < height; i++) 
		    { 
		        System.out.printf("*"); 
		        for (j = 0; j <= height; j++) 
		        { 
		            if (j == height) 
		                System.out.printf("*"); 
		            else if (j == counter                //M
		                    || j == height - counter - 1) 
		                System.out.printf("*"); 
		            else
		                System.out.printf(" "); 
		        } 
		        if (counter == height / 2) 
		        { 
		            counter = -99999; 
		        } 
		        else
		            counter++; 
		       System.out.printf("\n"); 
		    } 
	    
		    { 
		        int  half = (height / 2); 
		        for (i = 0; i < height; i++) 
		        { 
		            System.out.printf("*"); 
		            for (j = 0; j < width; j++) 
		            { 
		                if ((i == 0 || i == height - 1 || i == half) 
		                    && j < (width - 2))                         //B
		                    System.out.printf("*"); 
		                else if (j == (width - 2) 
		                        && !(i == 0 || i == height - 1
		                            || i == half)) 
		                    System.out.printf("*"); 
		                else
		                    System.out.printf(" "); 
		            } 
		            System.out.printf("\n"); 
		        } 
		        
		        {  
			        for (i = 0; i < height; i++)  
			        { 
			            System.out.printf("*"); 
			            for (j = 0; j < height; j++)           //H
			            { 
			                if ((j == height - 1) 
			                    || (i == height / 2)) 
			                    System.out.printf("*"); 
			                else
			                    System.out.printf(" "); 
			            } 
			            System.out.printf("\n"); 
			        } 
				
			         
					for (i = 0; i < height; i++)  
				    { 
				        for (j = 0; j <= width; j++) 
				        { 
				            if (j == n || j == (width - n)                //A
				                || (i == height / 2 && j > n 
				                    && j < (width - n))) 
				                System.out.printf("*"); 
				            else
				                System.out.printf(" "); 
				        } 
				        System.out.printf("\n"); 
				        n--; 
				    }  
					
					{    
						    for (i = 0; i < height; i++)  
						    { 
						        for (j = 0; j <= width; j++)  
						        { 
						            if (j == counter 
						                || j == width - counter - 1)     //V
						                System.out.printf("*"); 
						            else
						                System.out.printf(" "); 
						        } 
						        counter++; 
						       System.out.printf("\n"); 
						    } 
						} 
		
					{ 
				        for (i = 0; i < height; i++)  
					    { 
					        for (j = 0; j < height; j++) 
					        { 
					            if (i == 0 || i == height - 1)     //I
					                System.out.printf("*"); 
					            else if (j == height / 2) 
					                System.out.printf("*"); 
					            else
					                System.out.printf(" "); 
					        } 
					        System.out.printf("\n"); 
					    } 
					} 
			}		
	    }
	}		

	    }
 }
}