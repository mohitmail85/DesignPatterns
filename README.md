# Student Builder Design Pattern

This project demonstrates the use of the Builder Design Pattern to create instances of a `Student` class. The Builder Design Pattern helps in constructing complex objects by providing a simple and readable API.

## Class Structure

### Student Class

The `Student` class represents a student with the following properties:
- `name`: The name of the student.
- `age`: The age of the student.
- `univName`: The name of the university.
- `psp`: The percentage of successful performance.
- `batch`: The batch of the student.
- `gradYear`: The graduation year of the student.
- `phoneNumber`: The phone number of the student.

### Builder Class

The `Builder` class is an inner static class of the `Student` class. It provides a way to set the properties of the `Student` class and construct an instance of it.

## Usage

### Creating a Student Object

To create a `Student` object, you need to use the `Builder` class. Below is an example of how to create a `Student` object:

```java
public class Main {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
            .setName("John Doe")
            .setAge(22)
            .setUnivName("XYZ University")
            .setPsp(85.5)
            .setBatch("2020")
            .setGradYear(2024)
            .setPhoneNumber("123-456-7890")
            .build();

        student.showStudentInfo();
    }
}
