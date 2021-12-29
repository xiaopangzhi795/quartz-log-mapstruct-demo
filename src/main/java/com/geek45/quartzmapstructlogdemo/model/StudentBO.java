/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */
package com.geek45.quartzmapstructlogdemo.model;

import java.io.Serializable;

/**
 * @ClassName: StudentBO
 * @Decription:
 * @Author: rubik
 *  rubik create StudentBO.java of 2021/12/29 7:29 下午
 */
public class StudentBO implements Serializable {

    private String name;
    private String studentCard;
    private String age;
    private String phone;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(String studentCard) {
        this.studentCard = studentCard;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
