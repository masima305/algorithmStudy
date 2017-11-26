import java.util.Scanner;

public class studyClass {
	
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
	static void prob2846_unsolved(){
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		int road_count = scanner.nextInt();
		int incline_start = 0;
		int incline_end = 0;

		for (int i = 0; i < road_count; i++) {
			int temp = scanner.nextInt();
			if (incline_start == 0 ){
				incline_start = temp;
			}
			else{
				if ( temp < incline_start || temp == incline_end){
					int temp_max = incline_end - incline_start;

					if (max < temp_max){
						max = temp_max;
					}
					incline_start = temp;
					incline_end = temp;
				}else if(incline_start < temp){
					incline_end = temp;
					int temp_max = incline_end - incline_start;

					if (max < temp_max){
						max = temp_max;
					}
				}
			}
			System.out.println("===================="+i+"=====================");
			System.out.println("max : "+max);
			System.out.println("temp :"+temp);
			System.out.println("incl_start :"+incline_start);
			System.out.println("incl_end :"+incline_end);
		} 
		System.out.println(max);

		/*10
		12 20 1 3 4 4 11 11 14 1
		11
		1 2 2 3 4 5 5 6 7 8 9
		9
		10 9 9 8 8 7 7 6 6
		9
		10 10 10 10 10 10 10 10 10
		*/
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
