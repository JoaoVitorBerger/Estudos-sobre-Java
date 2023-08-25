package joao;

public class User {

    //membros - propriedades e metodos (comportamentos)
    // classe é um conjunto de caracteristicas e acoes que dao vida a um objeto
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName){
        this.firstName=firstName.toUpperCase();
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName.trim();
    }

    public String getLastName(){
        return lastName;
    }
}
