public class Livro{

    private int codigo;
    private String titulo;
    private String autor;
    private String editora;
    private int nrPaginas;
    private int edicao;

    //metodo costrutor (serve para construir seu obejo com valores default)

Livro(){
    this.codigo = 0 ;
    this.nrPaginas = 0 ;
    this.edicao = 0 ;
    this.titulo = "Nenhum livro";
    this.autor = "";
    this.editora = "";
    
}

Livro(int codigo, String titulo){
    this.codigo = codigo ;
    this.titulo = titulo;
    this.autor = "";
    this.editora = "";
    this.nrPaginas = 0 ;
    this.edicao = 0 ;

}

Livro(int codigo,String titulo ,String autor ,String editora,int nrPaginas ,int edicao){
    this.codigo = codigo ;
    this.titulo = titulo;
    this.autor = autor ;
    this.editora = editora;
    this.nrPaginas =  nrPaginas;
    this.edicao =  edicao;
}

    //metodos

    public void Ler(){
        System.out.println("Estou lendo..");
    }

    public void Cadastrar(){
        System.out.println("Estou cadastrando..");
    }

    public void Localizar(){
        System.out.println("Estou Localizando..");
    }


    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){ 

        this.codigo = codigo;
    }

    public String getTitulo (){
        return titulo;
    }

    public void setTitulo (String titulo){
        this.titulo = titulo;
    }

    public String getAutor (){
        return autor;
    }

    public void setAutor (String autor){
        this.autor =autor ;
    }

    public String getEditora (){
        return editora;
    }

    public void setEditora (String editora){
        this.editora = editora ;
    }

    public int getNrPaginas (){
        return nrPaginas;
    }

    public void setNrPaginas (int nrPaginas){
        this.nrPaginas = nrPaginas ;
    }

    public int getEdicao (){
        return edicao ;
    }

    public void setEdicao (int edicao ){
        this.edicao = edicao ;
    }


}