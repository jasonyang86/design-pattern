package org.nocoder.builder;

import java.util.Date;

/**
 * User
 * 第二种解决方案，使用JavaBean的方式，空的构造方法，getter setter方法
 *
 * 这种解决方案带来的问题：
 * 对象会产生不一致的状态。当你想要传入5个参数的时候，你必需将所有的setXX方法调用完成之后才行。
 * 然而一部分的调用者看到了这个对象后，以为这个对象已经创建完毕，就直接食用了，其实User对象并没有创建完成。
 *
 * User类是可变的了，不可变类所有好处都不复存在。
 *
 */
public class User2 {
    private String name;
    private Date birthday;
    private String phone;
    private String email;
    private String address;

    public User2(String name) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
