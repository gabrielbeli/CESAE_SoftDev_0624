package EX_04;

public class Imovel {
    private String rua;
    private int numeroDaPorta;
    private String cidade;
    private TipoImovel tipo;
    private Acabamento acabamento;
    private double area;
    private int numeroDeQuartos;
    private int numeroDeCasasDeBanho;
    private double areaDaPiscina;

    public Imovel(String rua, int numeroDaPorta, String cidade, TipoImovel tipo, Acabamento acabamento, double area, int numeroDeQuartos, int numeroDeCasasDeBanho, double areaDaPiscina) {
        this.rua = rua;
        this.numeroDaPorta = numeroDaPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.area = area;
        this.numeroDeQuartos = numeroDeQuartos;
        this.numeroDeCasasDeBanho = numeroDeCasasDeBanho;
        this.areaDaPiscina = areaDaPiscina;
    }

    public double calcularValor() {

        double valorBase = 0;

        switch (this.tipo) {
            case APARTAMENTO:
                valorBase = this.area * 1000;
                break;
            case CASA:
                valorBase = this.area * 3000;
                break;
            case MANSAO:
                valorBase = this.area * 5000;
                break;
        }

        switch (this.acabamento) {
            case PARA_RESTAURO:
                valorBase *= 0.5;
                break;
            case USADA:
                valorBase *= 0.9;
                break;
            case NOVA:
                // sem desconto
                break;
            case NOVA_COM_ALTO_ACABAMENTO:
                valorBase *= 1.25;
                break;
        }

        valorBase += this.numeroDeQuartos * 7500;
        valorBase += this.numeroDeCasasDeBanho * 10500;
        valorBase += this.areaDaPiscina * 1000;

        return valorBase;
    }

    public void mudarEstado(Acabamento novoAcabamento) {
        this.acabamento = novoAcabamento;
    }

    public void imprimirDescricao() {
        System.out.println("Descrição do Imóvel:");
        System.out.println("Rua: " + this.rua);
        System.out.println("Número da Porta: " + this.numeroDaPorta);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Acabamento: " + this.acabamento);
        System.out.println("Área: " + this.area + " m2");
        System.out.println("Número de Quartos: " + this.numeroDeQuartos);
        System.out.println("Número de Casas de Banho: " + this.numeroDeCasasDeBanho);
        System.out.println("Área da Piscina: " + this.areaDaPiscina + " m2");
    }

    public Imovel compararImoveis(Imovel outroImovel) {

        double valorEsteImovel = this.calcularValor();
        double valorOutroImovel = outroImovel.calcularValor();

        if (valorEsteImovel > valorOutroImovel) {
            return this;
        } else if (valorEsteImovel < valorOutroImovel) {
            return outroImovel;
        } else {
            return null;
        }
    }

    public String getRua() {
        return rua;
    }

}
