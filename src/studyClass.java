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
//		첫째 줄에는 별 2*N-1개, 둘째 줄에는 별 2*N-3개, ..., N번째 줄에는 별 1개를 찍는 문제
//
//		별은 가운데를 기준으로 대칭이어야 한다.
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
			if (road_list[i] > road_list[i-1]){ //전에꺼보다 크면 오르막길.
				max_temp += road_list[i]-road_list[i-1];
				if (max < max_temp){
					max = max_temp;
				}
			}else{ //같거나 적으면
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
		// 개를 출력한다.
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
		 * ACM-ICPC 인터넷 예선, Regional, 그리고 World Finals까지 이미 2회씩 진출해버린 
		 * kriii는 미련을 버리지 못하고 왠지 모르게 올 해에도 파주 World Finals 준비 캠프에 참여했다.
		 * 대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.
		 * 두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
		 */
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
	}
	static void prob11718 (){
		/*
		 *입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
		 *각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
		 */
		Scanner s = new Scanner(System.in);
		String b;
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
		}	
	}
	static void test2(int m){
		/*
		 * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
		 * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
		 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 
		 * 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 
		 * 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
		 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
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
