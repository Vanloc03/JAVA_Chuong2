import java.time.Year;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		String Ten;
		int NamSinh;
		Scanner dg = new Scanner(System.in);
		System.out.println("Nhap Ten =");
		Ten = dg.next();
		System.out.println("Nhap NamSinh =");
		NamSinh = dg.nextInt();
		int currentYear = Year.now().getValue();
		int age = currentYear - NamSinh;
		if (NamSinh < 16) {
			System.out.println("Ban o do tuoi vi thanh nien");
		} else if (NamSinh >= 16&&NamSinh<18) {
			System.out.println("Ban o do tuoi truong thanh");
		}
		if (NamSinh >= 18)
			System.out.println("Ban da gia");
	}
}
