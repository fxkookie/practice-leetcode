public class IterableString  implements Iterable<Character>{
  private String origin;

  public IterableString(String origin){
    this.origin = origin;
  }
  public Iterator<Character> iterator(){
    return new InnerIterator();
  }
}
