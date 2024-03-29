import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class book{
	int id;String name;int quantity;
	book(int id,String name,int quantity){
		this.id=id;
		this.name=name;
		this.quantity=quantity;
	}
	
}
public class libraryq5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,book> hmap=new HashMap<>();
		hmap.put(1,new book(12,"meluha",22));
		hmap.put(1,new book(12,"yarda",13));
		System.out.println("enter name of the book");
		String book=sc.nextLine();
		Set s=hmap.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			
			
		}
		
		
		
		

	}

}
