package br.com.fiap.produtos;

import br.com.fiap.produtos.model.Categoria;
import br.com.fiap.produtos.repository.CategoriaCollectionRepository;

public class Main {
    public static void main(String[] args) {

        Categoria categoria = new Categoria();
        //categoria.setId(1l);
        categoria.setNome("Informática");

        Categoria categoriaSalva = CategoriaCollectionRepository.save(categoria);

        System.out.println("Categoria: " + categoriaSalva);
    }
}