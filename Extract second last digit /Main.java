import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int seclastdigit=(num%100)/10;
      System.out.println(seclastdigit);// Type your code here
	}
}