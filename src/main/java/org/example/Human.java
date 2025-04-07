package org.example;


/**
 * Класс, описывающий человека.
 */
public class Human {
    private final Long age; //Значение поля должно быть больше 0

    public Human(Long age) {
        this.age = age;
        if (age != null && age <= 0) {
            throw new IllegalArgumentException("Возраст должен быть больше 0");
        }
    }

    public Long getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "_age=" + age;
    }

}
