public class ListaNumeros {

    private int numerosInteiros;


    public ListaNumeros(int numerosInteiros) {
        this.numerosInteiros = numerosInteiros;
    }

    public int getNumerosInteiros() {
        return numerosInteiros;
    }

    public void setNumerosInteiros(int numerosInteiros) {
        this.numerosInteiros = numerosInteiros;
    }

    @Override
    public String toString() {
        return "ListaNumeros{" +
                "numerosInteiros=" + numerosInteiros +
                '}';
    }
}
