import java.lang.*;
import java.util.*;
class Node
{
  int data;
  Node next;
}
class Linklist
{
  Node head;
  void insertt(int val)
  {
    Node tmp=new Node();
    tmp.data=val;
    tmp.next=null;
    if(head==null)
    {
      head=tmp;
      tmp=null;
    }
    else
    {
      Node temp=head;
      while(temp.next!=null)
      {
        temp=temp.next;
      }
      temp.next=tmp;
    }
  }
  void disp()
  {
    Node temp=head;
     while(temp.next!=null)
      {
        System.out.println("data:- "+temp.data);
        temp=temp.next;
      }
       System.out.println("data:- "+temp.data);
  }
  void swap(int pos)
  {
    int count=0;
    Node temp=head;
    Node tempp=temp.next;
    while(temp.next!=null)
    {
      int tmp=0;
      if(count==pos-1)
      {
      tmp=temp.data;
      temp.data=tempp.data;
      tempp.data=tmp;
      }
      count++;
      temp=temp.next;
      tempp=tempp.next;
    }
  }
}
class Main {
  public static void main(String[] args) {
    Scanner ss=new Scanner(System.in);
    Linklist ll=new Linklist();
    ll.insertt(10);
    ll.insertt(20);
    ll.insertt(30);
    ll.insertt(40);
    System.out.println("enter the pos to swap");
    int pos;
    pos=ss.nextInt();
    ll.disp();
    ll.swap(pos);
    ll.disp();
  }
}