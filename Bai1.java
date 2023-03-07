import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
	//a,
		int a, b;
		Scanner cd = new Scanner(System.in);
		System.out.println("Nhap so a:");
		a = cd.nextInt();
		System.out.println("Nhap so b:");
		b = cd.nextInt();
		int Tong = a + b;
		System.out.println("Tong =" + Tong);
		int Hieu = a - b;
		System.out.println("Hieu =" + Hieu);
		int Tich = a * b;
		System.out.println("Tich =" + Tich);
		float Thuong = (float) a / b;
		System.out.println("Thuong =" + Thuong);
		int SoDu = a % b;
		System.out.println("SoDu =" + SoDu);
//b,
		System.out.println(a +"="+b+" : " +(a==b));
		System.out.println(a +"!="+b+" : " +(a!=b));
		System.out.println(a +">"+b+" : " +(a>b));
		System.out.println(a +">="+b+" : " +(a>=b));
		System.out.println(a +"<"+b+" : " +(a<b));
		System.out.println(a +"<"+b+" : " +(a<=b));
	}
}
