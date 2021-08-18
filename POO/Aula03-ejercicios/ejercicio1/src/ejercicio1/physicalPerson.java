package ejercicio1;
public class physicalPerson extends person {
    String cpf;
    int salario;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getReceiveSalary() {
        return salario;
    }

    public void setReceiveSalary(int salario) {
        this.salario = salario;
    }

}
