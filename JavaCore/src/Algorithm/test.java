package Algorithm;

public class test {
	static int smallestUnusualNumber(String x) {
	    int begin = 0, end = x.charAt(0) - 47;
	    
	    for(int i = 0 ; i < x.length() ; i++){
	        begin = begin*10 + (x.charAt(i) - 48);
	        end *= 10;
	    }
	    
		for (int i = begin + 1; i <= end; i++) {
			int s = 0;
			int p = 1;
			int j = i;
			while (j > 0) {
				s += j % 10;
				p *= (j % 10);
				j /= 10;
			}
			if (s > p) {
				return i;
			}
		}
			return end;
	}

	public static void main(String[] args) {
		String x = "1";

		System.out.println(smallestUnusualNumber(x));
	}
}
