public class Solution {
  private static class StringsArrayQueue {
    private String[] array = new String[4];
    int first, last;
  
    public void enqueue(String value) {
      if (last == array.length) {
        resizeAndMove(2 * array.length);       
      }
      array[last++] = value;
    }

    public String dequeue() {
      if (isEmpty() == true) {
        return null;
      }
      
      String val = array[first];
      array[first++] = null;
      
      if (first == last) {
        first = last = 0;
      }
      
      if (last - first == array.length / 4) {
        resizeAndMove(array.length / 2);
        last = first;
        first = 0;
      }
      
      return val;
    }
    
    private void resizeAndMove(int capacity) {     
        String[] newArray = new String[capacity];
        for (int i = first; i < last; i++) {
          newArray[i - first] = array[i];
        }
        array = newArray;
    }
    
    public void print() {
      System.out.println();
      for (int i = 0; i < array.length; i++) {
        System.out.print("[" + array[i] + "]");
      }
      System.out.println();
      System.out.println("First = " + first + "; Last = " + last);
    }

    public boolean isEmpty() {
      return first == 0 && last == 0;
    }
  }
  
  public static void main(String[] args) {
    StringsArrayQueue queue = new StringsArrayQueue();   
    System.out.println("Done here!");
  }
}
