/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */
package com.geek45.quartzmapstructlogdemo.model;

/**
 * @ClassName: StudentDO
 * @Decription:
 * @Author: rubik
 *  rubik create StudentDO.java of 2021/12/29 7:27 下午
 */
public class StudentDO {

    private Long id;
    private String name;
    private String studentCard;
    private String age;
    private String phone;
    private String address;

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
