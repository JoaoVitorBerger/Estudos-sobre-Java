package EmpregadoTeste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;

    // Construtor que inicializa todos os atributos
    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    // Construtor vazio
    public Empregado() {
        this("", "", 0.0);
    }

    // Método que calcula o novo salário mensal com aumento de 500.00
    public void aumentarSalario() {
        this.salario += 500.00;
    }

    // Getters e setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

