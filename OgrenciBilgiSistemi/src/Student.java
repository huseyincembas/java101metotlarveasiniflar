public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass;

    Student(String name, String stuNO, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNO;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int noteVerbal1, int noteVerbal2, int noteVerbal3){
        if(note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if(note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if(noteVerbal1 >= 0 && noteVerbal1 <= 100){
            this.c1.noteVerbal = noteVerbal1;
        }
        if(noteVerbal2 >= 0 && noteVerbal2 <= 100){
            this.c2.noteVerbal = noteVerbal2;
        }
        if(noteVerbal3 >= 0 && noteVerbal3 <= 100){
            this.c3.noteVerbal = noteVerbal3;
        }
    }

    void isPass(){
         this.average = (((this.c1.note * .80) + (this.c1.noteVerbal * .20)) + ((this.c2.note * 0.80) + (this.c2.noteVerbal * 0.20)) + ((this.c3.note * 0.80) + (this.c3.noteVerbal * 0.20))) / 3;
         printNote();
         if(this.average >= 55){
             System.out.println("Sınıfı geçtiniz.");
             this.isPass = true;
         }else {
             System.out.println("Sınıfta kaldınız.");
             this.isPass = false;
         }
    }

    void printNote(){
        System.out.println(this.c1.name + " Notu: " + this.c1.note);
        System.out.println(this.c1.name + " Sözlü Notu: " + this.c1.noteVerbal);
        System.out.println(this.c2.name + " Notu: " + this.c2.note);
        System.out.println(this.c2.name + " Sözlü Notu: " + this.c2.noteVerbal);
        System.out.println(this.c3.name + " Notu: " + this.c3.note);
        System.out.println(this.c3.name + " Sözlü Notu: " + this.c3.noteVerbal);

        System.out.println("Ortalamanız = " + this.average);
    }
}
