public class MySecondHandStore {
 public static void main(String[]args){
/*
* This is my secondhand store where we have a selection 
*  of many secondhand Items like beds and tables                                                                                                                      * secondhand items  
*/


/*
* These call the information provided for each item
* this includes Name - Weight - and what cover is on the bed
*/
Bed oldBed = new Bed("Old Blue Bed", 112.2,"Blue Cover");
System.out.println(oldBed.toString());
System.out.println("\n");
   /*
* These call the information provided for each item
* this includes Name - Weight - and what cover is on the bed
*/
Bed oldtwinbed = new Bed("Old Twin Bed", 250.8 ,"Red and Black Cover");
System.out.println(oldtwinbed.toString());
System.out.println("\n");
   /*
* These call the information provided for each item
* this includes Name - Weight - and what cover is on the bed
*/
Bed LightlyUsedKingBed = new Bed("Lightly Used King Bed", 450.9 ,"Matte Black With White Stripes");
System.out.println(LightlyUsedKingBed.toString());
System.out.println("\n");
/*
* These call the information provided for each item
* this includes Name - Weight - and how big each table is in square feet
*/
Table oldTable = new Table("Old Table", 85.7 , 4);
System.out.println(oldTable.toString());
System.out.println("\n");

/*
* These call the information provided for each item
* this includes Name - Weight - and how big each table is in square feet
*/
   Table RusticTable = new Table("Rustic Table", 190.3 , 12);
System.out.println(RusticTable.toString());
System.out.println("\n");
/*
* These call the information provided for each item
* this includes Name - Weight - and how big each table is in square feet
*/
    Table WorkTable = new Table("Work Table", 29.7 , 5);
System.out.println(WorkTable.toString());
System.out.println("\n");
   
 } 
}