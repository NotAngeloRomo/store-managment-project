public class Table extends Furniture{

  /*
* this size int is my new parameter 
*  so i set it as is below
*/
  int Size;
/*
* here using the super call thing I added its default value 
*  it will be added to furniture using that 
*/
  public Table(){
super();
    this.Size = 5;    
  }
/*
* here are the args name weight and size
*   the size is being added to the name and wieght of the furnitrue class 
*/
  public Table(String name,double weight,int Size){
super(name,weight);
    this.Size = Size;
  }
/*
* this gets the size provided in the arg in the tester class 
* then it is returned to the console 
*/
  public int getSize(){
return Size;
}

/*
* this sets the new size in console the this.size makes sure that the computer is only changing this one for each new object
*  then once set is will be sent to the colsole to print 
*/
  
  public void setSize(int Size){
    this.Size = Size;
  }

  /*
* This my overly complicated string to string method were I am adding my now size of table
*  from this class being size to the furniture class using text and super adding to 
* return text on the super class
*/ 
  public String toString(){
String text = "Second Hand Item: Table \n";
 text += super.getName() + " Weight: " + this.getWeight();
  text += ", Size: " + Size + " Feet";
  return text;
}
  
}