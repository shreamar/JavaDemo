package Assignments.BasicJava.Day5.SelfReview.Review2;

public interface Count {
    short counter = 0;
    void countUp();
}

class TestCount implements Count{
    public static void main(String[] args) {
        TestCount testCount = new TestCount();
        testCount.countUp();
    }

    public void countUp(){
        for(int x =6;x>counter;x--){
            System.out.println(" "+x);
        }
    }
}
