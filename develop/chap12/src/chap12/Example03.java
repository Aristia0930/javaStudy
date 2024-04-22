package chap12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("member.txt");
		
		try {
			if(!file.exists()) {
				file.createNewFile();
			
				}
			else {
				FileWriter fws =new FileWriter(file,true);
				FileReader fiss = new FileReader(file);
				FileReader fis = new FileReader(file);
				BufferedReader br = new BufferedReader(fis);
				int i=0;
				while((i=fiss.read())!=-1) {
					System.out.print((char)i);
					fws.write((char)i);
				}
				String str;
				while((str=br.readLine())!=null) {
					System.out.println(str);
				}
			}
			FileWriter fw =new FileWriter(file,true);
			Scanner input=new Scanner(System.in);
			boolean quit=false;
			
			while (!quit) {
				System.out.print("아이디");
				String userId=input.next();
				fw.write(userId+"\n");
				
				System.out.print("이름");
				String userName=input.next();
				fw.write(userName+"\n");
				
				
				System.out.print("계속진행할거냐 Y/N");
				String ans=input.next();
				if (ans.toUpperCase().equals("N")) {
					quit=true;
				}
			}
			fw.close();
		} catch (Exception e) {
			// TODO): handle exception
			e.getMessage();
		}

	}

}
