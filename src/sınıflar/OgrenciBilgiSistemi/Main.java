package sınıflar.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT", 0.20);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.30);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.25);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTEacher(t1);
        fizik.addTEacher(t2);
        kimya.addTEacher(t3);

        Student s1 = new Student("Ali Veli", 4, "123456", mat, fizik, kimya);
        s1.addBulkExamNote(50, 90, 40, 80, 50, 70);
        s1.isPass();

        Student s2 = new Student("İsmail Abi ", 4, "1112222", mat, fizik, kimya);
        s2.addBulkExamNote(30, 60, 50, 70, 75, 80);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "333455", mat, fizik, kimya);
        s3.addBulkExamNote(80, 40, 40, 30, 90, 50);
        s3.isPass();

    }

}
