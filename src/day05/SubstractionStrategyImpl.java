package day05;

/**
 * @ClassName SubstractionStrategyImpl
 * @Description TODO
 * @Author APPO
 * @Date 17:49   2018-7-27
 * @Version 1.0
 **/
public class SubstractionStrategyImpl implements Strategy {
    @Override
    public int calc(int a, int b) {
        return a-b;
    }
}
