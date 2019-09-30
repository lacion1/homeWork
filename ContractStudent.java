package home.work;

public class ContractStudent extends Student {
    private double contractPrice;

    protected ContractStudent(String name, int age, double contractPrice) {
        super(name, age);
        this.contractPrice = contractPrice;
    }

    void tell() {
        System.out.print(super.name + " ");
        System.out.print(super.age + " ");
        System.out.println(contractPrice);
    }
}
