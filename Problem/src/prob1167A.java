import java.util.Scanner;

public class prob1167A {
	static int t, n;
	static String str;
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		t = Integer.parseInt(scn.nextLine());
		
		while(t != 0)
		{
			n = Integer.parseInt(scn.nextLine());
			str = scn.nextLine();
			boolean ok = false;
			for(int i = 0 ; i < str.length() ; i++) {
				if(str.charAt(i) == '8' && (n - i) > 10) {
					ok = true;
					break;
				}
			}
			
			if(ok)
				System.out.println("YES");
			else
				System.out.println("NO");
			
			t--;
		}
	}
}
