package part1genericsandcollection;
public class book {
	int bookId;
	String bookName;
	double price;
	book(int bookId,String bookName,double price){
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
	}
	public String toString() {
		return bookId+" "+bookName+" "+price;
	}
	
	boolean equals(book o) {
		if(this.price==o.price) {
			return true;
		}
		else{
			return false;
		}
		
	}
	

	public static void main(String[] args) {
	book obj1=new book(32,"meluha",230.66);
	book obj2=new book(32,"meluha",238.66);
	boolean tt=obj1.equals(obj2);
	System.out.println(obj1);
	System.out.println(obj2);
	if (tt)
		System.out.println("the two objects are same");
	else
		System.out.println("the two objects are not same");
	}

}
/*
 * 32 meluha 230.66
32 meluha 238.66
the two objects are not same
*/
