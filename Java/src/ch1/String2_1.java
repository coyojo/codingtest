package ch1;

import java.util.Scanner;

//String2를 아스키코드 버전으로 풀기!
//아스키 코드 대문자범위 : 65 ~ 90
//아스키 코드 소문자범위 : 97 ~ 122 ( 소문자와 대문자 차이 32 - 소문자에서 32빼면 대문자)
public class String2_1 {
	public String solution(String str) {
		String answer ="";
		for(char x : str.toCharArray()){
			if(x >= 97 && x <= 122) {//x가 소문자이면
				answer += (char)(x-32);
				
			}else {
				answer += (char)(x+32);
			}
		}return answer;
	}

	public static void main(String[] args) {
		String2_1 T = new String2_1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));

	}

}
