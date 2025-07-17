public class SistemaLivros{

    public static void main (String[]args){

        Livro livro = new Livro();

        livro.setCodigo (1);
        livro.setTitulo ("codigo da vinci");
        livro.setEditora ("editora Xyz");
        livro.setNrPaginas (100);
        livro.setEdicao  (3);

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        //Livro biblioteca//
        LivroBiblioteca livrobiblioteca = new LivroBiblioteca();

        livrobiblioteca.setCodigo (11);
        livrobiblioteca.setTitulo ("Cinderela");
        livrobiblioteca.setAutor ("desconhecido");
        livrobiblioteca.setNrPaginas (200);
        livrobiblioteca.setEdicao(6);

        livrobiblioteca.setLocalPrateleira ("prateleira AB2");
        livrobiblioteca.setCategoria ("animação");
        livrobiblioteca.setPrazoEntrega (10);
        livrobiblioteca.setNomeQuemEmprestou ("Maria");

        livrobiblioteca.Ler();
        livrobiblioteca.Cadastrar();
        livrobiblioteca.Localizar();

        //livro livraria//

         LivroLivraria livrolivraria = new LivroLivraria();

        livrolivraria.setCodigo (11);
        livrolivraria.setTitulo ("a bela e a fera");
        livrolivraria.setAutor  ("desconhecido");
        livrolivraria.setNrPaginas (200);
        livrolivraria.setEdicao (6);

       livrolivraria.setNovoUsado ("novo");
       livrolivraria.setPreco (50);
       livrolivraria.setCategoria ("romance");
       livrolivraria.setLocalPrateleira ("AB");

        livrolivraria.Ler();
        livrolivraria.Cadastrar();
        livrolivraria.Localizar();
        livrolivraria.Vender();

        System.out.println("Codigo do livro Livraria:"+livrolivraria.getCodigo());
        System.out.println("Codigo do livro biblioteca:"+livrobiblioteca.getCodigo());
        System.out.println("Codigo do livro:"+livro.getCodigo());


        String mensagem =   "\nCodigo: "+livro.getCodigo()+
                            "\nTitulo: "+livro.getTitulo()+
                            "\nEditora: "+livro.getEditora()+
                            "\nNumero de paginas: "+livro.getNrPaginas()+
                            "\nEdicao: "+livro.getEdicao();

        System.out.println("----Livro---- "+ mensagem);

        String mensagemBiblioteca =  "\nCodigo: "+livrobiblioteca.getCodigo()+
                                     "\nTitulo: "+livrobiblioteca.getTitulo()+
                                     "\nNumero de paginas: "+livrobiblioteca.getNrPaginas()+
                                     "\nEdicao: "+livrobiblioteca.getEdicao()+
                                    
                                     "\nAutor: "+livrobiblioteca.getAutor()+
                                     "\nLocal na prateleira: "+livrobiblioteca.getLocalPrateleira()+
                                     "\nCategoria: "+livrobiblioteca.getCategoria()+
                                     "\nPrazo de entrega: "+livrobiblioteca.getPrazoEntrega()+
                                     "\nNome de quem emprestou: "+livrobiblioteca.getNomeQuemEmprestou();

        System.out.println("----Livro Biblioteca---- "+mensagemBiblioteca);

        String mensagemLivraria=     "\nCodigo: "+livrolivraria.getCodigo()+
                                     "\nTitulo: "+livrolivraria.getTitulo()+
                                     "\nNumero de paginas: "+livrolivraria.getNrPaginas()+
                                     "\nEdicao: "+livrolivraria.getEdicao()+

                                    "\nAutor: "+livrolivraria.getAutor()+
                                    "\nNovo ou usado: "+livrolivraria.getNovoUsado()+
                                    "\nPreco: "+livrolivraria.getPreco()+
                                    "\nCategoria: "+livrolivraria.getCategoria()+
                                    "\nLocal na prateleira: "+livrolivraria.getLocalPrateleira();

        System.out.println("----Livro Livraria----"+mensagemLivraria);


    }
}