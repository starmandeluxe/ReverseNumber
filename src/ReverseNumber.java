
public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println(reverseNum(23));

	}
	
	public static int reverseNum(int n) {
		int out = 0;

		while(n!=0){
		    out *= 10;
		    System.out.println("out *= 10: " + out);
		    out += n%10;
		    System.out.println("out += n%10: " + out);
		    n /= 10;
		    System.out.println("n /= 10: " + n);
		    }

		return out;
	}

}
