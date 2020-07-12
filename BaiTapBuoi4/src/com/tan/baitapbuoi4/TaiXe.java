package com.tan.baitapbuoi4;

import java.util.Scanner;

public abstract class TaiXe {
	private String tenTaiXe;
	protected long luong;
	
	
	public TaiXe() {
		super();
	}

	public TaiXe(String tenTaiXe, long luong) {
		super();
		this.tenTaiXe = tenTaiXe;
	
	}

	public String getTenTaiXe() {
		return tenTaiXe;
	}

	public void setTenTaiXe(String tenTaiXe) {
		this.tenTaiXe = tenTaiXe;
	}
	public void nhapThongTin()
	{
		System.out.println("Nhập tên tài xế");
		tenTaiXe=new Scanner(System.in).nextLine();
	}
	

	

	public abstract void tingLuong();
	public String toString()
	{
		return "Tên Tài Xế :" +this.tenTaiXe;
	}
}
