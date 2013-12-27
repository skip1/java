package student;
import java.util.Scanner;
import java.util.ArrayList;
 
public class Student
{
    ArrayList<Student> students = new ArrayList<Student>();
    private static void addStudent(ArrayList<Student> students) {
       
        Scanner inputA = new Scanner (System.in);
        System.out.println("First Name:");
        String firstName = inputA.nextLine();
        System.out.println("Last Name:");
        String lastName = inputA.nextLine();
        System.out.println("grade");
        double grade = inputA.nextDouble();
        System.out.print("\n" + firstName + "\n" + lastName + "\n" + grade);
        
      }

    /**
     *
     * @param students
     */
    public static void displayAllStudents(ArrayList<Student> students) {
        for (Student s: students) {
            System.out.print (s.getFirstName());
        }
    }
      public  static void findStudent(ArrayList<Student> students)
    {
        Scanner inputN = new Scanner(System.in);
        String find = inputN.next();
        for(Student s: students)
        {
            if(s.getFirstName().equals(find))
            {
                System.out.println(s.getFirstName()+ " " + s.getLastName());
                System.out.println("Your grade is +" + "" + s.getGrade());
                //   System.out.println(s.getFirstName()+ ":" + s.getLastName());
            //   System.out.println(s.getGrade());
            }
             
        }
         //  return findStudent(s);      
    }
    
    private String firstName;
    private String lastName;
    private Double grade;

    /**
     *
     
     
     
     *
/*    public Student(String firstName, String lastName,Double grade) {
        
    }
       
*/   
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String name) {
       this.firstName = name;
    }
 
    public String getLastName    () {
        return lastName;
    }
 
    public void setLastName (String name) {
        this.lastName = name;
    
}
    
    public double setGrade() {
        return grade;
    }
    
    public double getGrade()  {
        this.grade = grade;
        return grade;
    }
    
    public static void main(String args[])
    {
        ArrayList<Student> students = new ArrayList<Student>();
        int choice;
          
        printMenu();
         
        do
        {
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
        
        switch (choice)
        {
            case 1: System.out.println("\nAdd a student\n");
                addStudent(students);
                printMenu();
                break;
                
            case 2: System.out.println("\nFind a student\n");
                    findStudent(students);
                    printMenu();
                break;
                
            case 3: System.out.println("\nDisplay all students\n");
                displayAllStudents(students);
                printMenu();
                break;
                
            
                
            case 4: System.out.println("\nExit\n");
                break;
                
            default: System.out.println("\nYour choice," + choice
                                                + ", is invalid\n");
                break;
        }
        }while(choice != 0);      
    }
     
    public static void printMenu(){
        System.out.println(
                "\nPlease select from the following menu:\n"
                +"\t1. Add a student\n"
                +"\t2. Find a student\n"
                +"\t3. Display all students\n"
                +"\t4. Exit\n");
            System.out.print("Your choice: ");
    }
    
    
    
  /*  public static void addStudent()
    {
        Scanner inputA = new Scanner (System.in);
        System.out.println("First Name:");
        String firstName = inputA.nextLine();
        System.out.println("Last Name:");
        String lastName = inputA.nextLine();
        System.out.println("grade");
        double grade = inputA.nextDouble();
        System.out.print(firstName);
        System.out.print(lastName);
        System.out.print(grade);
   */  
     
 /*   public static void displayAllStudents(ArrayList<Student> students) {
        for (Student s: students) {
            System.out.print(s.toString());
        }
    }*/
     
 /* public static Student findStudent(ArrayList<Student> students)
    {
        Scanner inputN = new Scanner(System.in);
        String name = inputN.nextLine();
        for(Student s: students)
        {
            if(s.getFirstName().equals(name))
            {
                System.out.println(s);
            }
             
        }
            return findStudent(students);      
    }
*/  
}

   