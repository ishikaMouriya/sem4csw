package part1genericsandcollection;

import java.util.*;

public class studentq5 implements Comparable<studentq5>{
	String name;int rn,totalmark;
	

	studentq5(String name,int rn,int totalmark){
		this.name=name;
		this.rn=rn;
		this.totalmark=totalmark;
	}
	
	@Override
	public int compareTo(studentq5 o) {
		if(this.rn>=o.rn)
			return 1;
		else
			return -1;
		
	}
	public String toString() {
	 return this.name+" "+" "+this.rn+this.totalmark;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number of student objects to be created");
		n=sc.nextInt();
		studentq5 obj[]=new studentq5[n];
		String na;int r,tm;
		
		for(int i=0;i<n;i++) {
			System.out.println("enter name,rollno,and marks");
			na=sc.next();
			r=sc.nextInt();
			tm=sc.nextInt();
			obj[i]=new studentq5(na,r,tm);
		}
		studentq5 stu = null;
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				if((obj[j].compareTo(obj[j+1]))==1)
					stu=obj[j];
				    obj[j]=obj[j+1];
				    obj[j+1]=stu;
			}
		}
		for(studentq5 y:obj) {
			System.out.println(y);
		}
		
	}

}

