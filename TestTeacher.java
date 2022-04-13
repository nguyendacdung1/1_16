public class TestTeacher {
    public static void main(String[] args) {
        Teacher T1 = new Teacher("Dang Kim Thi", "vinhome");
        System.out.println(T1);

        String[] courses = {"T2109M", "T2108M", "T4143M","r24524m"};
        for (String course: courses){
            if (T1.addCourse(course)){
                System.out.println(course+ " added");
            }else {
                System.out.println(course+ "cannot be added");
            }
        }
        for (String course: courses) {
            if (T1.removeCourse(course)) {
                System.out.println(course + " removed");
            } else {
                System.out.println(course + " cannot be removed");
            }
        }
    }
}
