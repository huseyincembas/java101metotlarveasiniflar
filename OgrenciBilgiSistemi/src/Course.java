public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int noteVerbal;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        note = 0;
        noteVerbal = 0;
    }

    void printTeacher(){
        this.teacher.print();
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix))
        {
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve ders uyuşmuyor.");
        }
    }
}
