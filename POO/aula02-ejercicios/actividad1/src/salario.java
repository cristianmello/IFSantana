public class salario {

    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
        float impuesto;

        if (getSalario() <= 1000) {
            System.out.println("Usted no paga impuestos");
        } else if (getSalario() >= 1001 && getSalario() <= 2000) {
            impuesto = (float) (getSalario() * 0.05);
            System.out.println("Su impuesto es de: " + impuesto);
        } else if (getSalario() >= 2001 && getSalario() <= 3000) {
            impuesto = (float) (getSalario() * 0.10);
            System.out.println("Su impuesto es de: " + impuesto);
        } else if (getSalario() > 3000) {
            impuesto = (float) (getSalario() * 0.15);
            System.out.println("Su impuesto es de: " + impuesto);
        }

    }

}