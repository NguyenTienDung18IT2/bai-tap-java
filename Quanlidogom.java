package dogom;

import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Quanlidogom {
	 String tendogom;
	   String namSX;
	   String masp;
	   int soluong;
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
		this.masp =masp;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
public  Quanlidogom() {
		
	}
   public Quanlidogom(String tendogom , String namSX , String masp , int soluong ) {
		  this.tendogom = tendogom ;
		  this.namSX = namSX ;
		  this.masp = masp;
		  this.soluong = soluong;
	  }
    }
