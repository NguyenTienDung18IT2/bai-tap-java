package dogom;

import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Quanlidogom {
	 String tendogom;
	   String namSX;
	   String masp;
	   String mausac;
	   int soluong;
	   double giatien;
public String getTendogom() {
		return tendogom;
	}
	public void setTendogom(String tendogom) {
		this.tendogom = tendogom;
	}
	public String getNamSX() {
		return namSX;
	}
	public void setNamSX(String namSX) {
		this.namSX = namSX;
	}
	public String getMasp() {
		return masp;
	}
	public void setMasp(String masp) {
		this.masp = masp;
	}
	public String getMausac() {
		return mausac;
	}
	public void setMausac(String mausac) {
		this.mausac = mausac;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public double getGiatien() {
		return giatien;
	}
	public void setGiatien(double giatien) {
		this.giatien = giatien;
	}
public  Quanlidogom() {
		
	}
   public Quanlidogom(String tendogom , String namSX , String masp , String mausac , int soluong , double giatien ) {
		  this.tendogom = tendogom ;
		  this.namSX = namSX ;
		  this.masp = masp;
		  this.mausac = mausac;
		  this.soluong = soluong;
		  this.giatien = giatien;
	  }
    }
