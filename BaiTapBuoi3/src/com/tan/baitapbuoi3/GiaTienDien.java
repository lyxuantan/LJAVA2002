package com.tan.baitapbuoi3;

import java.util.Scanner;

public class GiaTienDien {

	public static void main(String[] args) {
		
		int sodien;
		int tiendien;
		System.out.println("Nhập số hộ thụ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Hộ "+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		System.out.println("Số điện mỗi hộ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Hộ "+(i+1)+":"+arr[i]+"  ");
			
			
		}
		System.out.println("Tổng số tiền 10 hộ");
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=Tien(arr[i]);
		}
		System.out.println(sum);
		
		
	}
	

	public static int Tien(int sodien)
	{
		
		int sotien;
		if(sodien<=50)
		{
			sotien= sodien*1549;
		}
		else if(sodien>50&&sodien<=100)
		{
			sotien=(50*1549)+(sodien-50)*1600;
		}
		else if(sodien>100&&sodien<=200)
		{
			sotien=(50*1549)+(50*1600)+(sodien-100)*1857;
		}
		else if(sodien>200&&sodien<=300)
		{
			sotien=(50*1549)+(50*1600)+(100*1857)+(sodien-200)*2340;
		}
		else if(sodien>300&&sodien<=400)
		{
			sotien=(50*1549)+(50*1600)+(100*1857)+(100*2370)+(sodien-300)*2615;
		}
		else 
			sotien=(50*1549)+(50*1600)+(100*1857)+(100*2370)+(sodien-400)*2701;
		return sotien;
	}

}
