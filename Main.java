package home.work;

public class Main {
    public static void main(String[] args) {
        ContractStudent Sasha = new ContractStudent("Sasha", 22, 12.325);
        Sasha.tell();
        ContractStudent Vova = new ContractStudent("Vova", 21, 12.325);
        Vova.tell();
        ContractStudent Kostya = new ContractStudent("Kostya", 23, 13.525);
        Kostya.tell();
    }
}
