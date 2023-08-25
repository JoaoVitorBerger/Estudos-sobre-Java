package EmpregadoTeste;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor que inicializa os atributos
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Método que exibe a data no formato dd/mm/aaaa
    public void exibirData() {
        String dataFormatada = String.format("%02d/%02d/%04d", dia, mes, ano);
        System.out.println(dataFormatada);
    }

    // Método que verifica qual dia da semana é a data
    public void verificarDiaDaSemana() {
        LocalDate data = LocalDate.of(ano, mes, dia);
        DayOfWeek diaDaSemana = data.getDayOfWeek();
        System.out.println("O dia " + dia + "/" + mes + "/" + ano + " é " + diaDaSemana);
    }

    // Getters e setters para os atributos
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
