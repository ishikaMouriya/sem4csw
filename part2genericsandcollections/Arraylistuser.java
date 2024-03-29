import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

class user implements Comparator<user>{
	private String name;private int age;
	user(String name,int age){
		this.name=name;
		this.age=age;
	}
	String getname() {
		return name;
	}
	int getage() {
		return age;
	}
	@Override
	public int compare(user o1, user o2) {
		if(o1.getage()>o2.getage()) {
			return 1;
		}
		else if(o1.getage()<o2.getage())
			return -1;
		else
		return 0;
	}
}
public class Arraylistuser {
	

	public static void main(String[] args) {
		ArrayList<user> arr=new ArrayList<>();
		arr.add(new user("ishika",20));
		arr.add(new user("ishika",23));
		arr.add(new user("ishika",35));
		arr.add(new user("ishika",78));
		arr.add(new user("ishika",90));
		arr.add(new user("ishika",13));
		arr.add(new user("ishika",5));
		for(user y:arr) {
			System.out.println(y.getname()+" "+y.getage());
		}
		Collections.sort(arr,new user("",0));
		System.out.println("\nthe sorted list is as follows:");
		for(user y:arr) {
			System.out.println(y.getname()+" "+y.getage());
		}
		
	}

	
}

/*
 * ishika 20
ishika 23
ishika 35
ishika 78
ishika 90
ishika 13
ishika 5

the sorted list is as follows:
ishika 5
ishika 13
ishika 20
ishika 23
ishika 35
ishika 78
ishika 90
*/
