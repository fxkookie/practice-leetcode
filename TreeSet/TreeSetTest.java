import java.util.Iterator;
import java.util.*;
public class TreeSetTest{
  public static void main(String[] args) {
    Set<String> set = new TreeSet<String>();
    set.add("apple");
    set.add("orange");
    set.add("pineapple");
    set.add("peach");

    Iterator iterator = set.iterator();
    while(iterator.hasNext()){
      System.out.printf("%s\n",iterator.next());
    }
  }
}
