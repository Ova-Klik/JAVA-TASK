import java.util.Scanner;
import java.util.Arrays;



public class StudentGrade{

    static MyMethods convert= new MyMethods();
    
    static Scanner collect = new Scanner(System.in);

    public static void main (String...args){
    
    
    System.out.printf("%nKindly enter the number of students: ");
    String numberOfStudent= collect.nextLine();
    
    System.out.printf("%nKindly enter number of subjects: ");
    String numberOfSubject= collect.nextLine();
    
    int numberOfStudents= convert.stringToInteger(numberOfStudent);
    int numberOfSubjects= convert.stringToInteger(numberOfSubject);
    
    
    String [][] studentRecords= new String [numberOfStudents][numberOfSubjects + 4];
    
    for(int row=0; row<numberOfStudents; row++){

    System.out.printf("%nKindly enter name of student %d: ",row+1);
    studentRecords[row][0] = collect.nextLine(); 
       
       
    for(int column=1; column<numberOfSubjects+1; column++){
        
                System.out.printf("%nKindly enter score for subject %d: ",  column);
                studentRecords[row][column] = collect.nextLine(); 
            }
        }
        
        
       public static String [][] total(String [][] studentRecords){
        
       for(int row = 0; row < numberOfStudents; row++){
            int total = 0;
            for(int column = 1; column <= numberOfSubjects; column++){
                total += convert.stringToInteger(studentRecords[row][column]);
            }
            studentRecords[row][numberOfSubjects+1] = String.valueOf(total);
        }
        return studentRecords[row][numberOfSubjects+1];
        
        }
       
     for(int row=0; row<numberOfStudents; row++){
        int column=numberOfSubjects+2;
        double average = convert.stringToInteger(studentRecords[row][numberOfSubjects+1])/
                        (numberOfSubjects*1.0);
        studentRecords[row][column]=String.format("%.2f",average);
     }
     
     
    for(int index = 0; index < numberOfStudents; index++){
            int position = 1;
            for(int count = 0; count < numberOfStudents; count++){
                if(count != index){
                    double avgIndex = Double.parseDouble(studentRecords[index][numberOfSubjects+2]);
                    double avgCount = Double.parseDouble(studentRecords[count][numberOfSubjects+2]);
                    if(avgCount > avgIndex){
                        position++;
                    }
                }
            }
            studentRecords[index][numberOfSubjects+3] = String.valueOf(position);
        }

     System.out.printf(Arrays.deepToString(studentRecords));
    
    }
}
