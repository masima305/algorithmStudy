import java.util.Scanner;

public class studyClass {
	
	
	
	static void prob2588(){

		Scanner scanner = new Scanner(System.in);
		int num_a = scanner.nextInt();
		int num_b = scanner.nextInt();;
		
		int b_100 = num_b/100;
		int b_1 = num_b%10;
		int b_10 = (num_b%100)/10;
	
		System.out.println(num_a*b_1);
		System.out.println(num_a*b_10);
		System.out.println(num_a*b_100);
		System.out.println(num_a*num_b);
	}
	static void prob2443(){
		//prob 2443
//		ù° �ٿ��� �� 2*N-1��, ��° �ٿ��� �� 2*N-3��, ..., N��° �ٿ��� �� 1���� ��� ����
//
//		���� ����� �������� ��Ī�̾�� �Ѵ�.
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 0; i < n ; i++){
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*n-(i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}
	static void prob2847(){
		int count = 0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int stage_list [] = new int[n];
		for(int i = 0; i < n ; i++){
			stage_list[i] = s.nextInt();
		}
		for(int i = 1; i < n ; i++){
			if(stage_list[n-i] <= stage_list[n-i-1]){
				while(true){
					stage_list[n-i-1]--;
					count++;
					if(stage_list[n-i] > stage_list[n-i-1])
						break;
				}
			}
		}
		System.out.println(count);
	}
	static void prob2846(){
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
				if (max < max_temp){
					max = max_temp;
				}
			}else{ //���ų� ������
				if (max < max_temp){
					max = max_temp;
				}
				max_temp = 0;
			}
		}
		System.out.println(max);
	}
	static void prob1001 (){
		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		System.out.println(a-b);
		s.close();
	}
	static void prob7287 (){
		System.out.println(4);
		System.out.println("johnathanlee");
	}
	static void prob9653 (){
		String logo[]={	
				"    8888888888  888    88888 ",
				"   88     88   88 88   88  88 ",
				"    8888  88  88   88  88888 ",
				"       88 88 888888888 88   88 ",
				"88888888  88 88     88 88    888888 ",
				"",
				"88  88  88   888    88888    888888 ",
				"88  88  88  88 88   88  88  88 ",
				"88 8888 88 88   88  88888    8888 ",
				" 888  888 888888888 88  88      88 ",
				"  88  88  88     88 88   88888888"
		};
		for(int i= 0; i < logo.length ; i++){
			System.out.println(logo[i]);
		}
	}
	static void prob10172 (){
		// ���� ����Ѵ�.
		String dog[]={	
				"|\\_/|",
				"|q p|   /}",
				"( 0 )\"\"\"\\",
				"|\"^\"`    |",
				"||_/=\\\\__|"
		};
		for(int i= 0; i < dog.length ; i++){
			System.out.println(dog[i]);
		}
	}
	static void prob10718 (){
		/*
		 * ACM-ICPC ���ͳ� ����, Regional, �׸��� World Finals���� �̹� 2ȸ�� �����ع��� 
		 * kriii�� �̷��� ������ ���ϰ� ���� �𸣰� �� �ؿ��� ���� World Finals �غ� ķ���� �����ߴ�.
		 * ��ȸ�� �� �� �𸣴� ���ڷ� kriii�� ���ؼ� �ݷ��� ������ ���������.
		 * �� �ٿ� ���� "����ģ�� ��������"�� �� �ٿ� �� ���� ����Ѵ�.
		 */
		System.out.println("����ģ�� ��������");
		System.out.println("����ģ�� ��������");
	}
	static void prob11718 (){
		/*
		 *�Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�.
		 *�� ���� 100���ڸ� ���� ������, �� ���� �־����� �ʴ´�. ��, �� ���� �������� �������� �ʰ�, �������� ������ �ʴ´�.
		 */
		Scanner s = new Scanner(System.in);
		String b;
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
		}	
	}
	static void test2(int m){
		/*
		 * ����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�.
		 * �������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
		 * ����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. 
		 * ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 
		 * 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
		 * ����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */

		int i = m;
		int count_5 = 0;
		int count_3 = 0;
		int count_t = -1;
		int rest = 0;

		if (i>=5){
			count_5 += i/5;
			rest = i%5;
		}
		if(rest >= 3){
			count_3= rest/3;
			rest -= count_3*3;
		}
		if (rest <= 2){
			for(int j = count_5 ; j >= 1 ; j-- ){
				if (rest == 0){
					break;
				}
				count_5--;
				rest+=5;
				count_3 += rest/3;
				rest = rest%3;
			}
		}
		if(count_5+count_3!=0 && rest == 0){
			count_t = count_5+count_3;
		}
		System.out.println("*"+i+" count5:"+count_5+" count3:"+count_3+" rest:"+rest+" total:"+count_t);
	}
}
