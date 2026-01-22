public class Course {
    private String courseName;
    private String courseCode;
    private String[] evaluations;
    private double[] grades;
    private int numberOfGrades;

    public Course(String courseName, String courseCode, int numberOfEvaluations) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.evaluations = new String[numberOfEvaluations];
        this.grades = new double[numberOfEvaluations];
        this.numberOfGrades = 0;
    }

    public void addEvaluation(String evaluationName, double grade) {

        if(numberOfGrades >= evaluations.length) {
            System.err.println("Cannot add more evaluations, array is full.");
            return;
        }

        this.evaluations[numberOfGrades] = evaluationName;
        this.grades[numberOfGrades] = grade;
        numberOfGrades++;
    }
    public Object[] getEvaluations(int index) {
        if(index >= 0 && index < numberOfGrades){
            return new Object[] {this.evaluations[index], this.grades[index]};
        }
        return null;
    }
}
