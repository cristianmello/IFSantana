package ejercicio4;

public class incandescente {
    public class incandescente extends buildLamp implements lampara {
        public void ligar() {
            System.out.println("lampara incandescente encendida");
        }

        public void desligar() {
            System.out.println("lampara incandescente apagada");
        }
    }

}
