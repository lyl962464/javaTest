 Java8引入的接口默认方法实现一个新的概念。此功能是为了向后兼容性增加，使旧接口可用于利用JAVA8。 
 lambda表达式的能力，例如，列表或集合接口不具备forEach方法声明。从而增加了这样的方法只会打破收集框架实现。 
 Java8引入了默认的方法使列表/Collection接口可以拥有forEach默认方法，并实行类实现这些接口不需要实现相同功能。
 
 ``
 语法
 public interface vehicle {
 	default void print(){
 		System.out.println("I am a vehicle!");
 	}
 }
 ``
 
 ``
 
    多重默认
    在接口默认方法，它们是一类实现两个接口使用相同的默认方法，那么如何解决这种模糊性。考虑下面的情况。
    
    public interface vehicle {
    	default void print(){
    		System.out.println("I am a vehicle!");
    	}
    }
    public interface fourWheeler {
    	default void print(){
    		System.out.println("I am a four wheeler!");
    	}
    }
 ``
 