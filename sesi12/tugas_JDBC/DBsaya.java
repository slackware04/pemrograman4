//package sql
import java.sql.*;
import javax.sql.*;

//package csv
import java.io.*;
import java.util.*;


public class DBsaya
{

	public static void MYSQL_DB()
	{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/javaDB","root","");
			

				String mySQL = "SELECT * FROM tesDB";
				//String mySQL = "CREATE TABLE testabel(a char(9))";
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(mySQL);
			

				while (rs.next())
				{
				
				System.out.println(rs.getString("Nama") + "\t" + rs.getFloat("NPM"));
				}
			}

			catch (Exception e)
			{

				System.out.println("error");
			}

	}



	public static void CSV_DB()
	{
		
		File file = new File("JavaDB.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;

		List<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
		
		try
		{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			int count = 0;
			while(dis.available() != 0)
			{

				String line = dis.readLine();
				String[] data = line.split(",");

				count ++;
				Mahasiswa p = new Mahasiswa();
				
				p.setNPM(data[0]);
				p.setNama(data[1]);
				

				listMahasiswa.add(p);
				
			}

		}
		catch (IOException ex)
		{
			System.out.println("File " + file.getName() + " tidak ketemu...!");
			System.out.println("Exception : " + ex.getMessage());
		}

		for (Mahasiswa perpus : listMahasiswa)
		{
			System.out.println("====================");
			System.out.println("ID : " + perpus.getNPM());
			System.out.println("Penyewa : " + perpus.getNama());


		}
	}


public static void Main_Menu()
{
String var1, var2, var3;
	try
		{
			System.out.println("Masukkan Nama mahasiswa :");
			InputStreamReader converterNama = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(converterNama);
			var1 = in.readLine();
			//int nilai1 = Integer.parseInt(var1);	

			System.out.println("Masukkan NPM mahasiswa :");
			InputStreamReader converterNPM = new InputStreamReader(System.in);
			BufferedReader in2 = new BufferedReader(converterNPM);
			var2 = in2.readLine();
		}

		catch (IOException ex)
		{

		}
		

		System.out.println("Masukkan operatornya:");		
		System.out.println("KETERANGAN:");	
		System.out.println("1 = Database MySQL");	
		System.out.println("2 = Database CSV");	

		InputStreamReader converter3 = new InputStreamReader(System.in);
		BufferedReader in3 = new BufferedReader(converter3);

		try
		{
			var3 = in3.readLine();
			int x= Integer.parseInt(var3);


			switch(x)
			{
				case 1 :
					MYSQL_DB();
			
					break;

				case 2 :
	
					CSV_DB();
					break;	

	
				default :
	
					System.out.println("KAGA ADA,GOBLOK...!!");

			}
		}
		catch (IOException ex)
		{

		}



}		



	


	public static void main(String[] args)
	{

		
		static String lanjut = "Y";
		//String var9 = "Y";
		
			Main_Menu();
			while (lanjut == "Y") 
				{
					try
					{	
						System.out.println("Apakah anda ingin lanjut?");
						InputStreamReader converter3 = new InputStreamReader(System.in);
						BufferedReader in3 = new BufferedReader(converter3);
						lanjut = in3.readLine();
						//lanjut = String.parseString(var9);
						
				
						//System.out.println("1234");
						Main_Menu();
						System.out.println(lanjut);
						this.lanjut = lanjut;
				
					}
					catch (IOException ex)
					{
						
					}
				}
		

	
	
	}

}
