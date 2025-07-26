class Student7 {
    private int roll_no = 0;

    public int getRoll() {
        System.out.println("getRoll method");
        return roll_no;
    }

    public void setRoll(int roll) {
        if (!(roll > 100))
            roll_no = roll;
    }
}

class Day21_Task7 {
    public static void main(String[] args) {
        Student7 sobj = new Student7();
        sobj.setRoll(10);
        System.out.println("The roll no of student is " + sobj.getRoll());
    }
}
