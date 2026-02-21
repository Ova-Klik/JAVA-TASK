public class StudentGradeUtils{


public static String [][] total(String [][] studentRecords){
       int row = 0;
       int column = 1; 
        
       for( row = 0; row < numberOfStudents; row++){
            int total = 0;
            for(column = 1; column <= numberOfSubjects; column++){
                total += convert.stringToInteger(studentRecords[row][column]);
            }
            studentRecords[row][numberOfSubjects+1] = String.valueOf(total);
        }
        return studentRecords;
        
        }

public static String [][] average(String [][] studentRecords){  
     studentRecords=total(studentRecords);
     int row=0;
     int column=numberOfSubjects+2;
     
     for(; row<numberOfStudents; row++){
        
        double average = convert.stringToInteger(studentRecords[row][numberOfSubjects+1])/
                        (numberOfSubjects*1.0);
        studentRecords[row][column]=String.format("%.2f",average);
        
     }
     
        return studentRecords;
     
     }
     
public static String [][] position(String [][] studentRecords){ 
      studentRecords=average(studentRecords);
      int index = 0;
      int count = 0;
      
    for(; index < numberOfStudents; index++){
            int position = 1;
            for(; count < numberOfStudents; count++){
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
        
            return studentRecords;
        }

     
    
    
}

}
