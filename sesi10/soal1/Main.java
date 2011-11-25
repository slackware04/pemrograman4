class Main
{

	public static void main(String[] args)
	{
		Santapan s = new Santapan();
		Makanan ma = new Makanan();
		Minuman mi = new Minuman();
		Camilan ce = new Camilan();

		s.cerna(ma);
		s.cerna(mi);
		s.cerna(ce);
	}
}
