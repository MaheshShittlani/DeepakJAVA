import java.io.Console;
class Average
{
	public static void main(String ...args)
	{
		int a;
		int b;
		int c;
		System.out.print("Enter the numbers: ");
		Console con=System.console();
		a=Integer.parseInt(con.readLine());
		b=Integer.parseInt(con.readLine());
		c=Integer.parseInt(con.readLine());
		float average = (a+b+c)/3.0f;
		System.out.println("Average of numbers: "+ average);
	}
}