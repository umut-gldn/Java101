public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000)
            return 0;

        return this.salary * 0.03;
    }

    public double bonus() {
        if (this.workHours <= 40)
            return 0;

        return (this.workHours - 40) * 30;
    }

    public double raiseSalary() {
        int year = 2021 - hireYear;

        if (year < 10)
            return this.salary * 0.05;
        else if (year < 20)
            return this.salary * 0.1;
        else
            return this.salary * 0.15;
    }

    public void toStringEmployee() {
        double tax = tax();
        double bonus = bonus();

        double raise = raiseSalary();
        double salaryWithExtra = this.salary - tax + bonus;
        double totalSalary = salaryWithExtra + raise;

        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Calışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş Artışı: " + raise);
        System.out.println("Vergi ve bonuslarla birlikte maaş: " + salaryWithExtra);
        System.out.println("Total Maaş: " + totalSalary);

    }
}
