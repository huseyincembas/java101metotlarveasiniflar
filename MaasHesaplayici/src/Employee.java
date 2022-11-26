public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    int bonusCount;
    int bonusMoney;
    int hireYearCount;
    double salaryRaiseAmount;
    double salaryTaxBonus;
    double salaryLast;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(){
        if(this.salary <= 1000){
            tax = 0;
        }
        if(this.salary > 1000){
            tax = this.salary * 0.03;
        }


    }

    void bonus(){
        bonusCount = this.workHours - 40;
        if(bonusCount <= 0){
            bonusMoney = 0;
        }else {
            bonusMoney = bonusCount * 30;
        }
    }

    void raiseSalary(){
        hireYearCount = 2021 - this.hireYear;
        if(hireYearCount < 10){
            salaryRaiseAmount = this.salary * 0.05;
        }
        if(hireYearCount >= 10 && hireYearCount < 20){
            salaryRaiseAmount = this.salary * 0.10;
        }
        if (hireYearCount >= 20){
            salaryRaiseAmount = this.salary * 0.15;
        }
    }

    void run(){
        System.out.println("==========================");
        tax();
        bonus();
        raiseSalary();
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonusMoney);
        System.out.println("Maaş Artışı: " + salaryRaiseAmount);
        salaryTaxBonus = this.salary - tax + bonusMoney;
        System.out.println("Vergi ve Bonuslar ile birlite maaş: " + salaryTaxBonus);
        salaryLast = this.salary + salaryRaiseAmount;
        System.out.println("Toplam Maaş: " + salaryLast);
    }
}
