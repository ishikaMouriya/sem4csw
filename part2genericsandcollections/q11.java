import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class q11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[9];
		System.out.println("enter the elements:");
		for(int i=0;i<9;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> hmap=new HashMap<>();
		for(int i=1;i<=10;i++) {
			hmap.put(i,1);
		}
		for(int i=0;i<9;i++) {
			hmap.remove(arr[i]);
		}
		Set s=hmap.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			System.out.println("the element that is missing is="+e.getKey());	
		}
	}
}
/*enter the elements:
1
2
4
5
6
7
8
9
10
the element that is missing is=3
*/