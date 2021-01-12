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
   N_Value.setNext(null);
   if(size == 1)
   {
     start = N_Value;
     end = N_Value;
     N_Value.setPrev(null);
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

   Node current = new Node(value);

  if(size == 0 && index == 0) // Empty list
  {
      start = current;
      end = current;
      current.setNext(null);
      current.setPrev(null);
      size++;
    }

  else if(index == size) // Tail
  {
     add(value);
   }



  else if(index == 0) // Head
  {
    Node n = NodeIndex(index); // node at index becomes next
    current.setNext(n);
    current.setPrev(null);

    n.setPrev(current);
    start = current;
    size++;

  }

  else // Middle
  {
    Node n = NodeIndex(index); // node at index becomes next
    Node p = NodeIndex(index).getPrev(); // node at (i-1) becomes prev
    current.setNext(n);
    current.setPrev(p);

    n.setPrev(current);
    p.setNext(current);
    size++;
  }
  return;
 }

 public String get(int index)
 {
  return NodeIndex(index).get();
 }

 public String set(int index, String value)
 {
   String Return_Value = NodeIndex(index).get();
   NodeIndex(index).set(value);
   return Return_Value;
 }

 public String toString()
 {
   String str = new String("[");
   Node current = start;
   while(current != null)
   {
     str = str + current.get();
     if(current.getNext() != null)
     {
       str = str + ", ";
     }
     current = current.getNext();
   }

   return str + ("]");
 }

/// Implement
 public String toStringReversed()
 {
   String str = new String("[");
   Node current = end;
   while(current != null)
   {
     str = str + current.get();
     if(current.getPrev() != null)
     {
       str = str + ", ";
     }
     current = current.getPrev();
   }

   return str + ("]");
 }



///////////////////////////////
 public String remove(int index)
 {

   Node current = NodeIndex(index);

  // Empty List
  if(size == 0) // Empty list
  {
   return "[]";
  }

  if(size == 1)
  {
    String Return_Value = NodeIndex(index).get();
    start = null;
    end = null;
    size--;
    return Return_Value;
  }

  else if(index == 0) // Head
  {
    Node n = NodeIndex(1); // node at index becomes next
    n.setPrev(null);
    current.setNext(null);
    current.setPrev(null);
    start = n;
    size--;
    return current.get();
  }

  else if(index == size-1) // Tail
   {
     Node p = NodeIndex(index).getPrev(); // node at (i-1) becomes prev

     p.setNext(null);
     end = p ;
     size--;

     return current.get();
   }


  else // Middle
  {
    Node n = NodeIndex(index+1); // node at index becomes next
    Node p = NodeIndex(index).getPrev(); // node at (i-1) becomes prev

    p.setNext(n);
    n.setPrev(p);
    current.setNext(null);
    current.setPrev(null);
    size--;

    return current.get();
  }
 }


 /*
 *@postcondition: All of the elements from other are removed
 from the other, and connected to the end of this linked list.
 *@postcondition: The size of other is reduced to 0.
 *@postcondition: The size of this is now the combined sizes
 of both original lists
 */
 public void extend(MyLinkedList other)
 {
   if (start == null)
   {
     start = other.start;
     end = other.end;
     size = other.size();
     return;
   }

   if(other.start == null)
   {
     return;
   }

   end.setNext(other.start);
   other.start.setPrev(end);

   size = size + other.size();

   other.start = null;
   end = other.end;
   other.end = null;
   other.size = 0 ;
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
