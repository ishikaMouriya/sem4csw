import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class q8 {

	public static void main(String[] args) {
		int f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two strings:");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		if(str1.length()!=str2.length()) {
			System.out.println("not anagram");
		}
		else {
		HashMap<Character,Integer> hmap=new HashMap<>();
		for(int i=0;i<str1.length();i++) {
			if(hmap.containsKey(str1.charAt(i))) {
				hmap.put(str1.charAt(i),hmap.get(str1.charAt(i))+1);
			}
			else
				hmap.put(str1.charAt(i),1);
		}
		for(int y=0;y<str2.length();y++) {
			char ch=str2.charAt(y);
			if(hmap.containsKey(ch)) {
				hmap.put(ch,hmap.get(ch)-1);
			}
			else {
				f=1;
			}
			
		}
		if(f==1) {
			System.out.println("not anagram");
		}
		else
			System.err.println("yes anagram");
		

		Set s=hmap.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey()+" "+e.getValue());
			
			
		}
		
	}//end of if-else

	}

}
/*enter two strings:
fired
fried
yes anagram
r 0
d 0
e 0
f 0
i 0 */