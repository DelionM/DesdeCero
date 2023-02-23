package desdecero;
public class DesdeCero {   
    public static void main(String[] args) {
        //concatenar valores
    String cadena = "Hola perro mundo agarrate que ahí te voy bien recio";
        System.out.println(cadena);
   
//concatenar valores con prinf
    int dias = 366;
    int años = 4;
        System.out.printf("El año tiene %d días cada %d años\n", dias, años);

        //el %S antes de la frase me convierte toda la cadena a mayusculas
        System.out.printf("%S", "el año tiene 366 días cada 4 años\n");    
        
//Concatenar valores tipo string con %s
        System.out.printf("%s %S", "El año tiene 366 días", "cada 4 años\n");
        //DOUBLE
        double pi  = 3.141618502;
        System.out.printf("El valor de pi es %.2f\n",pi);
        //SEgunada forma de llamar a pi
        System.out.println("El valor de pi es " +pi);
        
        System.out.println("la\nprogramación\nme\nencanta");
        
        
       String pais = "Filipinas";
       String catastrofe = "terremoto";
       double magnitud = 9.5;
       int duracion = 8;
       String volcan = "Puyehue";
       String sombra = "sombra";

       // escribe aqui tu código
       System.out.printf("%s es el único país del mundo donde es ilegal divorciarse.",pais);
       System.out.printf("El Gran %s de Chile, es el %s de mayor magnitud registrado en la historia del planeta, tuvo una magnitud de %f, duró %d minutos, fue seguido por un tsunami y provocó la erupción del volcán %s",catastrofe, catastrofe, magnitud, duracion, volcan);
       System.out.printf("El fuego no tiene %s", sombra);
        
    }   
}
