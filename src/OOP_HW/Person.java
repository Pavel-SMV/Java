package OOP_HW;

public class Person {

    private Integer age;
    private String name;
    private String status;
    public Person(String name, int age){

        this.name = name;
        this.age = age;

    }

    public String setStatus(){
        return status;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
