import javax.swing.JOptionPane;

public class MainPengiriman extends Paket
{
	public MainPengiriman()
	{
	
	}

	public static void main(String[] args)
	{
		MainPengiriman ellie = new MainPengiriman();
		String nmPengirim = JOptionPane.showInputDialog("Biaya Pengiriman Paket" + "\n Inputkan Nama Pengirim");
		ellie.setNmPengirim(nmPengirim);

		String tujuanPaket = JOptionPane.showInputDialog("Biaya Pengiriman Paket" + "\n Inputkan Tujuan Paket : Bali | Surabaya | Jakarta | Bandung");
		ellie.setTujuanPaket(tujuanPaket);
	
		String br = JOptionPane.showInputDialog("Biaya Pengiriman Paket" + "\n Inputkan Berat Paket");

		int beratPaket = Integer.parseInt(br);
	
		ellie.setBeratPaket(beratPaket);
		ellie.biayaPerKg();
		ellie.Bayar();
	
		JOptionPane.showMessageDialog(null, "Biaya Pengiriman Paket Adalah" + "\n Nama Pengirim : " + ellie.getNmPengirim() + "\n Tujuan Paket : " + ellie.getTujuanPaket() + "\n Berat Paket : " + ellie.getBeratPaket() + "Kg" + "\n Biaya Per Kg : " + ellie.biayaPerKg() + "\n Total Bayar : " + ellie.Bayar() + "\n Terima Kasih");
	}
}
