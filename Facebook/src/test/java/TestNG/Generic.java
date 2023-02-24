package TestNG;

import java.util.HashSet;

public class Generic <Y> {
int a;
Y b; //Generic use

public static void main(String[] args) {
	
	Generic x=new Generic();
	x.a=23;
	x.b=45;
	x.b="Velocity";
	x.b='&';
	x.b=56.78;
	x.b=new TestNG1();
	
	Generic<String>Y= new Generic<String>();
	Y.a=56;
	Y.b="Velocity";
	Y.b=87;
	Y.b='%';
	
	Generic<Integer>Z =new Generic<Integer>();
	Z.b=67;
	Z.b='$';
	Z.b="Velocity";


/*public class Generic<Y,D> {
int a;
Y b; //generic use
D c;

public static void main(String[]args) {
	Generic X= new Generic();
	X.a=23;
	
	Generic<String ,Character>Y =new Generic<String,Character>();
	Y.a=56;
	Y.b="Velocity";
	Y.c='$';
	
	Generic<Integer,String>Z =new Generic<Integer,String>();
	Z.b=67;
	Z.c="SDFERG";*/


/*	public class Generic<Y,D> {
		int a;
		Y b;//generic use
		
		Y demo(D c)
		{
			System.out.println(b);
			return b;
		}
		
		
		public static void main(String[] args)
		{
			Generic x= new Generic();
			x.a=23;
			Generic<String, Character>Y= new Generic<String,Character>();
			Y.b="Velocity";
			String data=Y.demo('$');*/




//Insertaion
//deletion
//Retrieval
/*public class Generic
{
public static void main(String[] args)
{
//Hetrogenouns collection
ArrayList a =new ArrayList();
a.add(34);
a.add('$');
a.add("Velocity");
a.add(45.67);

//homogenouns collection
ArrayList<Integer> b=new ArrayList<Integer>();
b.add(56);
b.add(68);
b.add(68);

List<String>c = new ArrayList<String>();
c.add("fgh");
c.add("uhdfjger");*/



/*public class Generic  //run output check
{
public static void main(String[] args)
{
ArrayList<Integer> b=new ArrayList<Integer>();
//insertion
b.add(56);
b.add(93);
b.add(78);
b.add(93);
b.add(28);
b.add(82);

System.out.println("Size=" + b.size());

for(int i=0;i<b.size();i++)
{
	//Retrieval
	System.out.println(b.get(i));
}

//deletion
b.remove(3);

System.out.println("==============");
System.out.println("Size=" + b.size());

for(int i=0;i<b.size();i++)
{
	//Retrieval
	System.out.println(b.get(i));
}*/


/*			
public class Generic  //run output check
{
public static void main(String[] args)
{
  HashSet<String>a =new HashSet<String>();
  //Insertion
  a.add("Velocity");
  a.add("Testing");
  a.add("Class");
  a.add("Batch");
  a.add("2023");
  a.add("Class");
  
  //advance for loop
  //for each
  
  //retrieval
  for(String x:a)
  {
	  System.out.println(x);
	  
  }
  
  System.out.println("============");
  
  //deletion
  a.remove("Batch");
  for(String x:a)
  {
	  System.out.println(x);
  
  }*/
	
	
	
	

}

}
