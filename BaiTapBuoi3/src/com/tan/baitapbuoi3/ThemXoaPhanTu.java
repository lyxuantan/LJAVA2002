package com.tan.baitapbuoi3;

import java.util.Arrays;

public class ThemXoaPhanTu {

	public static void main(String[] args) {
		
		int[] arr = {90,90,20,27,35,22,10,8,8};
		int n=arr.length;
		int i;
		System.out.println("Mảng ban đầu:\n"+Arrays.toString(arr));
		int x =100;
		arr=add(n, arr, x);
		System.out.println("\nMang sau khi chèn: "+Arrays.toString(arr));
		
		
		
		System.out.println("Mảng sau khi xóa "+Arrays.toString(arr));
		
		n= remove(arr, n);
		System.out.println("Mảng sau khi xóa phần tử trùng nhau");
		for( i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
	
		
		
	}
	
	
		
	


	public static int[] add(int n, int arr[], int x) 
	    { 
	        int i; 
	  
	        // create a new array of size n+1 
	        int newarr[] = new int[n + 1]; 
	  
	     
	        for (i = 3; i <= n; i++) 
	            newarr[i] = arr[i-1]; 
	        
	        
	        newarr[0] = arr[0];
	        newarr[1] = arr[1];
	        newarr[2] = x; 
	  
	        return newarr; 
	    } 

	 public static int remove(int arr[],int n)
	 {
		 if(n==0||n==1)
			 
		return n;
		 int[] temp = new int[n];
		 
		 int j=0;
		 for(int i=0;i<n-1;i++)
			 if(arr[i] != arr[i+1])
				 temp[j++] = arr[i];
		 temp[j++] = arr[n-1];
		 for(int i=0;i<j;i++)
			 arr[i] = temp[i];
		 return j;
		 
	 }
	 
		
	
	

}
