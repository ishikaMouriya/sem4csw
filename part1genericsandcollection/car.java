package part1genericsandcollection;

import java.util.Collections;

public class car implements Comparable<car>{
	String model,color;int speed;
	car(String model,String color,int speed){
		this.model=model;
		this.color=color;
		this.speed=speed;
	}

	@Override
	public int compareTo(car o) {
	if(this.speed>o.speed) {
		return 1;
	}
	else if(this.speed<o.speed)
		return -1;
	else
		return 0;
	}
	
	public String toString() {
		return model+" "+color+" "+speed;
		}
	

	public static void main(String[] args) {
		car obj1=new car("vxi","blue",23);
		car obj2=new car("zxi","white",43);
		int y=obj1.compareTo(obj2);
		if(y==1) {
			System.out.println(obj1);
		}
		else if(y==-1)
			System.out.println(obj2);
		else
			System.out.println("same");
		

	}	

}
/*
zxi white 43
*/
