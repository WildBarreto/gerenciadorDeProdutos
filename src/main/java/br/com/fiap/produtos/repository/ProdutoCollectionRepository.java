package br.com.fiap.produtos.repository;

import br.com.fiap.produtos.model.Produto;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Vector;

public class ProdutoCollectionRepository {

    private static List<Produto>produtos;

    static {
        produtos = new Vector<>();

        Produto celular = new Produto();

        celular.setNome("Iphone 14 pro max");
        celular.setDescricao("Aparelho celular da apple");
        celular.setCategoria(CategoriaCollectionRepository.findById(2l));
        celular.setDataDeCadastro(LocalDateTime.now());
        celular.setPreco(BigDecimal.valueOf(12000));

        save(celular);
    }

    public static Produto save(Produto produto) {
        if (!produtos.contains(produtos)){
            produto.setId((long)produtos.size()+1);
            produtos.add(produto);

            return produto;
        }else {
            JOptionPane.showMessageDialog(null, "Já existe produto cadastrado");
            JOptionPane.showMessageDialog(null, "teste de commite");

            return null;
        }
    }

}
