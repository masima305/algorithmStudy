import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		int max_temp = 0;
		int road_count = scanner.nextInt();
		int [] road_list = new int [road_count]; 		
		
		road_list[0] = scanner.nextInt();
		for (int i = 1; i < road_list.length; i++) {
			road_list[i] = scanner.nextInt();
			if (road_list[i] > road_list[i-1]){ //���������� ũ�� ��������.
				max_temp += road_list[i]-road_list[i-1];
			}else{ //���ų� ������
				if (max < max_temp){
					max = max_temp;
				}
				max_temp = 0;
			}
		}
		System.out.println(max);
	}
}