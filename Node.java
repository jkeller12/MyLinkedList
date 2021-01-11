public class Node{

private String data;
private Node next,prev;

public Node(String value)
{
  /*create a constructor*/
  data = value;
/*
  next = null;
  prev = null;
  */
}
 //write get/set methods for all three instance variables.

 public String get(){
   return data;
 }
 public Node getNext() // Shoulde this be Node getNext(); {return next;}
 {
   return next;
 }
 public Node getPrev()
 {
   return prev;
 }

 public String set(String value)
 {
   data = value;
   return value;
 }

 public Node setNext(Node value)
 {
   next = value;
   return next;
 }

 public Node setPrev(Node value)
 {
   prev = value;
   return prev;
 }

}
