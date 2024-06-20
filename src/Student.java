public class Student {
    String name;
    int age;
    String univName;
    double psp;
    String batch;
    int gradYear;
    String phoneNumber;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.univName = builder.univName;
        this.psp = builder.psp;
        this.batch = builder.batch;
        this.gradYear = builder.gradYear;
        this.phoneNumber = builder.phoneNumber;
    }

    public void showStudentInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("UnivName: " + univName);
        System.out.println("PSP: " + psp);
        System.out.println("Batch: " + batch);
        System.out.println("Grad Year: " + gradYear);
        System.out.println("Phone Number: " + phoneNumber);

    }


    // inner class for builder - this class will be responsible to take overhead of setter and getter methods of student
    // class. Also return student object after setting props
    public static class Builder{
        String name;
        int age;
        String univName;
        double psp;
        String batch;
        int gradYear;
        String phoneNumber;

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public String getUnivName(){
            return univName;
        }

        public double getPsp(){
            return psp;
        }
        public String getBatch(){
            return batch;
        }

        public int getGradYear(){
            return gradYear;
        }

        public String getPhoneNumber(){
            return phoneNumber;
        }

        public Builder  setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder  setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public Builder  setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder  setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder  setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder  setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
