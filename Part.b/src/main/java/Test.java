import java.time.LocalDate; 
public class Test {
    
    public static void main(String[] args) {
        Test test = new Test();
        test.transaction1();
    }
    public void transaction1(){
    LocalDate date1 = LocalDate.of(2020,10,1);
    LocalDate date2 = LocalDate.of(2021,6,1);
    
    Student student1 = new Student("John O'Shea","34","30/11/1990",30);
    Student student2 = new Student("Patrick O'Mara","55","30/11/1988",32);
    Student student3 = new Student("Sean Smith","78","23/07/2000",20);
    Student student4 = new Student("Michael Scott","20","07/03/1995",25);
    Student student5 = new Student("Stan McNamara","46","22/09/1999",21);
    
    Subject subject1 = new Subject("Programming",56);
    Subject subject2 = new Subject("Machine Learning",45);
    Subject subject3 = new Subject("Software Engineering",32);
    Subject subject4 = new Subject("Calculus",10);
    Subject subject5 = new Subject("Networks",17);
    
    
    
    Course course1 = new Course("Computer Science",date1,date2);
    Course course2 = new Course("Electrical Engineering",date1,date2);
    Course course3 = new Course("Digital Media",date1,date2);
    Course course4 = new Course("Financial Mathematics",date1,date2);
    Course course5 = new Course("Electrical Engineering",date1,date2);
    
    
    student1.addSubject(subject1);
    student1.addSubject(subject3);
    student1.addSubject(subject4);
    
    student2.addSubject(subject5);
    student2.addSubject(subject1);
    student2.addSubject(subject3);
    
    student3.addSubject(subject2);
    student3.addSubject(subject3);
    student3.addSubject(subject4);
    
    student4.addSubject(subject2);
    student4.addSubject(subject5);
    student4.addSubject(subject1);
    
    student5.addSubject(subject4);
    student5.addSubject(subject5);
    student5.addSubject(subject1);
    
    
    
    student1.addCourse(course1);
    student2.addCourse(course2);
    student2.addCourse(course3);
    student3.addCourse(course2);
    student4.addCourse(course5);
    student4.addCourse(course4);
    
    course1.addSubjects(subject1);
    course1.addSubjects(subject3);
    course2.addSubjects(subject1);
    course3.addSubjects(subject4);
    course3.addSubjects(subject2);
    course4.addSubjects(subject3);
    course4.addSubjects(subject5);
    course5.addSubjects(subject5);
    course5.addSubjects(subject1);
     
    
    System.out.println("Test Scenario 1: ");
    System.out.println(course1.toString());
    System.out.println(course2.toString());
    System.out.println(course3.toString());
    System.out.println(course4.toString());
    System.out.println(course5.toString());
    System.out.println(student1.toString());
    System.out.println(student2.toString());
    System.out.println(student3.toString());
    System.out.println(student4.toString());
    System.out.println(student5.toString());
    
    
    
 }
}
