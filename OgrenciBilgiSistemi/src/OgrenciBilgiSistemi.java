public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
            Teacher t1 = new Teacher("Mahmut Hoca", "1233211", "TRH");
            Teacher t2 = new Teacher("Selma Hoca", "213123", "FZK");
            Teacher t3 = new Teacher("Külyutmaz", "2321123", "BIO");

            Course tarih = new Course("Tarih", "101", "TRH");
            tarih.addTeacher(t1);

            Course fizik = new Course("Fizik", "101", "FZK");
            fizik.addTeacher(t2);

            Course biyoloji = new Course("Biyoloji", "101", "BIO");
            biyoloji.addTeacher(t3);

            Student s1 = new Student("Kemal Sunal", "266", "4", tarih, fizik, biyoloji);
            s1.addBulkExamNote(100, 50, 30, 40, 60, 30);
            s1.isPass();

            Student s2 = new Student("Güdük Necmi", "468", "4", tarih, fizik, biyoloji);
            s2.addBulkExamNote(99,50,30,40,20,10);
            s2.isPass();
    }
}