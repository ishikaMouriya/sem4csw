import java.util.*;

class car implements Comparator<car>{
	private int modalno;private String name;private int stock;
	
	car(int modalno,String name,int stock){
		this.modalno=modalno;
		this.name=name;
		this.stock=stock;
	}
	int getstock() {
		return stock;
	}
	int getmodalno() {
		return modalno;
	}
	String getname() {
		return name;
	}
	@Override
	public int compare(car o1, car o2) {
	 if(o1.getstock()>o2.getstock())
		return 1;
	 else
		 return 0;
	}
}
public class carapp {
	public static void main(String[] args) {
		ArrayList<car> arr=new ArrayList<>(); 
		arr.add(new car(34,"swift",8));
		arr.add(new car(99,"volvo",0));
		arr.add(new car(33,"porche",15));
		arr.add(new car(66,"swift",33));
		Collections.sort(arr,new car(0,"",0));
		for(car y:arr) {
			System.out.println(y.getmodalno()+" "+y.getstock()+" "+y.getname());
		}

	}

}
/*
34 8 swift
99 0 volvo
33 15 porche
66 33 swift 
*/