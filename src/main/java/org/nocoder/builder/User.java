package org.nocoder.builder;

/**
 * 第三种解决方案：Builder
 * User类的构造方法是私有的。也就是说调用者不能直接创建User对象。
 * User类的属性都是不可变的。所有的属性都添加了final修饰符，并且在构造方法中设置了值。并且，对外只提供getters方法。
 * Builder模式使用了链式调用。可读性更佳。
 * Builder的内部类构造方法中只接收必传的参数，并且该必传的参数使用了final。
 * 相比于前面两种方法，Builder模式拥有其所有的优点，而没有上述方法中的缺点。
 * 客户端的代码更容易写，并且更重要的是，可读性非常好。
 * 唯一可能存在的问题就是会产生多余的Builder对象，消耗内存。
 * 然而大多数情况下我们的Builder内部类使用的是静态修饰的(static)，所以这个问题也没多大关系。
 *
 * 线程安全问题：
 * Builder是非线程安全的，如果要在Builder内部类中检查一个参数的合法性，必须要在对象创建完成后再检查。
 */
public class User {
    private final String name;
    private final int age;
    private final String phone;
    private final String email;
    private final String address;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.phone = builder.phone;
        this.email = builder.email;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {
        private final String name;
        private final int age;
        private String phone;
        private String email;
        private String address;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * 首先创建对象，然后再检查参数，保证线程安全
         *
         * @return
         */
        public User build() {
            User user = new User(this);
            if(user.getAge() > 120){
                throw new IllegalArgumentException("Age out of range.");
            }
            return user;
        }

        /**
         * 非线程安全写法
         *
         * @return
         */
        @Deprecated
        public User buildNotThreadSafe() {
            if(age > 120){
                throw new IllegalArgumentException("Age out of range.");
            }
            return new User(this);
        }
    }
}
