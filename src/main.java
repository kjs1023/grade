import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        gradeCalculator gradeCalculator = new gradeCalculator();

        gradeCalculator.addSubject
                (new subject("C++ 프로그래밍", "이재협", 3, grade.APLUS),
                (new subject("컴퓨터공학입문", "김홍연", 3, grade.F)),
                (new subject("대생비", "양지우", 1, grade.PASS)))
                .calculate()
                .saveFile("학점");
        System.out.println(gradeCalculator);
    }
}
