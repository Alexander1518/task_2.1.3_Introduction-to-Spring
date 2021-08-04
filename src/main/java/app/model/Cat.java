package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private final String says;


    public Cat(String says) {
        this.says = says;
    }
    @Override
    void say() {
        System.out.println(says);
    }
    @Override
    public String toString() {
        return "Im a Cat";
    }
}