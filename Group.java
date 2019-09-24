package home.work;

public class Group {
    public static void main(String[] args) {
    Student Vasya = new Student("Vasya",22);
    Student Kolya = new Student("Kolya",23);
    Student[] students ={Vasya,Kolya};
    ContractStudent Sasha = new ContractStudent("Sasha",22,12.325);
        Sasha.tell();
        ContractStudent Petya = new ContractStudent("Petya",21,12.325);
        Petya.tell();





    }
}

