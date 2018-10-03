import java.lang.*;
import java.util.*;
import java.io.*;
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
  void merge(Linklist first)
  {
    Node temp=head;
    while(temp.next!=null)
    {
      temp=temp.next;
    }
    temp.next=first.head;
  }
}
class Main
{
  public static void main(String [] aa)
  {
    Linklist ll1=new Linklist();
    Linklist ll2=new Linklist();
    ll1.insertt(10);
    ll1.insertt(20);
    ll1.insertt(30);
    ll1.disp();
    ll2.insertt(40);
    ll2.insertt(50);
    ll2.insertt(60);
    ll2.disp();
    System.out.println("enter the data");
    ll1.merge(ll2);
    ll1.disp();
  }
}