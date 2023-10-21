package org.example;
//**Создать справочник сотрудников
//Необходимо:
//Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//Табельный номер
//Номер телефона
//Имя
//Стаж
//Добавить метод, который ищет сотрудника по стажу (может быть список)
//Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
//Добавить метод, который ищет сотрудника по табельному номеру
//Добавить метод добавление нового сотрудника в справочник/
public class Main {
    public static void main(String[] args) {
        StaffList staff = new StaffList();

        staff.add(new Employee("Иванов","656754", 25));
        staff.add(new Employee("Семенов","3215498", 15));
        staff.add(new Employee("Петрова","922446", 10));
        staff.add(new Employee("Васильева","6434879", 5));
        staff.add(new Employee("Киселев","54432816", 2));

        System.out.println(staff);
        System.out.println();

        System.out.println(staff.findByStage(10));
        System.out.println();

        System.out.println(staff.findByName("ов").printPhoneList());

        System.out.println(staff.getById(2));
    }
}