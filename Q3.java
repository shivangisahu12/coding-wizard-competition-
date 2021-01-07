package coding_wizard;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			int no[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
			String roman[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
			System.out.println("Enter the decimal number:");
			int num = sc.nextInt();
			String rno = "";
			int j = 0;
			for (int i : no) {
				while (num >= i) {
					rno += roman[j];
					num -= i;
				}
				++j;
			}
			System.out.println("Roman Numeral:" + rno);
	}

}
