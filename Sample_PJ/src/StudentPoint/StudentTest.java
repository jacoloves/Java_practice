package StudentPoint;

public class StudentTest {
    public static void main(String[] args) {


        Student[] data = {
                new Student("testSamp@le1", 65, 90, 100),
                new Student("testSamp@le2", 82, 73, 64),
                new Student("testSamp@le3", 74, 31, 42),
                new Student("testSamp@le4", 100, 95, 99),
        };
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + "\t-> " + data[i].total());
        }
    }
}
