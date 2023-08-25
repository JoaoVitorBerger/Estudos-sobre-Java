import java.util.Locale;

public class User {

    private String nome;
    private String sobreNome;

    public User(){

    }
    public User( String nome, String sobreNome){
        this.nome=nome.toUpperCase();
        this.sobreNome=sobreNome.toLowerCase(Locale.ROOT);
    }

    public void setNome(String nome){
        this.nome=nome;//basicamente estou informando com o this para pegar a variavel privada
        // e trocar seu valor pelo valor que vem do parametro
    }


    public String getNome(){
        return nome;//nesse caso eu estou pegando(get) o novo valor da variavel nome
    }





    public String getsobreNome(){
        return sobreNome;
    }

}
