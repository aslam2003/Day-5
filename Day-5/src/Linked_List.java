import java.util.Scanner;
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int number,data1;
        Node head=null;
        Node current=null;
        current=head;
        System.out.println("Enter the number of nodes you want to create:");
        number=sc.nextInt();
        for(int i=1;i<=number;i++) {
        	System.out.println("Enter the data you want to insert");
             data1=sc.nextInt();
             Node newnode=new Node(data1);
             newnode.next=null;
             if(head==null) {
            	 head=newnode;
            	 current=head;	 
             }
             else {
             current.next=newnode;
             current=newnode;
        }
        }
        Node temp=head;
        while(temp!=null) {
        	System.out.print(temp.data+" ");
        	temp=temp.next;
        }
        
	}
	}

	


