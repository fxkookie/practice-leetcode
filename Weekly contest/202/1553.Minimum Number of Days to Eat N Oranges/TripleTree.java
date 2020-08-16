public class TripleTree{
    int data = -1;
    int dep = 0;
    TripleTree one;
    TripleTree half;
    TripleTree third;
    public TripleTree(int n,int depth){
        data = n;
        dep = depth;
    }
    public void traversal(){
        if(data == 0){
            return;
        }
        if(data%3 == 0){
            third = new TripleTree(data/3,dep+1);
        }
        if(data%2 == 0){
            half = new TripleTree(data/2,dep+1);
        }
        one = new TripleTree(data-1,dep+1);
        if(third != null){
            third.traversal();
        }
        if(half != null){
            half.traversal();
        }
        if(one != null){
            one.traversal();
        }
    }
    public int findMin(TripleTree node){
        int min = -1;
        if(node == null){
            return 99;
        }
        if(node.data == 0){
          if(min > node.dep){
              return node.dep;
          }
        }
        int oneD = findMin(node.one);
        if(min > oneD || min == -1){
            min = oneD;
        }
        int halfD = findMin(node.half);
        if(min > halfD || min == -1){
            min = halfD;
        }
        int thirdD = findMin(node.third);
        if(min > thirdD || min == -1){
            min = thirdD;
        }
        return min;
    }

}
