public class MyLinkedList{
 private int size;
 private Node start,end;

 public MyLinkedList(){
  size = 0;
/*
  start = null;
  end = null;
  */
}

 public int size()
 {
   return size;
 }

 public boolean add(String value)
 {
   size ++;
   Node N_Value = new Node(value);

   if(size == 1)
   {
     start = N_Value;
     end = N_Value;
   }
   else{
     N_Value.setPrev(end);
     end.setNext(N_Value);
     end = N_Value;
   }

   return true;
 }




 public void add(int index, String value)
 {
   size++;
   Node current = new Node(value);
   Node n = NodeIndex(index); // node at index becomes next
   Node p = NodeIndex(index).getPrev(); // node at (i-1) becomes prev

   if(index == size-1) // Tail
   {
     add(value);
   }

// Empty List
   else if(size == 1) // Empty list
   {
     add(value);

   }

  else if(index == 0) // Head
  {
    current.setNext(n);
    current.setPrev(null);

    n.setPrev(current);
    start = current;
  }

  else // Middle
  {
    current.setNext(n);
    current.setPrev(p);

    n.setPrev(current);
    p.setNext(current);
  }
  return;

 }

 public String get(int index)
 {
  return NodeIndex(index).get();
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
    current = current.getNext();
  }

  return current;
}

}
