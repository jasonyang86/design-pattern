package org.nocoder.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    /**
     * User类的构造方法是私有的。也就是说调用者不能直接创建User对象。
     * User类的属性都是不可变的。所有的属性都添加了final修饰符，并且在构造方法中设置了值。并且，对外只提供getters方法。
     * Builder模式使用了链式调用。可读性更佳。
     * Builder的内部类构造方法中只接收必传的参数，并且该必传的参数使用了final。
     * 相比于前面两种方法，Builder模式拥有其所有的优点，而没有上述方法中的缺点。
     * 客户端的代码更容易写，并且更重要的是，可读性非常好。
     * 唯一可能存在的问题就是会产生多余的Builder对象，消耗内存。
     * 然而大多数情况下我们的Builder内部类使用的是静态修饰的(static)，所以这个问题也没多大关系。
     *
     */
    @Test
    public void createUser(){
        User user = new User.Builder("Jason", 30).phone("15802882099").build();
        assertEquals("Jason", user.getName());
        assertEquals("15802882099", user.getPhone());
    }

    /**
     *  线程安全问题：
     *  Builder是非线程安全的，如果要在Builder内部类中检查一个参数的合法性，必须要在对象创建完成后再检查。
     */
    @Test
    public void testThreadSafe(){

    }
}
