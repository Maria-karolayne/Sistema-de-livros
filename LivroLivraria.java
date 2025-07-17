public class LivroLivraria extends Livro {

    //atributos
    private String novoUsado;
    private int preco;
    private String categoria;
    private String localPrateleira;


    //metodos

    public void Vender(){
        System.out.println("Estou Vendendo...");
    }

    public String getNovoUsado (){
        return novoUsado ;
    }

    public void setNovoUsado (String novoUsado){
        this.novoUsado = novoUsado ;
    }

    public int getPreco (){
        return preco ;
    }

    public void setPreco (int preco ){
        this.preco = preco ;
    }

    public String getCategoria (){
        return categoria ;
    }

    public void setCategoria (String categoria){
        this.categoria = categoria  ;
    }

    public String getLocalPrateleira (){
        return  localPrateleira;
    }

    public void setLocalPrateleira (String localPrateleira ){
        this.localPrateleira = localPrateleira ;
    }

}