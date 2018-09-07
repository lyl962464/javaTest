##静态代理模式

•代理模式的作用是：为其他对象提供一种代理以控制对这个对象的访问。
•在某些情况下，一个客户不想或者不能直接引用另一个对象，而代理对象可以在客户端和目标对象之间起到中介的作用

•代理模式一般涉及到的角色有
        –抽象角色：声明真实对象和代理对象的共同接口
        –代理角色：代理对象角色内部含有对真实对象的引用，从而可以操作真实对象，同时代理对象提供与真实对象相同的接口以便在任何时刻都能代替真实对象。同时，代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装
        –真实角色：代理角色所代表的真实对象，是我们最终要引用的对象

参考代码：
        Subject.java
        RealSubject.java
        ProxySubject.java
        Client.java
        
        
        
问题：     
           如果真实对象有100个的时候，那么代理对象也要有100个，怎么解决这种现象？
             当真实的对象不知道的时候，怎么办？
             
             可以采用动态代理的方式进行问题的解决
          
          
           
           

•Java动态代理类位于java.lang.reflect包下，一般主要涉及到以下两个类：
    
    •(1)Interface InvocationHandler：该接口中仅定义了一个方法
        –public object invoke(Object obj,Method method, Object[] args)
    
    •在实际使用时，第一个参数obj一般是指代理类，method是被代理的方法，如上例中的request()，args为该方法的参数数组。这个抽象方法在代理类中动态实现。
    
    •(2)Proxy：该类即为动态代理类，作用类似于上例中的ProxySubject，其中主要包含以下内容
    
    •protected Proxy(InvocationHandler h)：构造函数，用于给内部的h赋值。
    
    •static Class getProxyClass (ClassLoader loader, Class[] interfaces)：获得一个代理类，其中loader是类装载器，
  
    interfaces是真实类所拥有的全部接口的数组。
    
    •static Object newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h)：返回代理类的一个实例，
    返回后的代理类可以当作被代理类使用(可使用被代理类的在Subject接口中声明过的方法)
    
    •所谓Dynamic Proxy是这样一种class：它是在运行时生成的class，在生成它时你必须提供一组interface给它，然后该class就宣称它实现了这些interface。
     你当然可以把该class的实例当作这些interface中的任何一个来用。当然，这个Dynamic Proxy其实就是一个Proxy，它不会替你作实质性的工作，
     在生成它的实例时你必须提供一个handler，由它接管实际的工作
     
•通过这种方式，被代理的对象(RealSubject)可以在运行时动态改变，需要控制的接口(Subject接口)可以在运行时改变，控制的方式(DynamicSubject类)也可以动态改变，从而实现了非常灵活的动态代理关系



•动态代理是指客户通过代理类来调用其它对象的方法
•动态代理使用场合:
•调试
•远程方法调用(RMI)


动态代理步骤

    1.创建一个实现接口InvocationHandler的类，它必须实现invoke方法
    2.创建被代理的类以及接口
    3.通过Proxy的静态方法
    newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h) 创建一个代理
    4.通过代理调用方法 