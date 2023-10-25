public class Aluno{
    private String nome;
    private double media;
    private int nFaltas;
    private int nAulas;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public int getnFaltas() {
        return nFaltas;
    }
    public void setnFaltas(int nFaltas) {
        this.nFaltas = nFaltas;
    }
    public int getnAulas() {
        return nAulas;
    }
    public void setnAulas(int nAulas) {
        this.nAulas = nAulas;
    }
    
    public Aluno(){

    }
    public void cadastrar(String nome){
        this.nome=nome;
    }
    public void cadastrar(String nome, double media){
        this.nome=nome;
        this.media=media;
    }
    public void cadastrar(String nome, double media, int nFaltas){
        this.nome=nome;
        this.media=media;
        this.nFaltas=nFaltas;
    }
    public void cadastrar(String nome, double media, int nFaltas, int nAulas){
        this.nome=nome;
        this.media=media;
        this.nFaltas=nFaltas;
        this.nAulas=nAulas;
    }
    public boolean verifica(){
        if((media<4.9) ||(nFaltas<25)){
            return false;
        }
        else if ((media>=5) && (nFaltas<25)){
        return true;
        }
        else
        return true;
    }
}