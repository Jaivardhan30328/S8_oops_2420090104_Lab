package lab4;

class Student {
    private int rollNumber;
    protected char grade;
    public String name;

    public void setDetails(int roll, char g, String n) {
        this.rollNumber = roll;
        this.grade =g;
        this.name = n;
    }
}
