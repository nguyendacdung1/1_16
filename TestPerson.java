public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Dung","Hung yen");
        System.out.println(p1);
        p1.setAddress("Ha Noi");
        System.out.printf(""+p1);
    }
}
