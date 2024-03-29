import java.util.*;

import java.util.*;

public class addressq7 {
	static TreeMap<String,String> tr=new TreeMap<>();
    public  String plotno;
	public String a;
	public  String post;
	
	addressq7(String pln,String a,String post){
	plotno=pln;
	this.a=a;
	this.post=post;
	}
	
	private void addintreemap() {
		
		tr.put("ishika",plotno+""+a+""+post);
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER y FOR ADDING ELSE n");
		char ch=sc.next().charAt(0);
		while(ch=='y') {
		System.out.println("enter plotno,at,post");
		String plot=sc.nextLine();
		String att=sc.nextLine();
		String postt=sc.nextLine();
		addressq7  it=new addressq7(plot,att,postt);
		it.addintreemap();
		System.out.println("enetr y or n");
		ch=sc.next().charAt(0);
		}
		System.out.println("treemap="+tr);
		Set set=tr.entrySet();
		Iterator iter1=set.iterator();
		while(iter1.hasNext()) {
			Map.Entry y=(Map.Entry) iter1.next();
			System.out.print("key is:"+y.getKey()+"and value is:");
			System.out.println(y.getValue());
		}

	

	}




	

}
