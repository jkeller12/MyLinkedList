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

   if(size == 1)
   {
     NodeIndex(0).setNext(null);
     NodeIndex(0).setPrev(null);
     NodeIndex(0).set(value);
     start = NodeIndex(0);
     end = NodeIndex(0);
   }
   else{
     NodeIndex(size-1).set(value);
     NodeIndex(size-1).setNext(null);
     NodeIndex(size-2).setNext(value);
     end = NodeIndex(size-1);
   }
   return true;
 }




 public void add(int index, String value)
 {
   // Operating on the Tail
   if(index == size-1)
   {
     add(value);
   }

   size++;
   String current = value;

// Empty List
   if(size == 1)
   {
     NodeIndex(0).setNext(null);
     NodeIndex(0).setPrev(null);
     NodeIndex(0).set(value);
     start = NodeIndex(0);
     end = NodeIndex(0);
   }


// Operating on the Head

  for(int i = size - 2; i > index; i--)
  {
  //  [1]->[2] [2]->[103] [103]->[4] [4]->[null] [...]
  //  [Value]->[1] [1]->[2] [2]->[103] [103]->[4] [4]->[null]

    NodeIndex(i).setNext(NodeIndex(i).get(i));
    NodeIndex(i).set(NodeIndex(i).getPrev(i));
  }
  NodeIndex(index).set(current);

  if(index == 0)
  {
    start = NodeIndex(index);
    NodeIndex(index).setPrev(null);
  }

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
