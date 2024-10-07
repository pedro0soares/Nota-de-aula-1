class Pagamento {
    private double valorespecie;
    private double preco; // O preço do produto

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setValorespecie(double valor) {
        this.valorespecie = valor;
    }

    public void verificar_troco() {
        if (valorespecie >= preco) {
            double troco = valorespecie - preco;
            System.out.println("Seu troco deu: " + troco);
            desconto_dep();
        } else {
            System.out.println("Valor insuficiente para a compra.");
        } if(valorespecie == preco) {
            System.out.println("Suficiente para a compra");
            desconto_dep();
        }
    }

    public void desconto_c() {
        System.out.println("Parcela até 3x sem juros.");

    }
    public void desconto_dep(){
        System.out.println("Preço original: " + preco);
        double desconto = (5.0 / 100) * preco;
        double novovalor = preco - desconto;
        System.out.println("Com 5% de desconto fica: " + novovalor);

    }
}