package Lab1.tp2.ej20;

public class Fraccion {
    private int numerador, denominador;

    public int getNumerador() {
        return numerador;
    }
    
    public int getDenominador() {
        return denominador;
    }
    
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;

    }

    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2) {
        int nuevoDenominador;
        int nuevoNumerador;
        if (f1.denominador == f2.denominador) {
            nuevoNumerador = f1.numerador + f2.numerador;
            nuevoDenominador = f2.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        } else {
            nuevoDenominador = f1.denominador * f2.denominador;
            nuevoNumerador = f1.numerador * f2.denominador + f2.numerador * f1.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }

    }

    public Fraccion restarFracciones(Fraccion f1, Fraccion f2) {
        int nuevoDenominador = f1.denominador * f2.denominador;
        int nuevoNumerador = f1.numerador * f2.denominador - f2.numerador * f1.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2) {
        int nuevoNumerador = f1.numerador * f2.numerador;
        int nuevoDenominador = f1.denominador * f2.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2) {
        int nuevoNumerador = f1.numerador * f2.denominador;
        int nuevoDenominador = f1.denominador * f2.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

}
