class Produto {
    private String cor;
    private String nome;
    private int codigo;
    private int quant;
    private double valor;
    private double tamanho;
    private double peso;

    public Produto(String cor, String nome, int codigo, int quant, double valor, double tamanho, double peso) {
        this.cor = cor;
        this.nome = nome;
        this.codigo = codigo;
        this.quant = quant;
        this.valor = valor;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void mostrar_prod() {
        System.out.println("Produto: " + nome);
        System.out.println("Cor do Produto: " + cor);
        System.out.println("Código do Produto: " + codigo);
        System.out.println("Estoque do Produto: " + quant + " unidades");
        System.out.println("Valor do Produto: " + valor + " reais");
        System.out.println("Tamanho do Produto: " + tamanho + " cm");
        System.out.println("Peso do Produto: " + peso + " kg");
    }
}