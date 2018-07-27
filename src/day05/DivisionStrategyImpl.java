package day05;

/**
 * @ClassName DivisionStrategyImpl
 * @Description TODO
 * @Author APPO
 * @Date 17:50   2018-7-27
 * @Version 1.0
 **/
public class DivisionStrategyImpl implements Strategy {
    @Override
    public int calc(int a, int b) {
        if(b==0){
            throw new RuntimeException("被除数不能为0");
        }
        return a/b;
    }
}
