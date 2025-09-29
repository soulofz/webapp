package HW30.Builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder().setName("Zhan").setSurname("Efimenko").setAge(24).setId(1).build();
        System.out.println(user.toString());
        LombokUser lombokUser = LombokUser.builder().name("Alex").surname("Gilep").age(24).id(2).build();
        System.out.println(lombokUser.toString());
    }
}
