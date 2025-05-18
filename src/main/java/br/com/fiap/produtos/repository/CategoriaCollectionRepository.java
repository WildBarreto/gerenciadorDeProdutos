package br.com.fiap.produtos.repository;

import br.com.fiap.produtos.model.Categoria;

import javax.swing.*;
import java.util.List;
import java.util.Vector;

public class CategoriaCollectionRepository {

    private static List<Categoria> categorias; //Cria uma lista de categorias chamada categorias

     static {
         categorias = new Vector<>();

         Categoria eletronicos = new Categoria("Eletrônicos");
         Categoria celulares = new Categoria("Celulares");
         Categoria livros = new Categoria("Livros");

         categorias.add(eletronicos);
         categorias.add(livros);
         categorias.add(livros);
     }

     public static  List<Categoria> findAll(){
         return categorias;
     }//Metodo para encontrar todos os produtos da categoria

     public static  Categoria findById(Long id){
         return  categorias.stream()
                 .filter(c->c.getId().equals(id))
                 .findFirst()
                 .orElse(null);
     }

     public static List<Categoria>findByNome(String nome){
         return categorias.stream()
                 .filter(c ->c.getNome().equalsIgnoreCase(nome))
                 .toList();
     }

     public static Categoria save(Categoria categoria){
         if(!categorias.contains(categoria)){
             categoria.setId((long)categorias.size()+1);
             categorias.add(categoria);
             return categoria;
         }else {
             JOptionPane.showMessageDialog(null,"Já existe uma categoria com nome informado");
            return null;
         }
     }
}
