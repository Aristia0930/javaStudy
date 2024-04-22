package chap06;

public class Array07 {

	public static void main(String[] args) {
		
		String str1="java";
		String str2 ="java";
		String str3 ="javaa";
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		String s1= new String("java");
		String s2= new String("java");
		String s3=s1;
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
	}

}
