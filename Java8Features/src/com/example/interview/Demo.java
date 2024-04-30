package com.example.interview;

public class Demo {
public static void main(String[] args) {
	
	
	int arr[] = {15, 18,10 , 121};

			for(int  j =0; j<= arr.length-1 ; j++){
	          for(int i =0; i<= arr.length-2; i++){
	    
	          if( arr[i]  < arr[i+1]){     
	                 int k = arr[i];         // j = 15
	                arr[i] = arr[i+1];       // arr[0] = 18
	                arr[i+1] =k ;            // arr[1] = 15
	                          
	           } 

	          }
	}
  System.out.println(arr[1]);
}
}
