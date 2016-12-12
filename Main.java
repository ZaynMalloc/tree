public class Main{
  
  public static void main(String[] args){
    
   BSTree myTree = new BSTree();
   
   
   //Add nodes 
   myTree.add(2,"YOLO");
   myTree.add(1,"Swag");
   myTree.add(10,"One Direction");
   myTree.add(6,"UA YOU KNOW");
   myTree.add(8,"oh hai");
   myTree.add(5,"bro");
   myTree.add(6,"Chuck norris");
   
   //Print inOrder
   myTree.inOrder(myTree.root);


   

  }
  
} 