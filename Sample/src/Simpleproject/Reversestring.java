package Simpleproject;

public class Reversestring {

	public static void main(String[] args) {
	
		String str="Hello java";
		char[] chars=str.toCharArray();
		int length=chars.length;
		for(int i=length-1;i>=0;i--)
		{
			System.out.println(chars[i]);
			
		}
			

	}

}
