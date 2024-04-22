package problem;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="qjnwezgrpirldywt";
		String ans="";
		
		int q=3;
		int r=1;
		
		for(int i=r;i<str.length();i+=q){
			char str2= str.charAt(i);
			System.out.println(str2);
			ans+=str2;
			
		}
		System.out.println(ans);
	}

}
