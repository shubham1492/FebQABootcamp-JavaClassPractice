package Day7.statickeyword;

public class Student {

    int rollNo;
    String name;
    static String college = "ITS";

    static void change(){
        college = "BTS";
    }

    Student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    void display(){
        System.out.println(rollNo+" "+name+" "+college);
    }

}
