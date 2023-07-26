package aula07;

public enum Semana {
    DOMINGO(new String[]{"domingo", "dom"}, 1),
    SEGUNDA_FEIRA(new String[]{"segunda-feira", "segunda", "seg"}, 2),
    TERCA_FEIRA(new String[]{"terça-feira", "terça", "ter"}, 3),
    QUARTA_FEIRA(new String[]{"quarta-feira", "quarta", "qua"}, 4),
    QUINTA_FEIRA(new String[]{"quinta-feira", "quinta", "qui"}, 5),
    SEXTA_FEIRA(new String[]{"sexta-feira", "sexta", "sex"}, 6),
    SABADO(new String[]{"sábado", "sáb"}, 7);

    final String[] keywords;
    final int dia;

    Semana(String[] keywords, int dia) {
        this.keywords = keywords;
        this.dia = dia;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public int getDia() {
        return dia;
    }

    public static Semana nomeParaEnum(String nome) throws DiaDaSemanaInvalidoException {
        for(Semana diaDaSemana : values()) {
            for(String dia : diaDaSemana.getKeywords()) {
                if (dia.equalsIgnoreCase(nome)) {
                    return diaDaSemana;
                }
            }
        }

       throw new DiaDaSemanaInvalidoException(nome);
    }
}
