package com.syaaa.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @ClassName ReflectTest
 * @Description TODO
 * @Author APPO
 * @Date 16:33   2018-9-5
 * @Version 1.0
 **/
public class ReflectTest {

    /**
     * @Author APPO
     * @Description //对Cusomer对象的拷贝
     * @Date 16:35 2018-9-5
     * @Param [object]
     * @return java.lang.Object
     **/
    public Object copy(Object object) throws  Exception{

        Class<?> classType = object.getClass();

        /*对Cusomer类中的构造方法进行传值*/
        Constructor constructor = classType.getConstructor(new Class[]{String.class,Integer.class});
        Object obj = constructor.newInstance(new Object[]{"hello",3});

        System.out.println(obj);

        /*对Customer类中的name 进行赋值*/
        Method setMethod = classType.getMethod("setName", new Class[]{String.class});
        setMethod.invoke(obj,new Object[]{"张三"});

        /*取得Customer类中的name 值*/
        Method method = classType.getMethod("getName", new Class[]{});
        Object reuslt = method.invoke(obj,new Object[]{} );

        System.out.println(reuslt);



        /*
        *   等价于  obj = classType.newInstance();
        *   classType.newInstance();只能获取无参的构造方法，对于有参数的构造方法需要采用上述的方式进行接收
        * */

        return  null;
    }

    /**
     * @Author APPO
     * @Description //TODO 程序运行的主方法
     * @Date 16:36 2018-9-5
     * @Param [args]
     * @return void
     **/
    public static void main(String[] args) throws  Exception {
        ReflectTest reflectTest = new ReflectTest();
        reflectTest.copy(new Customer());

    }


}

class Customer{

    private Long id;

    private String name;

    private Integer age;

    public Customer() {

    }

    public Customer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
