package ch1;

import java.util.Scanner;

//1. �׳� for������ ���
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
        // next()�� �ܼ�â���� ���ڿ� �ϳ��� �д´�.
        
        char c = kb.next().charAt(0); 
        // next()�� ���ڿ� ��ü �� String�� ��ȯ�ϴµ� �츮�� �ʿ��� ���� ���� �ϳ��̹Ƿ� charAt()�� �ʿ��ϴ�!
        
        System.out.println(T.solution(str,c));
        
	}
}
