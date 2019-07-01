
import java.util.Scanner;

public class codelai {
	//static Scanner scn =new Scanner(System.in);
public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	int n,i,tong=0;
	n=scn.nextInt();
	int z =(2*n -1);
	for(i=0; i<=n ;i++) {
		if(n%2==1) {
			tong=tong+n;
			System.out.println(tong);
		}
	}
	
}
}
