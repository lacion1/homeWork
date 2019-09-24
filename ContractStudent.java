package home.work;

public class ContractStudent extends Student {
    public double contractPrice;
    public ContractStudent(String name,int age,double contractPrice){
        super(name,age);
        this.contractPrice = contractPrice;
    }
    void tell(){
        System.out.print(super.name+ " ");
        System.out.print(super.age+ " ");
        System.out.println(contractPrice);
    }
}
