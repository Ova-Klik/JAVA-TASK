public class GradeBookTest {

    public static void main(String[] args) {

        GradeBook classA = new GradeBook(2, 2);
        GradeBook classB = new GradeBook(3, 3);
        GradeBook classC = new GradeBook(3, 2); 

        //class A
        classA.setScore(0, 0, 80);
        classA.setScore(0, 1, 70);
        classA.setScore(1, 0, 60);
        classA.setScore(1, 1, 90);

        classA.finalizeCalculations();
        classA.displayReportCard();

        //class B
        classB.setScore(0, 0, 50);
        classB.setScore(0, 1, 40);
        classB.setScore(0, 2, 60);

        classB.setScore(1, 0, 70);
        classB.setScore(1, 1, 80);
        classB.setScore(1, 2, 90);

        classB.setScore(2, 0, 30);
        classB.setScore(2, 1, 20);
        classB.setScore(2, 2, 10);

        classB.finalizeCalculations();
        classB.displayReportCard();
        
        //classC
        
        classC.setScore(0, 0, 90);
        classC.setScore(0, 1, 80);
        
        classC.setScore(1, 0, 100);
        classC.setScore(1, 1, 90);
        
        classC.setScore(2, 0, 100);
        classC.setScore(2, 1, 80);
        
        classC.finalizeCalculations();
        classC.displayReportCard();
    }
}
