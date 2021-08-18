package ejercicio4;

public class buildLamp {
    public String construir(ampara lampada){
        if(lampara instanceof incandescente){
            return "lampara incandescente construida";
        }else{
            return "lampara fluorescente construida";
        }
    }
}
