package access_sample;

public class Person {
    private String name;
    private int age;

    public void showInfo() {
        System.out.println(name + "" + age + "歳");
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
