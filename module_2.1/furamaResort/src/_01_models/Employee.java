package _01_models;

public class Employee {
    private String nameEmployee;
    private String birthdayEmployee;
    private long idCardEmployee;
    private long numberphone;
    private String emailEmployee;
    private String levelEmployee;
    private String positionEmployee;
    private double salaryEmployee;

    public Employee() {
    }

    public Employee(String nameEmployee, String birthdayEmployee, long idCardEmployee, long numberphone, String emailEmployee, String levelEmployee, String positionEmployee, double salaryEmployee) {
        this.nameEmployee = nameEmployee;
        this.birthdayEmployee = birthdayEmployee;
        this.idCardEmployee = idCardEmployee;
        this.numberphone = numberphone;
        this.emailEmployee = emailEmployee;
        this.levelEmployee = levelEmployee;
        this.positionEmployee = positionEmployee;
        this.salaryEmployee = salaryEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getBirthdayEmployee() {
        return birthdayEmployee;
    }

    public void setBirthdayEmployee(String birthdayEmployee) {
        this.birthdayEmployee = birthdayEmployee;
    }

    public long getIdCardEmployee() {
        return idCardEmployee;
    }

    public void setIdCardEmployee(long idCardEmployee) {
        this.idCardEmployee = idCardEmployee;
    }

    public long getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(long numberphone) {
        this.numberphone = numberphone;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getLevelEmployee() {
        return levelEmployee;
    }

    public void setLevelEmployee(String levelEmployee) {
        this.levelEmployee = levelEmployee;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", birthdayEmployee='" + birthdayEmployee + '\'' +
                ", idCardEmployee=" + idCardEmployee +
                ", numberphone=" + numberphone +
                ", emailEmployee='" + emailEmployee + '\'' +
                ", levelEmployee='" + levelEmployee + '\'' +
                ", positionEmployee='" + positionEmployee + '\'' +
                ", salaryEmployee=" + salaryEmployee +
                '}';
    }
}
