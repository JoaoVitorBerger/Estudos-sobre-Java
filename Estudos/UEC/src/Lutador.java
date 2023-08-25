public class Lutador {
    private String nome;
    private String nacionalidade;
    private  int idade;

    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private  int empate;

    public Lutador(String no,String na, int id, double al, double pe, int vi, int de, int em){
        nome=no;
        nacionalidade=na;
        idade=id;
        altura=al;
        setPeso(pe);
        vitoria=vi;
        derrota=de;
        empate=em;

    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setCategoria() {
        if (peso<52.2){
            categoria="invalido";
        }else {
            if (peso<=70.3){
                categoria="Leve";
            }else {
                if (peso<=83.9){
                    categoria="médio";
                }else {
                    if (peso<=120.2){
                        categoria="Pesado";
                    }
                }
            }
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getEmpate() {
        return empate;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public double getPeso() {
        return peso;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getVitoria() {
        return vitoria;
    }

    //Métodos do objeto
    public void apresentar(){
        getNome();
        getAltura();
        getCategoria();
        getIdade();
        getPeso();
        getVitoria();
        getEmpate();
        getDerrota();
        getNacionalidade();
    }
    public void ganharLuta(){
        setVitoria(getVitoria()+1);
    }
    public void perderLuta(){
        setDerrota(getDerrota()-1);
    }
    public void empatarLuta(){
        setEmpate(getEmpate()+1);
    }
    public void status(){
        System.out.println("Ganhou: "+getVitoria());
        System.out.println("Perdeu: "+getDerrota());
        System.out.println("Empatou: "+getEmpate());
        System.out.println("Peso: "+getPeso());
        System.out.println("Categoria: "+getCategoria());
    }
}
