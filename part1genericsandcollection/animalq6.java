package part1genericsandcollection;

import java.util.Scanner;

public class animalq6 {
	String name,color,type;
	int id;
	animalq6(String name,String color,String type,int id){
		this.name=name;
		this.color=color;
		this.type=type;
		this.id=id;
	}
	public int hashCode(){
		return id;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		animalq6 obj[]=new animalq6[2];
		for(int i=0;i<2;i++) {
			System.out.println("enter name,color,type,");
			obj[i]=new animalq6(sc.next(),sc.next(),sc.next(),sc.nextInt());
			System.out.println(obj[i].hashCode());
		}

	}

}
/*
 * 
 output:

enter name,color,type,
lion
yellow
carnivore
3
3
enter name,color,type,
zebra
black
hebivore
9
9
*/