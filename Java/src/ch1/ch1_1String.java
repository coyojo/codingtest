package ch1;

import java.util.Scanner;

//1. 그냥 for문쓰는 방법
public class ch1_1String {
	public int solution(String str, char t) {
    	int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        
        for(int i=0; i<str.length(); i++){
        	if( str.charAt(i) == t ) answer++;
            }
            return answer;
        
    	}




	public static void main(String[] args){
		ch1_1String T = new  ch1_1String();
    	Scanner kb = new Scanner(System.in);
        String str = kb.next(); 
        // next()는 콘솔창에서 문자열 하나를 읽는다.
        
        char c = kb.next().charAt(0); 
        // next()는 문자열 전체 즉 String을 반환하는데 우리가 필요한 것은 문자 하나이므로 charAt()이 필요하다!
        
        System.out.println(T.solution(str,c));
        
	}
}
