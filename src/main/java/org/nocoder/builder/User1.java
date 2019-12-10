package org.nocoder.builder;

import java.util.Date;

/**
 * User
 * 参数较少的时候问题还不大，一旦参数多了，代码可读性就很差，并且难以维护。
 * 对调用者来说也很麻烦。如果我只想多传一个address参数，还必需给age、phone设置默认值。
 * 而且调用者还会有这样的困惑：我怎么知道第四个String类型的参数该传address还是phone？
 */
public class User1 {
    private String name;
    private Date birthday;
    private String phone;
    private String email;
    private String address;

    public User1(String name) {
        this.name = name;
    }

    public User1(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public User1(String name, Date birthday, String phone) {
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
    }

    public User1(String name, Date birthday, String phone, String email, String address) {
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}
