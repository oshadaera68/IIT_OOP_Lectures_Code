/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Cat {
    private String name;
    private int age;
    private CatType type;

    public Cat(String name, int age, CatType type) { 
        this.name = name;
        // this.age = age;
        this.setAge(age);
        this.type = type;
    }

    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }else{
            throw new IllegalArgumentException("Age cannot be less than 0");
        }
    }

    public CatType getType() {
        return type;
    }

    public void setType(CatType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }
}
