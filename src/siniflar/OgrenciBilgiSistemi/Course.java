package siniflar.OgrenciBilgiSistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int quizNote;
    double quizEffect;

    public Course(String name, String code, String prefix, double quizEffect) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quizNote = 0;
        this.quizEffect = quizEffect;
    }

    public double calcCourseNote() {
        return (quizNote * quizEffect) + (note * (1 - quizEffect));
    }

    public void addTEacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.courseTeacher = teacher;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(teacher.name + " bu dersi veremez. ");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin hocası :" + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine hoca atanmamıştır");
        }

    }
}
