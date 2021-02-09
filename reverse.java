import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws Exception {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(reader.readLine());
	    long[] arr = new long[N];
	    String input = reader.readLine();
	    String[] line = input.split(" ");
	    for(int i = 0; i < N; i++) {
	        arr[i] = Long.parseLong(line[i]);
	    }
	    System.out.println(Arrays.toString(reverse(arr)));
	}
    public static long[] reverse(long[] arr){
        int N = arr.length;
        for(int i = 0; i < N/2; i++) {
            arr[i] = arr[i] + arr[N-1-i];
            arr[N-1-i] = arr[i] - arr[N-1-i];
            arr[i] = arr[i] - arr[N-1-i];
        }
        return arr;
    }
}
