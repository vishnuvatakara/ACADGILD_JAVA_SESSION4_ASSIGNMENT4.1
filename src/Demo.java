
public class Demo extends Test{	//child class extending parent class
public void sum(int a,int b)	//method over loading
{
	System.out.println("sum of two numbers");
}
public void sum(int a,int b,int c)	//method over loading
{
	System.out.println("sum of three numbers");
}
public void sum(float a,float b) //method over loading
{
	System.out.println("sum of two float numbers");
}
public void display() //method overriding overriding display method
{	
	System.out.println("child class display");
	super.display(); // calling parent class
}

public static void main(String args[])
{
	Demo obj=new Demo();
	System.out.println("method overloading examples calling sum function");
	//overloading methods
	obj.sum(2,3);
	obj.sum(2,3,4);
	obj.sum(3.6f,5.2f);
	
	System.out.println("=====using super keyword method overriding============");
	Demo d=new Demo();
	d.display();
}
}
