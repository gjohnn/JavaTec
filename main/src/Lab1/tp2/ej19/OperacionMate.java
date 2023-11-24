package Lab1.tp2.ej19;

public class OperacionMate {
    private double valor1, valor2;
    private String operacion;

    public OperacionMate(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    private double sumarNumeros() {
        return valor1 + valor2;
    }

    private double restarNumeros() {
        return valor1 - valor2;
    }

    private double multiplicarNumeros() {
        return valor1 * valor2;
    }

    private double dividirNumeros() {
        //testeo de try and catch
        try{
            return valor1/valor2;
        }catch(Exception e){
            
            throw e;
        }
    }

    public double aplicarOperacion(String operacion) {
        this.operacion = operacion;
        switch (operacion) {
            case "+":
                return sumarNumeros();
                
            case "-":
                return restarNumeros();
            case "*":
                return multiplicarNumeros();
            case "/":
                return dividirNumeros();
            default:
                // Se tuvo que agregar este codigo para permitir el funcionamiento ya que pide devoler si o si un double
                throw new IllegalArgumentException("Operación no válida");
        }
    }

}
