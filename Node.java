public class Node{
 public Node(String value)
{
  /*create a constructor*/
  data = value;
  next = null;
  prev = null;
}
 private String data;
 private Node next,prev;


 //write get/set methods for all three instance variables.

 public String get(int index){
   return data;
 }
 public String getNext(int index)
 {
   return next.get(index);
 }
 public String getPrev(int index)
 {
   return prev.get(index);
 }

 public String set(String value)
 {
   data = value;
   return value;
 }

 public String setNext(String value)
 {
   return next.set(value);
 }

 public String setPrev(String value)
 {
   return prev.set(value);
 }

}
