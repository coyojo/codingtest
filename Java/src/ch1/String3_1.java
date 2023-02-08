package ch1;
//문장 속 가장 긴 단어찾기  - indexOf() subString()활용

import java.util.Scanner;

public class String3_1 {
	public String solution(String str) {
		String answer="";
		int m =Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(' '))!=-1) { // 띄어쓰기의 위치를 리턴 --> pos에 담는다
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len>m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		String3_1 T = new String3_1();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));

	}

	}
