package POO.studentsEntities;

public class Students {
    public String name;
    public double grade1, grade2, grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (finalGrade() < 60) {
            return 60 - finalGrade();
        } else {
            return 0;
        }
    }
}
