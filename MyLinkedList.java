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
   for(int i = 0; i < size; i++)
   {

   }
 }
 public void add(int index, String value);
 public String get(int index)
 {
   if(index >= this.size() || index < 0)
   {
     throw new IndexOutOfBoundsException(); 
   }
 }
 public String set(int index, String value);
 public String toString();
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
