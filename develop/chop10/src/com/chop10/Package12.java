package com.chop10;
import java.text.*;
import java.util.Date;

public class Package12 {

    public static void main(String[] args) {
        // 현재 날짜 가져오기
        Date date = new Date();
        
        // SimpleDateFormat 객체 생성
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddyyyyMssmmhh");
        
        // 날짜를 문자열로 변환하여 출력
        String formattedDate = dateFormat.format(date);
        System.out.println("현재 날짜의 포맷된 문자열: " + formattedDate);
        Date parsedDate;
		try {
			parsedDate = dateFormat.parse(formattedDate);
			System.out.println(parsedDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

    }
}