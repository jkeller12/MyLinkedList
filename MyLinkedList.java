public class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList(){
  size = 0;
  start = null;
  end = null;
}

 public int size()
 {
   return size;
 }

 public boolean add(String value)
 {
   size ++;
   NodeIndex(size-2).setNext(value);
   NodeIndex(size-1).setNext(null);
   return true;

 }
 public void add(int index, String value)
 {
  size++;
  String current = value;
  for(int i = size - 2; i > index; i--)
  {
    NodeIndex(i).setNext(value);
  }
  NodeIndex(index).set(current);
 }

 public String get(int index)
 {
  return NodeIndex(index).get(index);
 }

 public String set(int index, String value)
 {
   return NodeIndex(index).set(value);
 }

 public String toString()
 {
   return "not finished";
 }

 public String remove(int index)
 {
   return "not finished";

 }



 //Any helper method that returns a Node object MUST BE PRIVATE!

private Node NodeIndex(int index)
{
  if(index >= size || index < 0)
  {
    throw new IndexOutOfBoundsException("Zero PR");
  }

  Node current = start;
  for(int i = 0; i < index; i++)
  {
    String Next_Value = current.getNext(i);
    Node Next_Node = new Node(Next_Value);
    current = Next_Node;
  }
  return current;
}

}
