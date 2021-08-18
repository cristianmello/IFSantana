package ejercicio1;

public class juridicalPerson extends person {
    String cnpj;
    String branchActivities;
    int tax;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getBranchActivities() {
        return branchActivities;
    }

    public void setBranchActivities(String branchActivities) {

    }

    public void setPayTax(int tax) {
        this.tax = tax;
    }

    public int getPayTax() {
        return tax;
    }
}
