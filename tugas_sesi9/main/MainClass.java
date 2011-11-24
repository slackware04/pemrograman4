package main;

import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

import java.util.*;
import java.io.*;

public class MainClass {
	public static void main(String[] args) throws IOException{
		
		String var1, var2, var3;		
		String operatornya;

		CalculatorService service = new CalculatorServiceImpl();

		//bilangan1		
		System.out.println("Masukkan bilangan 1:");
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);
		var1 = in.readLine();
		int nilai1 = Integer.parseInt(var1);
		
		//bilangan2
		System.out.println("Masukkan bilangan 2:");
		InputStreamReader converter2 = new InputStreamReader(System.in);
		BufferedReader in2 = new BufferedReader(converter2);
		var2 = in2.readLine();
		int nilai2 = Integer.parseInt(var2);

		//operator
		System.out.println("Masukkan operatornya:");		
		System.out.println("KETERANGAN:");	
		System.out.println("1 = tambah:");	
		System.out.println("2 = kurang:");	
		System.out.println("3 = kali:");	
		System.out.println("4 = bagi:");	
		InputStreamReader converter3 = new InputStreamReader(System.in);
		BufferedReader in3 = new BufferedReader(converter3);
		
//System.out.println(nilai1);


		var3 = in3.readLine();
		int x= Integer.parseInt(var3);
		switch(x)
		{
			case 1 :
		
				Integer a = service.tambah(nilai1, nilai2);
				System.out.println("Output");
				System.out.println("Hasil tambah : " + a);
				break;

			case 2 :
		
				Integer b = service.kurang(nilai1, nilai2);
				System.out.println("Output");
				System.out.println("hasil kurang : " + b);
				break;	

			case 3 :
		
				Integer c = service.kali(nilai1, nilai2);
				System.out.println("Output");
				System.out.println("Hasil kali : " + c);
				break;	

			case 4 :
		
				Integer d = service.bagi(nilai1, nilai2);
				System.out.println("Output");
				System.out.println("Hasil bagi : " + d);
				break;	
			default :
		
				System.out.println("KAGA ADA,GOBLOK...!!");

		}
}	
}
