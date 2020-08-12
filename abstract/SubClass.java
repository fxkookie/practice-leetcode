public class SubClass extends AbstractExample implements run{
    int z = 5;
    double j = 0;
    public void abstractMethod() { // must override this method, or SubClass be declared as abstract class
        x = 10;
        z = 10;
    }
    public void acc(){
      j = accerlate + velcoity;
    }
    public int getZ(){
      return z;
    }

}
interface run{
  double accerlate = 0;
  double velcoity = 1;
  void acc();
}
