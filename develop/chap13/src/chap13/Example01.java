package chap13;


import java.util.HashSet;
import java.util.Iterator;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cat=new HashSet<>();
		for(int i=0;i<300;i++) {
			cat.add("a");
			for(int j=100;1<j;j--) {
				cat.add("b");
			}
		}
		

		System.out.println(cat);
		Iterator iter=cat.iterator();
		System.out.println(iter);
		String[] array = new String[cat.size()];
		cat.toArray(array);
		
		for(int i=0;i<cat.size();i++) {
			System.out.println(array[i]);
		}
		

	}

}