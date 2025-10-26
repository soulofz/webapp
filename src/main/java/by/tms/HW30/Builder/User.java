package by.tms.HW30.Builder;

public class User {
    private String name;
    private String surname;
    private int age;
    private int id;

    public static class Builder {
        private final User user;

        public Builder() {
            user = new User();
        }

        public Builder setName(String name) {
            user.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            user.surname = surname;
            return this;
        }

        public Builder setAge(int age) {
            user.age = age;
            return this;
        }

        public Builder setId(int id) {
            user.id = id;
            return this;
        }

        public User build() {
            return user;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
