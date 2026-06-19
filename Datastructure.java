package DSA;
import java.util.*;

//public class Datastructure {
//  static void display(int[] arr, int length) {
//	 System.out.println("Elements are:");
//	 for(int i =0; i<length;i++) {
//		 System.out.println(arr[i] + " ");
//	 }
//  }
////	 TRANSPOSITION
//	 static void swap (int[] arr, int x, int y) {
//		 int temp = arr[x];
//		 arr[x] = arr[y];
//		 arr[y] = temp;
//	 }
//	 static int linearsearch(int[] arr, int length, int key) {
//		 for(int i=0; i<length;i++) {
//			 if(key == arr[i]) {
////				 MOVE TO FRONT
//				 swap(arr,i,0); 
//				 return i;
//			 }
//		 }
//		 return -1;
//	 }
//
//
//
//
//	public static void main(String[] args) {
////		int [] arr = {8,9,4,7,6,3,10,5,14,2};
////		int length = 10;
////		System.out.println("Index:" +linearsearch(arr,length,5));
////		display(arr,length);
//	   
//		Scanner sc = new Scanner(System.in);
//	
//		int length = sc.nextInt();
//		int[] arr = new int[length];
//		for(int i=0; i<length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("The length is:"+length);
//		System.out.println("Array are:");
//		for(int i=0; i<length; i++) {
//			System.out.println(arr[i] + " ");
//		}
//		
//		
//
//	}
//
//}
//  BINARY SEARCH

//public class Datastructure{
//	static int binarySearch(int[] arr, int key) {
//		int l = 0;
//		int h = arr.length-1;
//		while ( l <= h) {
//			int mid = (l + h)/2;
//			if(key == arr[mid]) {
//				return mid;
//			}
//			else if (key < arr[mid]) {
//				h = mid-1;
//				
//			}
//			else {
//				l = mid + 1;
//			}
//		}
//		return -1;
//		
//	}
//	static int recursiveBinarySearch(int[] arr, int l, int h , int key) {
//		if(l <= h) {
//			int mid = (l + h)/2;
//		}
//		else if(key < arr[mid]) {
//			return recursiveBinarySearch(arr, l, mid -1, key);
//			
//		}
//		else {
//			return recursiveBinarySearch(arr,mid+1,h,key);
//		}
//	}
//	return -1;
//	
//}
//static void display(int[] arr) {
//	System.out.println("\nElements are:");
//	for(int i : arr) {
//		System.out.println(i + " ");
//	}
//}
//public static void main(String[] args) {
//	int[] arr = {2,3,9,16,18,21,28,32,35};
//	System.out.println("");
//}

//  LINKED LIST 

//class Node{
//int data;
//Node next;
//Node(int data){
//	this.data=data;
//	next = null;
//}
//public class Datastructure{
//	
//	
//	public static void main(String[] args) {
//		Node head = new Node(10);
//		Node second = new Node(20);
//		Node third = new Node(20);
//		head.next = second;
//		second.next=third;
//		System.out.println("Linked list created");
//		
//		
//	}
//}
//}


public class Datastructure{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null;
		}
	}
	Datastructure(){
		head = null;
	}
	public void insertAtBegining(int val) {
		Node newnode = new Node(val);
//		newnode.data = val;
//		when list is empty
		if(head == null) {
			head = newnode;
		}
		else {
//			list is not empty
			newnode.next = head;
			head = newnode;
		}
		 
	 }
//	Traverse
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	public void insertAtPos(int pos ,int val) {
		if(pos ==0) {
			insertAtBegining(val);
			return;
		}
		
		Node newnode = new Node(val);
		Node temp = head;
		for(int i =1;i<pos;i++) {
			temp=temp.next;
			if(temp  == null) {
//				throw new IllegalArgumentException("invalid pos")
//				System.out.println("Invalid pos");
//				return;
				
			}
			
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}
	public static void main(String[] args) {
		Datastructure d = new Datastructure();
		

		
	}
}