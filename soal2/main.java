/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author ACER
 */
public class main {
    public static void main(String[] args) {
        Person person = new Person("Clara", "123 Main St", "555-1234", "Clara@gmail.com");
        Student student = new Student("Jesicca", "456 Maple St", "555-5678", "sica@gmail.com",
                Student.Senior);
        Employee employee = new Employee("Alice", "789 Oak St", "555-8765", 
                "alice@gmail.com",
                "Room 101", 50000, new MyDate(2020, 1, 15));
        Faculty faculty = new Faculty("Permatasari", "321 Pine St", "555-4321", 
                "perma@gmail.com", "Room 202", 75000, new MyDate(2018, 8, 23),
                10, "Professor");
        Staff staff = new Staff("Chaplin", "654 Elm St", "555-6543", "chaplin@gmail.com"
                , "Room 303", 40000, new MyDate(2019, 3, 12), "Manager");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
