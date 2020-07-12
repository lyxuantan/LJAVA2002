package com.tan.baitapbuoi4;

import java.util.Scanner;

public class GrabCar extends TaiXe{
	private long luongCung;
	private double soGioChay;
	private String loaiGio;
	private long LUONG_GIO_CAO_DIEM =20000;
	private long LUONG_GIO_THAP_DIEM=10000;
	
	
	
	
	public GrabCar(String tenTaiXe, long luong) {
		super(tenTaiXe, luong);
	
	}
	
	public GrabCar() {
		
	}


	
	public String getLoaiGio() {
		return loaiGio;
	}
	public void setLoaiGio(String loaiGio) {
		this.loaiGio = loaiGio;
	}
	public double getSoGioChay() {
		return soGioChay;
	}
	public void setSoGioChay(double soGioChay) {
		this.soGioChay = soGioChay;
	}
	
	public long getLuongCung() {
		return luongCung;
	}
	public void setLuongCung(long luongCung) {
		this.luongCung = luongCung;
	}


	
	
	@Override
	public void tingLuong() {
		if(loaiGio.equalsIgnoreCase("Cao điểm")) {
			luong = (long) (LUONG_GIO_CAO_DIEM*soGioChay+this.luongCung);
		}else if(loaiGio.equalsIgnoreCase("Thấp điểm"))
		{
			luong = (long) (LUONG_GIO_THAP_DIEM*soGioChay+this.luongCung);
		}
		
		System.out.println(luong);
		
		
	}
	@Override
	public String toString() {
		
		return super.toString()+ ", lương cứng: " +this.luongCung+ "số giờ chạy "+this.soGioChay+" Loại giờ "+this.loaiGio;
		
	}
	
	@Override
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("Nhập lương cứng");
		luongCung = sc.nextLong();
		System.out.println("Nhập số giờ chạy");
		soGioChay=sc.nextDouble();
		while(true) {
		System.out.println("Nhập loại giờ (Cao điểm)-(Thấp Điểm)");
		loaiGio=sc.nextLine();
		if(loaiGio.equalsIgnoreCase("Cao điểm")||loaiGio.equalsIgnoreCase("Thấp điểm")) 
			break;
	
			
			
		
			
		}
	
		
	}

}
