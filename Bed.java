public class Bed extends Furniture{

/*
* I am calling my new parameter as a no arg constuctor
*  string cover is what I will be adding with the "super" thing
*/
  String cover;
  
  public Bed(){
super();
this.cover = "Basic blue";    
  }


/*
* This is my bed class where we will store all the methods to make a bed
*  this includes the name - weight - and the cover on the bed
*/
  public Bed(String name,double weight,String cover){
super(name,weight);
    this.cover = cover;
  }

  /*
* This get cover will return the value of whatever I put in the tester class
*  allowing for data to be sent from this class to the next 
*/
  
  public String getCover(){
return cover;
}

  /*
* set cover is how I am making new items in the tested class 
*  I am able to make as many as different covers as I want 
*/

  
  public void setCover(String coverUpdated){
    cover = coverUpdated;
  }
 /*
* This my overly complicated string to string method were I am adding my items
*  from this class being cover to the furniture class using text and super adding to 
* return text on the super class
*/ 
public String toString(){
String text = "Second Hand Item: Bed \n";
 text += super.toString();
  text += ", Cover: " + cover ;
  return text;
}
}