public class Tree{
  
 private Node root;
 
 public Tree(){
   root = null;
 }
 
 public boolean add(String data)
 {
   if (root == null){
     root = new Tree(data);
     return true;
   }
   else
     return root.add(data);  
 }
  
}