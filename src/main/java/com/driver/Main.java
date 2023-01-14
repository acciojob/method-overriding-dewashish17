
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
        A obj=new B();
        obj.meth();
    }
  
  
}
