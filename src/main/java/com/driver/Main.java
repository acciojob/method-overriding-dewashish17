
public class Main {
  
    class A{
  public void meth()
  {
    System.out.println("Invoking method from class A");
  }
}
class B extends A{
  @Override
  public void meth()
  {
    System.out.println("Method is overridden in Extendend class B");
  }
}   
  
     public static void main(String [] args)
    {
        A obj=new A();
        obj.meth();
       
       B obj1=new B();
       obj1.meth();
    }
  
  
}
