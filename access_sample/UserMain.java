package access_sample;

public class UserMain {
    public static void main(String[] args) {
        User user = new User();
        user.setId = "1234";
        user.name = "大阪太郎";
        user.age = 20;
        user.pass = "0";

        String id = user.getId();
        System.out.println(id);
    }
}
