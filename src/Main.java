import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//prob 2588
		// 스케너 문제가 있음...
		Scanner scanner = new Scanner(System.in);
		int r,c,zr,zc;
		
		r = scanner.nextInt();
		c = scanner.nextInt();
		zr = scanner.nextInt();
		zc = scanner.nextInt();
		scanner.next();
		scanner.close();
		Scanner scanner2 = new Scanner(System.in);
		
		
		int row_count = 0;
		String alph_comp [] = new String [r*zr];
		
		for (int m = 0; m < r; m++) {
			String alph_temp = scanner2.nextLine();
			System.out.println(alph_temp);
			
			char converted_temp [] = new char [c*zc];
		
			for (int i = 0; i < c; i++) {
				char splited_temp []= alph_temp.toCharArray();
				
				
				int count = 0;
				for (int j = 0; j < splited_temp.length; j++) {
					for (int k = 0; k < zc; k++) {
						converted_temp[count] = splited_temp[j];
						count++;
					}
				}
			}
			String ab = String.valueOf(converted_temp);
			for (int i = 0; i < zr; i++) {
				alph_comp[row_count] = ab;
				row_count++;
			}
		}
		scanner2.close();
		for (int i = 0; i < alph_comp.length; i++) {
			System.out.println(alph_comp[i]);
		}
	}
	
}