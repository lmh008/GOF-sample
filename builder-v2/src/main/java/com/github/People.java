package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/9/29.
 * Version v1.0
 */
public class People {

    private String id; //必要属性

    private String name; //必要属性

    private String gender; //非必要属性

    private Integer age; //非必要属性

    private String hobby; //非必要属性

    private People() {
    }

    public static class Builder {

        People people;

        private Builder(String id, String name) {
            people = new People();
            people.id = id;
            people.name = name;
        }

        public Builder gender(String gender) {
            this.people.gender = gender;
            return this;
        }

        public Builder age(int age) {
            this.people.age = age;
            return this;
        }

        public Builder hobby(String hobby) {
            this.people.hobby = hobby;
            return this;
        }

        public People build() {
            if (this.people.age != null && this.people.age < 0) {
                throw new IllegalStateException("age wrong");
            }
            return this.people;
        }
    }

    public static Builder getBuilder(String id, String name) {
        return new Builder(id, name);
    }

    public void sayHello() {
        System.out.println(" id: " + id + " name: " + name);
        if (this.gender != null) {
            System.out.println(name + " gender is : " + gender);
        }
        if (this.age != null) {
            System.out.println(name + " age is : " + age);
        }
    }


}
