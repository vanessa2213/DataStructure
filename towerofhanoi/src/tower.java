
public class tower {


	public void solve(int n,String start,String middle, String end) {
		if(n==1) {
			System.out.println(start + "->"+end);
			}
		else {
			solve(n-1, start, end, middle);
			System.out.println(start + "->"+end);
			solve(n - 1, middle, start, end);
		}
		
	}

}
