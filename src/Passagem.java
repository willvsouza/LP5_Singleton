public class Passagem {

    private Passagem() {}
    private static Passagem instance;
    public static Passagem getInstance() {
        if (instance == null) {
            instance = new Passagem();
        }
        return instance;
    }

    private Double valorPassagem;

    public Double getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(Double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }
}
