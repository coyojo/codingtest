package ch1;

import java.util.Scanner;

//대소문자 변환 
public class String2 {
	
	public String solution(String str) {
		String answer = ""; //answer에 대소문자 바꾼 값을 저장할것임
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			}else {
				answer += Character.toLowerCase(x);
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		String2 T = new String2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));

	}

}
