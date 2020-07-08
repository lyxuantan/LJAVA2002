package com.tan.baitapbuoi2;

import vn.t3h.ls3.StaticArray;

public class BaiTapBuoi2 {

	public static void main(String[] args) {
		System.out.println("Tổng các số nhỏ hơn 100"); 
		int sum=0;
		for(int i=0;i<100;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("Giai thừa của 10");
		int giaithua=1;
		for(int i=1;i<=10;i++)
		{
			giaithua*=i;
		}
		System.out.println(giaithua);
		

	}

}
