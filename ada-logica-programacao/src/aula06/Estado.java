package aula06;

public enum Estado {
    // (MG 7%; SP 12%; RJ 15%;)
    MG(0.07),
    SP(0.12),
    RJ(0.15);

    final double taxa;

    Estado(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }
}
