package vn.t3h.ls3;

import java.util.Arrays;

public class StaticArray {

	public static void main(String[] args) {
		createArray();
		copyArray();
		timSoKhuyet();
		soSanh2Mang();
		timMaxMin();

	}
	
	
	static int max;
	static int min;
	public static void timMaxMin() {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,100,200};
		max = arr1[0];
		min = arr1[0];
		for(int i=1; i< arr1.length;i++)
		{
			
				if(arr1[i]>max)
				max = arr1[i];
			
			
		}
		System.out.println("Max :"+max);
		
	}



	public static void soSanh2Mang() {
		int[] arr1 = {1,2,3,4,5,6,8,9,10};
		int[] arr2 = {1,2,3,4,5,6,8,9,11};
		int[] arr3 = {1,2,3,4,5,6,8,9,10};
		startSoSanh(arr1, arr2);
		startSoSanh(arr1, arr3);
		startSoSanh(arr2, arr3);
		
	}
	public static void startSoSanh(int [] arr1,int[] arr2) {
		if(arr1.length != arr2.length) {
			System.out.println("2 Array Không bằng nhau");
		} else {
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i] != arr2[i])
				{
					System.out.println("2 Array không bằng nhau");
					return;
				}
			}
		}
		System.out.println("2 Array bằng nhau");
	}


	public static void copyArray() {
		int[] arr1 = { 1,120,100,30,50};
		int [] arr2 =new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i] = arr2[i];
		}
		
	}
	public static void createArray() {
		int[] arr1 = {1,120,100,30,50};
		
		System.out.println("In mảng đã tạo : "+Arrays.toString(arr1));
		System.out.println("In ra vị trí đầu mảng "+arr1[0]);
		System.out.println("In ra vị trí cuối mảng "+arr1[arr1.length-1]);
	}
	public static void timSoKhuyet()
	{
		int []arr = {1,2,3,4,5,6,8,9,10,11,12,13,14,15};
		int tongSoTuNhien = 15*(15+1)/2;
		int tongPhanTuTrongMang = 0;
		for(int j=0;j<arr.length;j++)
		{
			tongPhanTuTrongMang += arr[j];
		}
		int soKhuyet = tongSoTuNhien - tongPhanTuTrongMang;
		System.out.println("So khuyet = "+soKhuyet);
		
				
	
		
		
		
		
		
	}

}
