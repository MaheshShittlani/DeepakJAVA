class Dominants
{
	public static void main(String ...args)
	{
		int amount=4598;
		
		int tth = amount / 2000;
		amount = amount % 2000;
		
		int fh = amount / 500;
		amount = amount % 500;
		
		int th = amount / 200;
		amount = amount % 200;
		
		int oh = amount / 100;
		amount = amount % 100;
		
		int fr = amount / 50;
		amount = amount % 50;
		
		int tr = amount / 20;
		amount = amount % 20;
		
		int ter = amount / 10;
		amount = amount % 10;
		
		int fir = amount / 5;
		amount = amount % 5;
		
		int trr = amount / 2;
		amount = amount % 2;
		
		System.out.println("2000 * " + tth + " = " + (2000 * tth));
		System.out.println("500 * " + fh + " = " + (500 * fh));
		System.out.println("200 * "+ th + " = " + (200 * th));
		System.out.println("100 * "+ oh + " =" + (100 * oh));
		System.out.println("50 * " + fr + " =" + (50 * fr));
		System.out.println("20 *" + tr+ " = " + (20* tr));
		System.out.println("10 * " + ter + " = " + (10 * ter));
		System.out.println("5 * "+ fir +" =" + (5 * fir));
		System.out.println(" 2 * "+trr+"=" + (2 * trr));

	}
}