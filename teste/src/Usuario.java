import java.util.ArrayList;
public class Usuario {
    private String nome;
    private int id;
    private ArrayList<Livro> livrosemp = new ArrayList<>();

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public void pegarLivro(Livro livro){
        if(!livrosemp.contains(livro)){
            if(livro.emprestar()){
                livrosemp.add(livro);
            } 
        }
    }
    public void devolverLivro(Livro livro){
        if(livro.devolver() == false && livrosemp.contains(livro)) {
            livrosemp.remove(livro);
        }
    }

    public void informacoes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("ID: "+this.id);
    }

    public String getNome(){
        return this.nome;
    }
    public int getId(){
        return this.id;
    }
}
