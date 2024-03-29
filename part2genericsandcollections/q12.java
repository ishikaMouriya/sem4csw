import java.util.*;
public class q12 {

	

	public static void main(String[] args) {
		int arr[]= {1,2,10,7,3,4,6,5,9};
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		System.out.println("the elements after adding:"+pq);
		for(int i=0;i<arr.length;i++) {
			pq.remove(arr[i]);
		}
		System.out.println("the elements after removing:"+pq);

	}

}
/*
 * the elements after adding:[1, 2, 4, 5, 3, 10, 6, 7, 9]
the elements after removing:[]  
 */