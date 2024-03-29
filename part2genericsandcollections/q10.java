import java.util.*;
import java.util.HashMap;
public class q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("enter a string");
		s=sc.nextLine();
		Hashtable<String,Integer> ht=new Hashtable<>();
		String[] ch=s.split("");
		/*for(String d:ch) {
			System.out.println(d);
		}*/
		for(int i=0;i<ch.length;i++) {
			if(ht.containsKey(ch[i])) {
			ht.put(ch[i],ht.get(ch[i])+1);
			}
			else
				ht.put(ch[i], 1);
		}
		
		Set s1=ht.entrySet();
		//System.out.println(s+"\n");
		Iterator i=s1.iterator();
		int y=0;
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey()+" "+e.getValue());
			
		}

	}

}
/*
 enter a string: little
l 2
t 2
i 1
e 1
 */