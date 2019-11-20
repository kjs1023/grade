import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class gradeCalculator {
    private ArrayList<subject> subjects;
    private double avg;

    public gradeCalculator() {
        subjects = new ArrayList<>();
        avg = 0.0;
    }

    public gradeCalculator addSubject(subject... subjects){
        for(subject subject : subjects)
            this.subjects.add(subject);

        return this;
    }

    public gradeCalculator calculate(){
        double sum = 0.0;
        int sumDegree = 0;
        for(subject subject:subjects){
            if(subject.getGrade() == grade.PASS) continue;
            if(subject.getGrade() == grade.UNPASS) continue;

            sum += subject.getDegree() * subject.getGrade().getGradeDouble();
            sumDegree += subject.getDegree();
        }
        avg = sum / sumDegree;

        return this;
    }

    public double getAvg() {
        return avg;
    }

    public void saveFile(String fileName) throws IOException {
        OutputStream output = new FileOutputStream(fileName + ".txt");
        byte[] by = toString().getBytes();
        output.write(by);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (subject subject : subjects) {
            stringBuilder.append(subject + "\n");
        }
        stringBuilder.append("평균학점 : ");
        stringBuilder.append(avg);

        return stringBuilder.toString();
    }
}
