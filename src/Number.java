import java.util.*;

public class Number {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String resp = "";
		
		do {
			System.out.print("Do you want to convert a decimal [d] or binary [b] number? ");
			resp = sc.next();
			System.out.println();
		} while (!resp.equals("d") && !resp.equals("b"));
		
		System.out.print("Number to convert: ");
		String str = sc.next();
		
		if (resp.equals("d")) { // dec to bin
			long num = sc.nextLong();
			String bin = "";
			
			while (num > 0) {
				bin = Long.toString(num % 2) + bin;
				num = num / 2;
			}
			
			System.out.println("Binary representation: " + bin);
			
		} else { // bin to dec
			long sum = 0;
			
			StringBuilder sb = new StringBuilder(str);
			char[] charArray = sb.reverse().toString().toCharArray();
			
			for (int p = 0; p < charArray.length; p++) {
				if (charArray[p] == '1') {
					sum += (long)Math.pow(2, p);
				}
			}
			
			System.out.println("Decimal representation: " + sum);
		}
		
		sc.close();
	}
}