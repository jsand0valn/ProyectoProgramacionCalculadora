
package calculadora;

public class Resta {
static double primerNumero,segundoNumero,resultado;


    public Resta(double v1, double v2) {
        this.primerNumero = v1;
        this.segundoNumero = v2;
    }
        public static double restar(){
    resultado=primerNumero-segundoNumero;
    return resultado;
}
}
