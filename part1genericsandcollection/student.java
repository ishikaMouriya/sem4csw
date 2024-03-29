package part1genericsandcollection;


public class student<E> {
	String name;
	E roll;
	int age;
	public student(String name,E roll,int age){
		this.name=name;
		this.roll=roll;
		this.age=age;	
	}
	void print() {
		System.out.println(name+" "+roll+" "+age);
	}

	public static void main(String[] args) {
		student<Integer> obj1=new student("ishika",23,12);
		student<String> obj2=new student("ishika","99",12);
		student<Integer> obj3=new student("ishika",55,12);
		student<String> obj4=new student("ishika","77",12);
		obj1.print();
		obj2.print();
		obj3.print();
		obj4.print();
		student objj=new student("qew",33,22);
		objj.print();
		objj=new student("ishik","324",2);
		objj.print();

	}

}
/*
ishika 23 12
ishika 99 12
ishika 55 12
ishika 77 12
qew 33 22
ishik 324 2
*/