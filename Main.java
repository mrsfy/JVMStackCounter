
public class Main {

    private int x = 0;

    public static void testStack(int y) {
        if ( y == 0 ) {
            return;
        }
        testStack(y-1);
    }

    public static void main(String[] args) {
        Main x = new Main();
        double sum;
        sum = 0;
        int i;
        for ( i = 1; i <= 100; i++ ) {
            for ( int j = 1; ; j++) {
                try {
                    x.testStack(j);
                } catch (StackOverflowError err) {
                    sum += j;
                    break;
                }
            }
        }
        System.out.println (sum/i);
    }
}
