public class PlayGround{
  public static void main(String[] args){
    SubClass s = new SubClass(); // correct
    SubClass s2;
    Child c;
    Child c2 = new Child();
    s.acc();// virtual function, call SubClass's abstractMethod
    s2 = (SubClass)c2;
    System.out.printf("SubClass:%f   ",s.j);
    //System.out.printf("Child:%d   \n",c2.j);
    //System.out.printf("%d",a.getZ());
    //a = new AbstractExample(); // Compile error, you can't new abstract class
  }
  public PlayGround(){

  }

}
