package introduction;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		  int x,c=0,b=0,a=0;
		int arr[] = new int[20]; 
		
		System.out.println("Enter the integers: ");  
		for(int i=0; i<arr.length; i++)  
		{  
            arr[i]=sc.nextInt();  
		} 
		 Scanner obj = new Scanner(System.in); 
		    System.out.println("Type a number:");
		    x = obj.nextInt();
		    
		    for(int i=0; i<arr.length; i++)  
		    {
		    	if(arr[i]==x)
		    	{ c+=1;
		    	  
		    		
		    	}
		    	else if(arr[i]>x)
		    	{ a+=1;
		    	
		    	}
		    	else
		    	{ b+=1;
		    	}
		    }
		    System.out.println(c+" "+"numbers are equal to given number");
		    System.out.println(a+" "+"numbers are greater than given number");
		    System.out.println(b+" "+"numbers are less than given number");
	
		    
	}

}
