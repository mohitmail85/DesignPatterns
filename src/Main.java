public class Main {
    public static void main(String[] args) {
        /* student class has getBuilder method which will return Build object, Set all props of student class using
        Builder setter methods, finally call build method which will further call student constructor and set all
        props */
       Student student = Student.getBuilder()
                        .setAge(22)
                        .setBatch("Morning")
                        .setPsp(80)
                        .setGradYear(2015)
                        .setPhoneNumber("9911991199")
                        .setUnivName("DU")
                        .setName("SamBahadur")
                        .build();

       student.showStudentInfo();

    }
}