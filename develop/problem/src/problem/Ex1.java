package problem;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans ="";
		String code = "abc1abc1abc";
		
		int mode = 0;
		for (int i=0;i<code.length(); i++) {

			
			if (mode==0 && i%2==0 && code.charAt(i)!='1') {
				ans+=code.charAt(i);
			}
			else if (mode==0 && code.charAt(i)=='1') {
				mode=1;
			}
			else if (mode==1 && i%2!=0 &&  code.charAt(i)!='1') {
				ans+=code.charAt(i);
			}
			else if (mode==1 && code.charAt(i)=='1') {
				mode=0;
			}

		}
		
		System.out.println(ans);

	}

}
