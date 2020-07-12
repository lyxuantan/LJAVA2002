package com.tan.baitapbuoi4;

import java.util.Scanner;

public class GrabBike extends TaiXe{
	public GrabBike(String tenTaiXe, long luong) {
		super(tenTaiXe, luong);
	
	}
	public GrabBike() {
		
	}
	public int getSoCuoc() {
		return soCuoc;
	}
	public void setSoCuoc(int soCuoc) {
		this.soCuoc = soCuoc;
	}
	private int soCuoc;
	private static long SO_TIEN_MOT_QUOC = 30000;
	@Override
	public void tingLuong() {
		luong = soCuoc*SO_TIEN_MOT_QUOC;
		System.out.println(luong);
		
	}
	@Override
	public String toString() {
		
		return super.toString() +" Số cuốc: "+this.soCuoc;
	}
	@Override
	public void nhapThongTin() {
		
		super.nhapThongTin();
		System.out.println("Nhập số cuốc");
		soCuoc=new Scanner(System.in).nextInt();
	}
	

}
