import java.util.Scanner;
import java.util.Arrays;



public class StudentGrade{

    static MyMethods convert= new MyMethods();
    static int numberOfStudents;
    static int numberOfSubjects;

    public static void main (String...args){
    
    Scanner collect = new Scanner(System.in);
    StudentGradeUtils student = new StudentGradeUtils();
    
    System.out.printf("%nKindly enter the number of students: ");
    String numberOfStudent= collect.nextLine();
    
    System.out.printf("%nKindly enter number of subjects: ");
    String numberOfSubject= collect.nextLine();
    
    numberOfStudents= convert.stringToInteger(numberOfStudent);
    numberOfSubjects= convert.stringToInteger(numberOfSubject);
    
    
    String [][] studentRecords= new String [numberOfStudents][numberOfSubjects + 4];
    
    for(int row=0; row<numberOfStudents; row++){

    System.out.printf("%nKindly enter name of student %d: ",row+1);
    studentRecords[row][0] = collect.nextLine(); 
       
       
    for(int column=1; column<numberOfSubjects+1; column++){
        
                System.out.printf("%nKindly enter score for subject %d: ",  column);
                studentRecords[row][column] = collect.nextLine(); 
            }
        }
        
        
        student.studentRecords=position(studentRecords);
        
        System.out.printf(Arrays.deepToString(studentRecords));
        
        
        }
        
      
       
     }
