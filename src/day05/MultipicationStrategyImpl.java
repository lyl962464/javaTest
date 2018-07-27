package day05;

/**
 * @ClassName MultipicationStrategyImpl
 * @Description TODO
 * @Author APPO
 * @Date 17:50   2018-7-27
 * @Version 1.0
 **/
public class MultipicationStrategyImpl implements Strategy {
    @Override
    public int calc(int a, int b) {
        return a * b;
    }
}
