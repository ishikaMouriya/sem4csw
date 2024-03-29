package part1genericsandcollection;


import java.util.*;
public class Studentq4 implements Comparable<Studentq4>{
	String name;
	int rn;int totalMark;
	
	Studentq4(String name,int rn,int totalMark){
		this.name=name;
		this.totalMark=totalMark;
		this.rn=rn;
	}
	
	@Override
	public int compareTo(Studentq4 o) {
		if(this.name.equals(o.name) && this.totalMark==o.totalMark && this.rn==o.rn) 
			return 0;
			else
				return -1;
		
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number of student objects to be created");
		n=sc.nextInt();
		Studentq4 obj[]=new Studentq4[n];
		String na;int r,tm;
		
		for(int i=0;i<n;i++) {
			System.out.println("enter name,rollno,and marks");
			na=sc.next();
			r=sc.nextInt();
			tm=sc.nextInt();
			obj[i]=new Studentq4(na,r,tm);
		}
		
		System.out.println("enter the object detail to be searched(name,rollno,totalmark)");
		na=sc.next();
		r=sc.nextInt();
		tm=sc.nextInt();
		Studentq4 obj4=new Studentq4(na,r,tm);
		int y=-1;
		for(int i=0;i<n;i++) {
			if(obj[i].compareTo(obj4)==0) 
				y=i;	
		}
		if(y!=-1)
		System.out.println("the object is found");
		else
		System.out.println("not found");

	}

	
}
/*
enter the number of student objects to be created
4
enter name,rollno,and marks
mini
23
90
enter name,rollno,and marks
ram 
18
88 
enter name,rollno,and marks
budh
12
100
enter name,rollno,and marks
priya
44
87
enter the object detail to be searched(name,rollno,totalmark)
budh
12
100
the object is found
*/