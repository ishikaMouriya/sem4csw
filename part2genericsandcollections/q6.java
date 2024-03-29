import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	TreeSet<Integer> trr=new TreeSet<>();
	trr.add(88);
	trr.add(999);
	trr.add(11);
	trr.add(11);
	trr.add(303);
	System.out.println(trr);
	Iterator<Integer> y= trr.iterator();
	while(y.hasNext()) {
	System.out.println(y.next());	
	}
	System.out.println("enter a number to be searched");
	int ser=sc.nextInt();
	if(trr.contains(ser)) {
		System.out.println("yes it contains");
	}
	else
		System.out.println("no it does not contain");
	System.out.println("enter a number to be removed");
	int rev=sc.nextInt();
	trr.remove(rev);
	System.out.println(trr);

	}

}
/*[11, 88, 303, 999]
11
88
303
999
enter a number to be searched   
999
yes it contains
enter a number to be removed    
999
[11, 88, 303] */