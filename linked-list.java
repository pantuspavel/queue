public class Solution {
  private static class StringsLinkedListQueue {
    private class Node {
      public String value;
      public Node next;
    }
    
    Node first, last;
  
    public void enqueue(String value) {
      Node newNode = new Node();
      newNode.value = value;
      if (last != null) {
        last.next = newNode;  
      } else {
        first = newNode;
      }
      last = newNode;
    }

    public String dequeue() {
      if (isEmpty() == true) {
        return null;
      }
      
      Node firstNode = first;
      first = first.next;
      
      if (first == null) {
        last = null;
      }
      
      return firstNode.value;
    }

    public boolean isEmpty() {
      return first == null;
    }
  }
  
  public static void main(String[] args) {
    StringsLinkedListQueue queue = new StringsLinkedListQueue();
  }
}
