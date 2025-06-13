import java.util.*;
public class Fibo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),cnt=0,num=2;
		while(cnt<n) {
			if(isprime(num)) {
				System.out.print(num+" ");
				cnt++;
			}
			num++;
		}
	}
    public static boolean isprime(int n) {
    	for(int i=2;i<=n/2;i++) {
    		if(n%i==0)
    			return false;
    	}
    	return true;
    }
}
