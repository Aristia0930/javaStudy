package chap12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.Date;



public class Exampl02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =new File("gugudan.txt");
		File file2 =new File("gugudan2.txt");
		try {
			
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("파일경로" +file.getAbsolutePath());}
		else {
			FileInputStream fis=new FileInputStream(file);
			int i=0;
			FileOutputStream fos =new FileOutputStream(file2,true);
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
				fos.write(i);
				
		
			
				
			}
			fos.close();
			fis.close();
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
		//파일안에 작성하도록 하는 객체 연결
		FileOutputStream fos =new FileOutputStream(file);
		for(int i=1; i<10;i++) {
			for(int j=1; j<10;j++) {
				String str =i+"x"+j+"="+(i*j)+"\n";
				byte[] b=str.getBytes();
				fos.write(b);
			}
			Date date =new Date();
			String s= date.toString()+"\n";
			byte[] sr=s.getBytes();
			fos.write(sr);
			
		}


		System.out.println("파일쓰기 성공");
		fos.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("오류");
		}

	}

}
