public class Main {
    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(17);
        somaNumeros.adicionarNumero(27);
        somaNumeros.adicionarNumero(37);
        somaNumeros.adicionarNumero(47);
        somaNumeros.adicionarNumero(57);

        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.calcularSoma());

        System.out.println(somaNumeros.encontrarMaiorNumero());

        System.out.println(somaNumeros.encontrarMenorNumero());

        somaNumeros.adicionarNumero(2);

        System.out.println(somaNumeros.encontrarMenorNumero());


    }
}