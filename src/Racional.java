public class Racional {
    private int numerador;
    private int denominador;

    //Constructor para el numero 0 0|1
    public Racional(){
        this.denominador = 1;
        this.numerador = 0;
    }

    //Constructor para un numero entero num|1
    public Racional(int numEntero){
        this.denominador = 1;
        this.numerador = numEntero;
    }
    //Constructor para la fraccion
    public Racional(int numerador, int denominador){

        if (this.denominador < 0) {
            this.denominador = denominador*-1;
            this.numerador = numerador*-1;

        }else if(this.denominador < 0 && this.numerador < 0){
            this.denominador = denominador*-1;
            this.numerador = numerador;

        }else{
            this.denominador = denominador;
            this.numerador = numerador;
        }

    }

    public Racional(Racional numracional){
        this.denominador = numracional.getDenominador();
        this.numerador = numracional.getNumerador();
    }

    //

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public boolean esNegativo(){
        boolean esNegativo;

        if (getNumerador() < 0) {
            esNegativo = true;
            
            return esNegativo;
        }
        return esNegativo = false;
        
    }

    public boolean esCero() {
        boolean esCero;
        if (getNumerador() == 0 && getDenominador() == 1) {
            return esCero = true;
        }
        return esCero = false;
    }

    public boolean esPositivo() {
        boolean esPositivo;
        if (esNegativo() == true) {
            return esPositivo = false;
        }
        return esPositivo = true;
    }

    public Racional negacion() {
        int noDenominador = getDenominador();
        int noNumerador = getNumerador()*-1;

        Racional noRacional = new Racional(noNumerador, noDenominador);
        return noRacional;
    }

    public Racional reciproco(){
        int numeradorRe = getDenominador();
        int denominadorRe = getNumerador();
        Racional reciproco = new Racional(numeradorRe, denominadorRe);
        return reciproco;
    }

    public Racional suma(Racional numSum){
        int numeradorSum = 0;
        int numeradorTempSum;
        int denominadorSum = 0;
        if(numSum.getDenominador() == getDenominador()){
            numeradorSum = numSum.getNumerador() + getNumerador();
            denominadorSum = getDenominador();
            Racional numRes = new Racional(numeradorSum, denominadorSum);
            return numRes;
        }else if(numSum.getDenominador() != getDenominador()){
            denominadorSum = numSum.getDenominador() * getDenominador();
            numeradorTempSum = getNumerador() * numSum.getDenominador();
            numeradorSum = getDenominador() * numSum.getNumerador();
            numeradorSum = numeradorSum + numeradorTempSum;
            Racional numRes = new Racional(numeradorSum, denominadorSum);
            return numRes;
        }
        Racional numRes = new Racional(numeradorSum, denominadorSum);
        return numRes;
    }

    public Racional resta(Racional numRest) {
        int numeradorRes = 0;
        int numeradorTempRes;
        int denominadorRes = 0;
        if(numRest.getDenominador() == getDenominador()){
            numeradorRes = numRest.getNumerador() - getNumerador();
            denominadorRes = getDenominador();
            Racional numRes = new Racional(numeradorRes, denominadorRes);
            return numRes;
        }else if(numRest.getDenominador() != getDenominador()){
            numeradorRes = numRest.getDenominador() * getDenominador();
            numeradorTempRes = getNumerador() * numRest.getDenominador();
            numeradorRes = getDenominador() * numRest.getNumerador();
            numeradorRes = numeradorRes - numeradorTempRes;
            Racional numRes = new Racional(numeradorRes, numeradorRes);
            return numRes;
        }
        Racional numResto = new Racional(numeradorRes, numeradorRes);
        return numResto;
    }

    public void reducir(){
        int numeradornew;
        int denominadornew;
        int mcdNum = mcd(getNumerador(), getDenominador());;

        numeradornew = getNumerador() / mcdNum;
        denominadornew = getDenominador() / mcdNum;

        setDenominador(denominadornew);
        setNumerador(numeradornew);

    }

    public boolean equals(Racional numRa){
        boolean iguales;
        if (numRa.getDenominador() == getDenominador() && numRa.getNumerador() == getNumerador()) {
            return iguales = true;
        }else{
            return iguales = false;
        }
    }

    public int mcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            }else{
                b = b - a;
            }
        }
        return a;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getNumerador()+"/"+getDenominador();
    }
}
