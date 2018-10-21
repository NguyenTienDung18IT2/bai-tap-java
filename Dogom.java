package dogom;

import java.awt.RenderingHints.Key;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Dogom {
		Vector list = new Vector();
		public Dogom () {
			while(true) {
				System.out.println(" Quan li do gom :");
				System.out.println("1. Nhap do gom :");
				System.out.println("2. Xem do gom :");
				int n;
				Scanner key = new Scanner(System.in);
				System.out.println("Moi ban chon chuc nang:");
				n = key.nextInt();
				switch(n) {
					case 1: NhapTT();
						break;
					case 2: InTT();
						break;
				}
			}
	   }
		public void NhapTT() {
			Scanner key = new Scanner(System.in);
			int n;
			System.out.println("Nhap so luong do gom =");
			n =Integer.parseInt(key.nextLine());
			for(int i=0;i<n;i++) {
				System.out.println("Nhap ten do gom =");
				String tendogom =key.nextLine();
				System.out.println("Nam san xuat =");
				SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
				String namSX=key.nextLine();	
				System.out.println("Nhap ma san pham =");
				String masp =key.nextLine();
				System.out.println("Nhap mau sac =");
				String mausac=key.nextLine();
				System.out.println("Nhap so luong =");
				int soluong=Integer.parseInt(key.nextLine());
				System.out.println("Nhap gia tien =");
				double giatien= Double.parseDouble(key.nextLine());
				Quanlidogom b = new Quanlidogom(tendogom,namSX,masp,mausac,soluong,giatien);
				list.add(b);
			}
}
			public void InTT() {
				Enumeration dogomn = list.elements();
				int i=1;
				while(dogomn.hasMoreElements()) {
					Quanlidogom dogom = (Quanlidogom)dogomn.nextElement();
					System.out.println("Ma san pham ="+dogom.getMasp()+" va ten do gom "+dogom.getTendogom());
				}
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				new Dogom();
			}
}
