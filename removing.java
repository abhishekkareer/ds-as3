import java.util.*;
import java.lang.*;
import java.io.*;
class Node
{
  int data;
  Node next;
}
class Main
{
  public static Node head;
  static void insertt(int v)
  {
    Node NewNode=new Node();
    NewNode.data=v;
    NewNode.next=null;
  if(head==null)
  {
    head=NewNode;
  }
  else
  {
    Node temp=head;
    while(temp.next!=null)
    {
      temp=temp.next;
    }
    temp.next=NewNode;
  }
  }
  static void disp()
  {
    Node start=head;
    while(start.next!=null)
    {
      System.out.println(start.data);
      start=start.next;
    }
    System.out.println(start.data);
  }
 
static void dublicate()
{
  Node temp=head;
  Node prev=null;
  Node nexxt=null;
  while(temp.next!=null)
  {
    if(temp.data==temp.next.data)
    {
      nexxt=temp.next.next;
      temp.next=null;
      temp.next=nexxt;
    }
    temp=temp.next;
  }
}
public static void main(String [] aa)
{
  Scanner ss=new Scanner(System.in);
  System.out.println("enter the no");
  int a;
  a=ss.nextInt();
  while(a!=-1)
  {
    insertt(a);
    a=ss.nextInt();
  }
  disp();
  System.out.println("dublicate function called");
dublicate();
disp();
}
}