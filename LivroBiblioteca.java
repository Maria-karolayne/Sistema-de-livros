public class LivroBiblioteca extends Livro {

    //atributos
    private String localPrateleira;
    private String categoria;
    private int prazoEntrega;
    private String nomeQuemEmprestou;

    //metodo construtor filho
    LivroBiblioteca(){}

    //metodo construtor filho com parametros
    LivroBiblioteca(int codigo,String titulo ,String autor ,String editora,int nrPaginas ,int edicao, String localPrateleira,String categoria , int prazoEntrega ,String nomeQuemEmprestou){
        super(codigo,titulo,autor,editora,nrPaginas,edicao); //acessa metodo/informaçoes construtor pai(livro)
        this.localPrateleira = localPrateleira ;
        this.categoria = categoria;
        this.prazoEntrega = prazoEntrega ;
        this.nomeQuemEmprestou = nomeQuemEmprestou;
    }

    //metodos

    public void Alugar(){
        System.out.println("Estou alugando...");
    }

    public void Devolver(){
        System.out.println("Estou devolvendo...");
    }

    public String getLocalPrateleira (){
        return  localPrateleira;
    }

    public void setLocalPrateleira (String localPrateleira ){
        this.localPrateleira = localPrateleira ;
    }

    public String getCategoria (){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public int getPrazoEntrega (){
        return prazoEntrega ;
    }

    public void setPrazoEntrega (int prazoEntrega ){
        this.prazoEntrega = prazoEntrega ;
    }
    

    public String getNomeQuemEmprestou (){
        return nomeQuemEmprestou ;
    }

    public void setNomeQuemEmprestou (String nomeQuemEmprestou ){
        this.nomeQuemEmprestou = nomeQuemEmprestou;
    }

    @Override
    public void Localizar(){
        System.out.println("Estou Localizando um livro da biblioteca.");
    }

    @Override
    public void Cadastrar(){
        System.out.println("Cadastrar livro no sistema da biblioteca");
    }

    @Override
    public void Ler(){
        System.out.println("Lendo o livro da biblioteca");
    }

    

    
}