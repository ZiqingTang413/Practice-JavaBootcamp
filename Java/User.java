/*
 * @Descripttion: 
 * @version: 
 * @Author: Tang Ziqing
 * @Date: 2023-09-24 17:00:42
 * @LastEditors: Tang Ziqing
 * @LastEditTime: 2023-09-24 17:05:20
 */
public class User {
    private String username;
    private int age;

    //public User(String username, int age) {
        //this.username = username;
        //this.age = age;
   // }

    public int getAge() {
        return this.age;
    }

    public String getUsername() {
        return this.username;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public void setUsername(String username) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be null or Blank");
        }
        this.username = username;
    }
}
