public class Perpustakaan
{
	private String id;
	private String peminjam;
	private String judul;

	
	public String getJudul()
	{
		return judul;
	}

	private static Integer jumlah;
	public static Integer getJumlah()
	{
		return jumlah;
	
	}
	
public static void setJumlah(Integer jumlah)
{
	Perpustakaan.jumlah = jumlah;
}
	

	public void setJudul(String judul)
	{
		this.judul = judul;
	}
	public String getPeminjam()
	{
		return peminjam;
	}
	public void setPeminjam(String peminjam)
	{
		this.peminjam = peminjam;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	
}
