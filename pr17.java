interface Exam {
    boolean isPassed(int mark);
}
interface Classify {
    String getDivision(double average);
}
class Result implements Exam, Classify {
    public boolean isPassed(int mark) {
        return mark >= 35;
    }
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Result r = new Result();
        int mark = 70;
        double avg = 65.5;
        System.out.println("Passed: " + r.isPassed(mark));
        System.out.println("Division: " + r.getDivision(avg));
    }
}

// Output:
// Passed: true
// Division: First Division
