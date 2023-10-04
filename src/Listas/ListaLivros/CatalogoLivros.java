package Listas.ListaLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    };
    public void adicionarLivro(String titulo, String autor, int anoPulbicacao){
        livrosList.add(new Livro(titulo, autor, anoPulbicacao));
    };

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for( Livro l : livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    };
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAnoPulblicacao() >= anoInicial && l.getAnoPulblicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    };

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;

                    break;
                }
            }
        }
        return livroPorTitulo;
    };

    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1","Autor 1", 2022);
        catalogoLivros.adicionarLivro("Livro 1","Autor 3", 2020);
        catalogoLivros.adicionarLivro("Livro 2","Autor 2", 2015);
        catalogoLivros.adicionarLivro("Livro 3","Autor 3", 2011);
        catalogoLivros.adicionarLivro("Livro 8","Autor 8", 2018);
        catalogoLivros.adicionarLivro("Livro 11","Autor 11", 2011);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 3"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010,2015));
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 1"));
    }
}
