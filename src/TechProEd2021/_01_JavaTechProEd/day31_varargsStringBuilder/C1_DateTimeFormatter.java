package TechProEd2021._01_JavaTechProEd.day31_varargsStringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {
		
		
		
		LocalDateTime Idt=LocalDateTime.now();
		System.out.println(Idt);    //2021-03-20T17:11:07.852703 �al��t�rd�k�a son saati verir.

		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		System.out.println(dtf.format(Idt));   //21/Mart/20 05:15
		
		/*
		 * yy: YILIN SON �K� RAKAMI
		 * yyyy : y�l�n tamam�n�
		 * M : ay s�ras�n� verir mart i�in : 3 
		 *  MM:  ay s�ras�n� veriri mart i�in : 03
		 *  MMM . ay isminin ilkuc harf�n� ver�r.
		 *  MMMM : ay isminin tamam�n� verir
		 */
		
		
		DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("yy/MMM/dd");
		System.out.println(dtf2.format(Idt)); //21/Mar/20
		
		DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("HH:mm");  //17:23 24 LUK S�STEME G�RE
		DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("hh:mm");  //05:23 PM/AM S�STEM�NE G�RE
		System.out.println(dtf3.format(Idt)); 
		System.out.println(dtf4.format(Idt));
		
		
		
		// ka� ya��nda oldugunu hesap etmek i�in 
		
		LocalDate dogumTarihi= LocalDate.of(1986, 06, 13);
		LocalDate bugun = LocalDate.now();
		
		Period benimYasim= Period.between(dogumTarihi, bugun); //P-34Y-9M-7D
		 System.out.println(benimYasim);
		
		int yas=Period.between(dogumTarihi, bugun).getYears(); // 34 sadece y�l verir
		System.out.println(yas);
		
	}

}
