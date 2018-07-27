package day05;

/**
 * @ClassName StrategyTest
 * @Description TODO
 * @Author APPO
 * @Date 17:09   2018-7-27
 * @Version 1.0
 **/
public class StrategyTest {
    public static void main(String[] args) {
        AddStrategyImpl addStrategy = new AddStrategyImpl();
        Envoirment envoirment = new Envoirment(addStrategy);
        System.out.println(envoirment.calc(2, 3));


        SubstractionStrategyImpl substractionStrategy = new SubstractionStrategyImpl();
        envoirment.setStrategy(substractionStrategy);
        System.out.println(envoirment.calc(3, 2));
    }
}
