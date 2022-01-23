package facade;

public class Fatorial {
	public static int doFatorial(int x) {
		
		int f=x;
		if(x==0) {
			return 1;
		}
		else {
			
			while (x>1) {
				f=f*(x-1);
				x--;
			}
		}
		
		return f;		
		
	}
}
