public class Tree{
  
 Node root;
 
  public boolean add(String data){
   if (root == null) {
    root = new Node(data);
    return true;
   } 
   else {
     return root.insert(data);
   }
  }
  
  public void inOrder(){
    if(root != null){
     root.inOrder(); 
    }   
  }
  
  private class Node {
    private Node left;
    private Node right;
    private String data;
    
    private Node(String myData) {
      data = myData;
    }
    
    private boolean insert (String myData){
      boolean added = false;
      if (this == null){
        this.data = myData;
        return true;
      }
      else if (myData > this.data){
        if (this.right == null){
          this.right = new Node(val);
          return true;
        }
        else
          added = this.right.insert(data);
      }
      else {
        if (myData < this.data){
          if(this.left == null){
            this.left = new Node(val);
            return true;
          }
          else
            added = this.left.insert(val);
      }
    }
  }
  
    private void inOrder(){
      if (!this = null){
        if(this.left != null)
          this.left.inOrder();
        System.out.println(this.data);
        if(this.right != null)
          this.right.inOrder();
      }
    }
  }  
}