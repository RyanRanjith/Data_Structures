// public class Array {
//     private int[] items;
    
    
//     public Array (int length){
//         items = new int[length];
//     }
//     public void print(){
//         for (int i = 0; i < items.length; i++)
//         System.out.println(items[i]);
//     }
    
// }

// Not to print arrays we can use another private 

public class Array{
    private int[] items;
    private int count;


    // Initializing Array.
    public Array (int length) {
        items = new int[length];
    }
 
   // Inserting items
   public void insert(int item) {
       if (items.length == count) {
           int[] newItems = new int[count * 2];
           for (int i = 0; i < count; i++)
               newItems[i] = items[i];
           items = newItems;
       }
       items[count++] = item;
   }

   // Removing Items

   public void removeAt(int index) {

    if(index < 0 || index >= count)
      throw new IllegalArgumentException(); 
    for (int i = index; i < count; i++)
    items[i] = items[i + 1];
    count--;
             
   }
// Date -  09-24-24
   // Searching elements using index0f()
   
   public int indexOf(int item){

    for(int i = 0; i < count; i++)
      if(items[i] == item)
     return i;
    return -1;
   }

   public void print() {
    for(int i = 0; i < count; i++)
    System.out.println(items[i]);
   }
}