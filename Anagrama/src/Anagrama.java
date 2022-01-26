import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrama {
	public boolean  anagrama(char[] a , char[]b) {
		Arrays.sort(a);
		Arrays.sort(b);
		if ( a == b){
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
