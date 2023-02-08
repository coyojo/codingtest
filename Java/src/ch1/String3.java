package ch1;

import java.util.Scanner;

// 문장 속 가장 긴 단어 출력하기 (split 활용)
public class String3 {
	public String solution(String str) {
		String answer = ""; // answser에는 문장 속 가장 긴 단어를 담을 것
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" "); // 문장내에서 띄어쓰기로 단어를 구분해서 배열에 담겠다는 뜻
		for(String x : s) {
			int len = x.length();
			if(len>m) {
				m=len; //len이 최소값인 m보다 크면 m에 len을 대입 
				answer=x; //len이 최소값인 m보다 크면 answer에 x를 대입 
			}
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		String3 T = new String3();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); // 한 줄을 모두 입력 받아야 하므로 nextLine()으로 해야한다.
		System.out.println(T.solution(str));
	}

}
