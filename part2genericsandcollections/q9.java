import java.util.*;

public class q9 {

	public static void main(String[] args) {
    HashSet<Integer> dup=new HashSet<>();
   // HashSet<Integer> notdup=new HashSet<>();
    
	/*Scanner sc=new Scanner(System.in);
	System.out.println("ENTER y FOR ADDING ELSE n");
	char ch=sc.next().charAt(0);
	while(ch=='y') {
		System.out.println("enetr an integer");
		int y=sc.nextInt();
		hs.add(y);
		System.out.println("enter an integer");
		ch=sc.next().charAt(0);
	}
	Iterator i=hs.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}*/
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the limit:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.print("\nenter an array:");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++) {
			c=0;
			for(int j=0;j<n;j++) {
				if(ar[i]==ar[j]) 
					c++;
			}
				if(c>1) {
					dup.add(ar[i]);
				}
				/*else
					notdup.add(ar[i]);(*/
		}
		System.out.println("the duplicate elements are:"+dup);
		
	}
}
/*
 enter the limit:5

enter an array:2
3
5
2
1
the duplicate elements are:[2] 
 */