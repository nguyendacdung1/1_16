public class Student extends Person {
    private int numCourses; // Số khóa học đã thực hiện
    private String[] courses; //Mã khóa học
    private int[] grades; //Điểm từng khóa học
    private static final int MAX_COURSES =30; // Khóa học tối đa

    public Student(String name, String address){
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }
    @Override
    public String toString(){
        return "Student: "+super.toString();
    }
    // Thêm 1 khóa học và điểm khóa học đó - Ko có xác thực đầu vào
    public void addCourseGrade(String course, int grade){
        courses[numCourses]=course;
        grades[numCourses]=grade;
        ++numCourses;
    }
    // In ra tất ca khóa học và điểm của chúng
    public void printGrade(){
        System.out.print(this);
        for (int i=0; i< numCourses;i++){
            System.out.print("  "+courses[i] + ":" +grades[i]);
        }
        System.out.println();
    }
    // tính điểm trung bình
    public double getAverageGrade(){
        int sum=0;
        for (int i=0;i<numCourses;i++){
            sum += grades[i];
        }
        return (double) sum/numCourses;
    }
}
