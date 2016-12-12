public class BSTree {
  
 Node root; //Root node
  
 class Node {

 Node left; //Left Node
 Node right; //Right Node
 
 int value; //Value of Node
 String name; //Name of Node

 //Node constructor
 //@param int value
 //@param String name 
 Node(int value, String name) {
  this.value = value;
  this.name = name;
 }

}
 
 // add method
 // Adds a node to a tree
 // @param int value
 // @param String name 
 public void add(int value, String name){
   
   Node newNode = new Node(value, name); //Intialize new node 
   
   if(root == null){  //If the root is null 
     root = newNode;  //Set newNode to the root 
   }
   else{        
   Node myNode = root; //Create a second new node
   Node parent; //Crete a parent Node 

   while (true) { //While true....
     
    parent = myNode;//Set parent node to myNode
    
    if (value < myNode.value) {  //If the value is less than my node 
      
     myNode = myNode.left; //Set myNode to left 
     
     if (myNode == null) { //If the value of myNode is null 
       
      parent.left = newNode; //Set the left parent node to newNode
      return; 
      
     }
    }else {
      
     myNode = myNode.right; //Set myNode to the right Node
     
     if (myNode == null) {
       
      parent.right = newNode; //Set the right node to the newNode
      return;
      
     }

    }

   }
     
   }
   
   
 }
 
 // inOrder method
 // Prints nodes inorder
 // @param Node myNode
 public void inOrder(Node myNode){
   
   if (myNode != null){ //If my node is not null, excute the following
     
    inOrder(myNode.left); //Recurse with left nodes
    System.out.println(myNode.name); //Print node name 
    inOrder(myNode.right); //Recurse with right nodes
     
   }
 }
  
}