package sınıflar.OgrenciBilgiSistemi;

public class Student {
    String name;
    String studentNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    public Student(String name, int classes, String studentNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.average = 0;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int matQuiz, int fizik, int fizikQuiz, int kimya, int kimyaQuiz) {
        if (mat >= 0 && mat <= 100)
            this.mat.note = mat;
        if (matQuiz >= 0 && matQuiz <= 100)
            this.mat.quizNote = matQuiz;

        if (fizik >= 0 && fizik <= 100)
            this.fizik.note = fizik;
        if (fizikQuiz >= 0 && fizikQuiz <= 100)
            this.fizik.quizNote = fizikQuiz;

        if (kimya >= 0 && kimya <= 100)
            this.kimya.note = kimya;
        if (kimyaQuiz >= 0 && kimyaQuiz <= 100)
            this.kimya.quizNote = kimyaQuiz;
    }

    public void calcAverage() {
        this.average = (mat.calcCourseNote() + fizik.calcCourseNote() + kimya.calcCourseNote()) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.printf("Ortalama : %.2f%n", this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void printNote() {
        System.out.println("-----------------------------");
        System.out.println("Öğrenci : " + this.name);
        System.out.printf("Matematik Notu : %.2f%n", mat.calcCourseNote());
        System.out.printf("Fizik Notu     : %.2f%n", fizik.calcCourseNote());
        System.out.printf("Kimya Notu     : %.2f%n", kimya.calcCourseNote());
    }
}
