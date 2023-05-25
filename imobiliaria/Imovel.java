
package principal;

public class Imovel {
    private int codigo;
    private String localidade;
    private String proprietario;
    private String tipo;
    private double tamanho;
    private double valor;
    private String situacao;
    
    
    public String getProprietario(){
        return this.proprietario;
    }
    public void setProprietario(String prop){
        this.proprietario = prop;
    }
 
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }


    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public String toString(){
        return "\nProprietario: " + getProprietario() + 
               "\nSituacao: " + getSituacao()+ 
               "\nTipo: " + getTipo() +
               "\nTamanho: "+ getTamanho() + 
               "\nValor: "+ getValor() +
               "\nCódigo: " + getCodigo() + 
               "\nLocalidade: " + getLocalidade();
    }
}

class Apartamento extends Imovel{
    private int banheiro = 0;
    private int quarto = 0;
    private int sala = 0;
    private int cozinha = 0;
    private int sacada = 0 ; // 0- não tem, 1-tem
    private int andar = 0;
    private int aptosNoAndar = 0;
    
    public int getBanheiro() {
        return banheiro;
    }
    public void setBanheiro(int banheiro) {
        this.banheiro = banheiro;
    }

    
    public int getQuarto() {
        return quarto;
    }
    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    
    public int getSala() {
        return sala;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }

    
    public int getCozinha() {
        return cozinha;
    }
    public void setCozinha(int cozinha) {
        this.cozinha = cozinha;
    }

    
    public String getSacada() {
        if(this.sacada == 0){
            return "Não tem";
        }else{
            return "Tem sacada";
        }
        
    }
    public void setSacada(int sacada) {
        this.sacada = sacada;
    }
    
  
    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }

    
    public int getAptosNoAndar() {
        return aptosNoAndar;
    }
    public void setAptosNoAndar(int aptosNoAndar) {
        this.aptosNoAndar = aptosNoAndar;
    }
    
    public String toString(){
        return super.toString() + "\n" +
               "\nQuantidade de banheiros: " + getBanheiro() + 
               "\nQuantidade de quartos: " + getQuarto()+ 
               "\nQuantidade de salas: " + getSala() +
               "\nQuantidade de cozinhas: "+ getCozinha() + 
               "\nTem sacada?: "+ getSacada() +
               "\nAndar: " + getAndar() + 
               "\nApartamentos no mesmo andar: " + getAptosNoAndar();
    }
}

class Lote extends Imovel{
    private String mato = "Sem informação";

    public String getMato() {
        return mato;
    }
    public void setMato(String mato) {
        this.mato = mato;
    }
}

class Casa extends Apartamento{
    public String toString(){
        return super.toString();
    }
}

