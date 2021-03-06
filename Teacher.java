public class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    private static final int MAX_COURSES = 5;

    public Teacher(String name, String address){
        super(name,address);
        numCourses=0;
        courses = new String[MAX_COURSES];
    }
    @Override
    public String toString(){
        return "Teacher: "+ super.toString();
    }

    public boolean addCourse(String course){
        for (int i=0;i<numCourses;i++){
            if (courses[i].equals(course)) return false;
        }
        courses[numCourses]=course;
        numCourses++;
        return true;
    }
//Xóa khóa học. Trả về false nếu không tìm thấy khóa học trong danh sách khóa học
    public boolean removeCourse(String course){
        boolean found = false;
//Tìm kiếm chỉ mục khóa học
        int courseIndex = -1; // cần khởi tạo
        for (int i = 0; i<numCourses; i++){
            if(courses[i].equals(course)){
                courseIndex=i;
                found=true;
                break;
            }
        }
        if (found){
            for (int i=courseIndex;i<numCourses;i++){
                courses[i]=courses[i+1];
            }
            numCourses--;
            return true;
        }else {
            return false;
        }
    }
}
