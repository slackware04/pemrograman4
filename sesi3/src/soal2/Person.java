public class Person
{
	private String nama; //deklarasi variable
	public static void main(String[] args)
	{
		Person test; //deklarasi variable
		test = new Person(); //inisiasi variable
		test.setNama("andi"); //memanggil void setNama denga parameter "andi"
		byte b = 100; //inisiasi variable
		short s = 100; //inisiasi variable

		Person belajarVariabel = test; //inisiasi variable
		belajarVariabel.setNama("belajar variabel"); //set variabel "belajarVariabel" dengan nilai = belajar variabel

		System.out.println(b + s); //100 + 100
		System.out.println("nama : " + test.getNama() + " " + b); //menampilkan nama : andi 100
		
	}
	
	public void setNama(String aNama)
	{
		this.nama = aNama; //set variabel nama dengan parameter aNama
	}
	public String getNama()
	{
		return this.nama; //mengembalikan nilai variabel nama
	}

}
