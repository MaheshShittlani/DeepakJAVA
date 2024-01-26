import java.io.Console;
class AreaOfCircle {
	public static void main(String ...args) {
		
		final float PI = 3.14f;
		
		System.out.print("Enter the radius: ");
		Console con = System.console();
		int radius = Integer.parseInt(con.readLine());
		
		float area = PI * radius * radius;
		
		System.out.println("Ara of circle: " + area);
	}
}