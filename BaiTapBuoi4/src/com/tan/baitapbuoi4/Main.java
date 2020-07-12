package com.tan.baitapbuoi4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int soGrabCar,soGrabBike;
		Scanner sc= new Scanner(System.in);
		
		TaiXe taiXe;
		ArrayList<TaiXe> arr= new ArrayList<TaiXe>();
		System.out.println("Nhập số GrabCar");
		soGrabCar = sc.nextInt();
		System.out.println("Nhập thông tin Tài xế BrabCar");
		for(int i=0;i< soGrabCar;i++)
		{
			taiXe = new GrabCar();
			taiXe.nhapThongTin();
			arr.add(taiXe);
			
			
		}
		System.out.println("Nhập số GrabBike");
		soGrabBike=sc.nextInt();
	
		
		System.out.println("Nhập thông tin tài xế GrabBike");
		for(int i=0;i<soGrabBike;i++)
		{
			taiXe = new GrabBike();
			taiXe.nhapThongTin();
			arr.add(taiXe);
		}
		System.out.println("THÔNG TIN LƯƠNG TÀI XẾ");
		for(TaiXe tx : arr)
		{
			
			System.out.println(tx.toString());
			System.out.println("Lương ");
			tx.tingLuong();
			
		}

	}

}
