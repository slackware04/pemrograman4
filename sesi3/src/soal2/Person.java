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
		belajarVariabel.setNama("belajar variabel"); //

		System.out.println(b + s);
		System.out.println("nama : " + test.getNama() + " " + b);
		
	}
	
	public void setNama(String aNama)
	{
		this.nama = aNama;
	}
	public String getNama()
	{
		return this.nama;
	}

}
