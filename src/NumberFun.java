public class NumberFun {

    public static long findNextSquare(long sq) {
        long res;

        if(Math.sqrt(sq)%1==0) {
            long num = (long) Math.sqrt(sq);
            res = (long) Math.pow(num+1, 2);

        } else {
            res = -1;
        }

        return res;

    }
}
