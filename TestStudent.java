public class TestStudent {
    public static void main(String[] args) {
        Student S1 = new Student("Nguyễn Đắc Dũng", "Hưng Yên");
        S1.addCourseGrade("T2109M", 98);
        S1.addCourseGrade("T2109M",97);
        S1.addCourseGrade("T2108M", 95);
        //in ra name address và khóa học và điểm
        S1.printGrade();
        //In ra Điểm trung bình
        System.out.println("Average is: "+ S1.getAverageGrade());

    }
}
