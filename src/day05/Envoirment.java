package day05;

/**
 * @ClassName Envoirment
 * @Description TODO
 * @Author APPO
 * @Date 17:51   2018-7-27
 * @Version 1.0
 **/
public class Envoirment {
    private Strategy strategy;

    public Envoirment(Strategy strategy) {
        this.strategy = strategy;
    }

    public  int calc(int a,int b){
        return strategy.calc(a, b);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
