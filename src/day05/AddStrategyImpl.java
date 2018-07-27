package day05;

/**
 * @ClassName AddStrategyImpl
 * @Description 定义加法的策略
 * @Author APPO
 * @Date 17:47   2018-7-27
 * @Version 1.0
 **/
public class AddStrategyImpl implements Strategy {
    @Override
    public int calc(int a, int b) {
        return a+b;
    }
}
