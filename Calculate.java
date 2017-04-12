public class Calculate {
  public static void main(String[] arg){
	System.out.println("Calculate...");
	int first = Integer.valueOf(arg[0]);
	int second = Integer.valueOf(arg[1]);
	int third = Integer.valueOf(arg[2]);
	int summ = first + second;
	int multiplication = first * third; 
	System.out.println("Sum   " + summ);
	System.out.println("Multi   " + multiplication);
  }
}