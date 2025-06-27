package access_sample;

public class User {
    private String id;
    private String name;
    private int age;
    private String pass;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPass() {
        return pass;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
