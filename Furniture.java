public class Furniture {
private String name;
private double weight;

/*
*  Name and weight are in the furniture class
* we set the default value to furniture to 
*/


  
  public Furniture(){
this.name = "AHH";
this.weight = 250.5;   
  }
/*
* args are name and weight 
* the this makes sure that it does this weight and name to not confuse the computer  
*/

  
   public Furniture(String name, double weight){
this.name = name;
this.weight = weight;
     }

  /*
* this gets the name provided
*  and returns it to the console 
*/
public String getName(){
return name;
  
}
  /*
* this gets the provided weight
*  then returns it to the console 
*/
  public double getWeight(){
return weight;
  }
/*
* this will set the given name 
*  this name being = to name makes it for any new objects 
*/ 
public void setName(String newName){
this.name = name;
  
}
/*
* this will set the given weight 
*  this weight being = to name weight it for any new objects 
*/ 
public void setWeight (double weight){
this.weight = weight;
  
}

  /*
* this to string sets up how the info will be printed 
*  String text = "Name: " + name + ", Weight: " + weight in this order later on 
* we will add the other args like size or cover for the bed and table
*/ 
public String toString(){
String text = "Name: " + name + ", Weight: " + weight; 
  return text; 
}

}