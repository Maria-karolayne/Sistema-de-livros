public class SistemaLivros{

    public static void main (String[]args){

        Livro livro = new Livro();

        livro.codigo = 1;
        livro.titulo = "Código da vinci";
        livro.editora = "Editora Xyz";
        livro.nrPaginas = 100;
        livro.edicao = 3;

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        //Livro biblioteca//
        LivroBiblioteca livrobiblioteca = new LivroBiblioteca();

        livrobiblioteca.codigo = 11;
        livrobiblioteca.titulo = "Cinderela";
        livrobiblioteca.autor = "desconhecido";
        livrobiblioteca.nrPaginas = 200;
        livrobiblioteca.edicao = 6;

        livrobiblioteca.localPrateleira = "Prateleira AB2";
        livrobiblioteca.categoria = "animação";
        livrobiblioteca.prazoEntrega = 10;
        livrobiblioteca.nomeQuemEmprestou = "Maria";

        livrobiblioteca.Ler();
        livrobiblioteca.Cadastrar();
        livrobiblioteca.Localizar();

        //livro livraria//

         LivroLivraria livrolivraria = new LivroLivraria();

        livrolivraria.codigo = 6;
        livrolivraria.titulo = "A bela e a fera";
        livrolivraria.autor = "desconhecido";
        livrolivraria.nrPaginas = 200;
        livrolivraria.edicao = 6;

       livrolivraria.novoUsado = "novo";
       livrolivraria.preco = 50;
       livrolivraria.categoria = "romance";
       livrolivraria.localPrateleira = "AB";

        livrolivraria.Ler();
        livrolivraria.Cadastrar();
        livrolivraria.Localizar();


    }
}