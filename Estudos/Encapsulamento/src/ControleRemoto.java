public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        volume=50;
        ligado=false;
        tocando=false;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private int getVolume() {
        return volume;
    }

    private boolean getTocando(){
        return tocando;
    }

    private boolean getLigado(){
        return ligado;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }


    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? "+this.getLigado());
        System.out.println("Está tocando? "+this.getTocando());
        System.out.println("Volume "+this.getVolume());
        for (int i =0; i<= this.getVolume();i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu");
    }

    @Override
    public void maisVolume() {
     if (getLigado()){
         setVolume(getVolume()+1);
     }
    }

    @Override
    public void menosVolume() {
        if (getLigado() && getVolume()>0){
            setVolume(getVolume()-1);
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume()>0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume()==0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (getTocando() && getTocando()==false){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (getTocando() && getTocando()==true){
            setTocando(false);
        }
    }
}
