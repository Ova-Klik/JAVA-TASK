import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{

    static MyMethods convert = new MyMethods();
    static Scanner collect = new Scanner(System.in);

    public static void main (String...args){

        System.out.printf("%nKindly enter the number of students: ");
        String numberOfStudent = collect.nextLine();

        System.out.printf("%nKindly enter the number of subjects: ");
        String numberOfSubject = collect.nextLine();

        int numberOfStudents = convert.stringToInteger(numberOfStudent);
        int numberOfSubjects = convert.stringToInteger(numberOfSubject);

        String [][] studentRecords = new String [numberOfStudents][numberOfSubjects + 3];

        for(int row = 0; row < numberOfStudents; row++){
            System.out.printf("%nKindly enter name of student %d: ", row+1);
            studentRecords[row][0] = collect.nextLine();

            for(int column = 1; column <= numberOfSubjects; column++){
                System.out.printf("%nKindly enter score for subject %d: ", column);
                studentRecords[row][column] = collect.nextLine();
            }
        }

        for(int row = 0; row < numberOfStudents; row++){
            int total = 0;
            for(int column = 1; column <= numberOfSubjects; column++){
                total += convert.stringToInteger(studentRecords[row][column]);
            }
            studentRecords[row][numberOfSubjects] = String.valueOf(total);
        }

        for(int row = 0; row < numberOfStudents; row++){
            int total = convert.stringToInteger(studentRecords[row][numberOfSubjects]);
            double average = total / (numberOfSubjects * 1.0);
            studentRecords[row][numberOfSubjects+1] = String.format("%.2f", average);
        }

        for(int index = 0; index < numberOfStudents; index++){
            int position = 1;
            for(int count = 0; count < numberOfStudents; count++){
                if(count != index){
                    double avgIndex = Double.parseDouble(studentRecords[index][numberOfSubjects+1]);
                    double avgCount = Double.parseDouble(studentRecords[count][numberOfSubjects+1]);
                    if(avgCount > avgIndex){
                        position++;
                    }
                }
            }
            studentRecords[index][numberOfSubjects+2] = String.valueOf(position);
        }

        System.out.println("===".repeat(20));
        System.out.printf("%-20s", "NAME");
        for(int subject = 1; subject <= numberOfSubjects; subject++){
            System.out.printf("%-10s", "SUB"+subject);
        }
        System.out.printf("%-10s%-10s%-10s%n", "TOTAL", "AVERAGE", "POSITION");
        System.out.println("===".repeat(20));

        for(int row = 0; row < numberOfStudents; row++){
            System.out.printf("%-20s", studentRecords[row][0]);
            for(int column = 1; column <= numberOfSubjects+2; column++){
                System.out.printf("%-10s", studentRecords[row][column]);
            }
            System.out.println();
        }

        System.out.println("===".repeat(20));
    }
}

