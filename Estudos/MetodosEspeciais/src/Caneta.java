public class Caneta {
    private String modelo;
    private double ponta;


    public void Caneta(String m, double p){
        modelo=m;
        ponta=p;
        setModelo(modelo);
        setPonta(ponta);
    }


    public void setModelo(String m){
        modelo=m;
    }

    public String getModelo(){
        return modelo;
    }


    public void setPonta(double p){
        ponta=p;
    }
    public double getPonta(){
        return ponta;
    }
}
