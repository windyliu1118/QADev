package mock;

public class Division {
    public Integer divid(Integer a, Integer b){
        if (b==0) {
            return null;
        } else if (a>100) {
            return null;
        }else if (a<b) {
            return 0;
        } else {
            return a / b;
        }
    }

    public Integer divid2(Integer a, Integer b, Integer c) {
        return divid(a, b) / c;
    }
}
