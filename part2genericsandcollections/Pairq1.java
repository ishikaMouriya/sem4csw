
public class Pairq1<K,V> {
	private K key;private V value;
	Pairq1(K key,V value){
		this.key=key;
		this.value=value;
	}
	K getkey() {
		return key;
	}
	V getvalue() {
		return value;
	}
	void print() {
		System.out.println(key+" "+value);
	}

	public static void main(String[] args) {
		Pairq1 obj1=new Pairq1(12,44);
		obj1.print();
		//System.out.print(obj1.key+" "+obj1.value);
		obj1=new Pairq1("ishika",42);
		
		obj1.print();
		

	}

}
