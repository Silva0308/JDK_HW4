package org.example;

public class Employee {
    private static int counter;
    private final Integer id;
    private final String phone;
    private final String name;
    private final Integer stage;

    public Integer getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public Integer getStage() {
        return stage;
    }

    public Employee(String name, String phone, Integer experience) {
        id = ++counter;
        this.phone = phone;
        this.name = name;
        this.stage = experience;
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                "id: " + id +
                ", телефон: '" + phone + '\'' +
                ", имя: '" + name + '\'' +
                ", стаж: " + stage +
                "}\n";
    }
}