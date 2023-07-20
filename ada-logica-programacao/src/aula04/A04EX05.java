package aula04;

public class A04EX05 {
    public static void main(String[] args) {
        String[] entradas = {
                "amor",
                "cocada",
                "mora",
                "ovo",
                "cachorro",
                "kaka",
                "saudades",
                "palalelepipedo",
                "fofocalizando",
                "papagaio",
                "ateiaateiab"
        };

        int[] saidas = {
                0,
                1,
                0,
                1,
                1,
                -1,
                2,
                9,
                4,
                4,
                10
        };

        for (int i = 0; i < entradas.length; i++) {
            double resultado = primeiroCaractereUnico(entradas[i]);
            double esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado == esperado);
            System.out.println();
        }
    }

    public static int primeiroCaractereUnico(String input) {
        int idxPrimeiroCharUnico = -1;
        boolean achouIgual;
        for(int i = 0; (i < input.length()) && (idxPrimeiroCharUnico == -1); i++) {

            achouIgual = false;
            for(int j = 0; (j < input.length()) && (!achouIgual); j++) {
                if((i != j) && (input.charAt(i) == input.charAt(j))) {
                    achouIgual = true;
                }
            }

            if(!achouIgual) {
                idxPrimeiroCharUnico = i;
            }
        }

        return idxPrimeiroCharUnico;
    }

}
