package mock;

public class Add{
    public Integer add(Integer a, Integer b) {
        if (a==0) {
            return null;
        } else if (a>b) {
            return b;
        } else {
            return a*b;
        }
    }
}
