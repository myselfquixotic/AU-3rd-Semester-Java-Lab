package Practicum2;
class Student{
    int studentId;
    String studentName;
    String department;
    Student(int id,String name,String dept){
        studentId=id;
        studentName=name;
        department=dept;
    }
    void displayStudentDetails(){
        if(studentId<=0){
            System.out.println("Invalid Student ID");
            return;
        }
        if(studentName.equals("")){
            System.out.println("Empty Student Name");
            return;
        }
        System.out.println("Student ID: "+studentId);
        System.out.println("Student Name: "+studentName);
        System.out.println("Department: "+department);
    }
}
class UndergraduateStudent extends Student{
    int semester;
    double cgpa;
    UndergraduateStudent(int id,String name,String dept,int sem,double cgpaValue){
        super(id,name,dept);
        semester=sem;
        cgpa=cgpaValue;
    }
    void displayUGDetails(){
        if(semester<1||semester>8){
            System.out.println("Invalid Semester");
            return;
        }
        if(cgpa<0||cgpa>10){
            System.out.println("Invalid CGPA");
            return;
        }
        System.out.println("Semester: "+semester);
        System.out.println("CGPA: "+cgpa);
    }
}
class PostgraduateStudent extends Student{
    String specialization;
    String researchTopic;
    PostgraduateStudent(int id,String name,String dept,String spec,String topic){
        super(id,name,dept);
        specialization=spec;
        researchTopic=topic;
    }
    void displayPGDetails(){
        if(researchTopic.equals("")){
            System.out.println("Empty Research Topic");
            return;
        }
        System.out.println("Specialization: "+specialization);
        System.out.println("Research Topic: "+researchTopic);
    }
}
public class Practicum2{
    public static void main(String[] args){
        UndergraduateStudent ug1=new UndergraduateStudent(101,"Ravi","CSE",5,8.75);
        ug1.displayStudentDetails();
        ug1.displayUGDetails();
        System.out.println();
        PostgraduateStudent pg1=new PostgraduateStudent(201,"Anita","ECE","AI","Computer Vision");
        pg1.displayStudentDetails();
        pg1.displayPGDetails();
        System.out.println();
        UndergraduateStudent student=new UndergraduateStudent(102,"Kiran","ISE",3,8.50);
        student.displayStudentDetails();
        System.out.println();
        UndergraduateStudent ug2=new UndergraduateStudent(103,"Rahul","CSE",7,9.10);
        ug2.displayUGDetails();
        System.out.println();
        PostgraduateStudent pg2=new PostgraduateStudent(202,"Priya","CSE","Data Science","NLP");
        pg2.displayPGDetails();
        System.out.println();
        UndergraduateStudent ug3=new UndergraduateStudent(-10,"Ravi","CSE",5,8.75);
        ug3.displayStudentDetails();
        System.out.println();
        UndergraduateStudent ug4=new UndergraduateStudent(104,"","CSE",5,8.75);
        ug4.displayStudentDetails();
        System.out.println();
        UndergraduateStudent ug5=new UndergraduateStudent(105,"Arun","CSE",10,8.75);
        ug5.displayUGDetails();
        System.out.println();
        UndergraduateStudent ug6=new UndergraduateStudent(106,"Vijay","CSE",5,11.5);
        ug6.displayUGDetails();
        System.out.println();
        PostgraduateStudent pg3=new PostgraduateStudent(203,"Meena","ECE","AI","");
        pg3.displayPGDetails();
    }
}