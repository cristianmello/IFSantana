package ejercicio4SupClase;

public class buildLamp2 {
        public String consturir(lampara2 lampada2){
            if(lampada2 instanceof incandescente){
                return "lampara incandescente fue construida";
            }else{
                return "lampara fluorescente fue construida";
            }
        }
        public class incandescente implements lampara2{
            public void turnOn(){
                System.out.println("encendio la lampara incandescente");
            }
            
            public void turnOff(){
                System.out.println("apago la lampara incandescente");
            }
        }
                
        public class fluorescente implements lampara2{
            public void turnOn(){
                System.out.println("encendio la lampara incandescente");
            }
            
            public void turnOff(){
                System.out.println("apago la lampara incandescente");
            }
        }
        
}
