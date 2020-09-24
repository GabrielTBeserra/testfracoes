public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
        this.numerador = num;
        this.denominador = den;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public Fracao multiplicar(Fracao f) {
        return new Fracao(f.getNumerador() * this.numerador, f.getDenominador() * this.denominador);
    }

    public Fracao soma(Fracao f) {
        if (this.denominador != f.denominador) {
            int mmc = mmc(this.denominador, f.denominador);

            int v1 = mmc / this.denominador * this.numerador;
            int v2 = mmc / f.denominador * f.numerador;


            int novoNumerado = v1 + v2;


            return new Fracao(novoNumerado, mmc);
        }

        return new Fracao(f.getNumerador() + this.numerador, f.getDenominador());
    }

    public Fracao subtracao(Fracao f) {
        if (this.denominador != f.denominador) {
            int mmc = mmc(this.denominador, f.denominador);

            int v1 = mmc / this.denominador * this.numerador;
            int v2 = mmc / f.denominador * f.numerador;


            int novoNumerado = v1 - v2;


            return new Fracao(novoNumerado, mmc);
        }

        return new Fracao(f.getNumerador() - this.numerador, f.getDenominador());
    }

    public Fracao divisao(Fracao f) {
        int num = this.numerador * f.denominador;
        int den = this.denominador * f.numerador;

        return new Fracao(num, den);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Fracao))
            return false;
        Fracao f = (Fracao) obj;
        return (numerador == f.getNumerador() && denominador == f.getDenominador());
    }

    private int mmc(int num1, int num2) {

        int mmc = 0;
        int aux;


        for (int i = 2; i <= num2; i++) {
            aux = num1 * i;
            if ((aux % num2) == 0) {
                mmc = aux;
                i = num2 + 1;
            }
        }
        return mmc;
    }
}