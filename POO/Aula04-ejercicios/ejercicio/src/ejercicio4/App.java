package ejercicio4;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Que tipo de lampara desea construir? 1.Incandescente; 2.Fluorescente");
        int typeLamp = scanner.nextInt();

        if(typeLamp == 1){
incandescente obj= new incandescente();
System.out.println(obj.con(obj));
obj.turnOn();
obj.turnOff();
        } else if(typeLamp == 2){
            fluorescente obj= new fluorescente();
            System.out.println(obj.buildLamp(b));
            obj.turnOn();
            obj.turnOff();
        } else {
            System.out.println("Ingrese una opcion valida");
        }
    }
}
