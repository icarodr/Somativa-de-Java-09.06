package base;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Produto {
    String nome;
    int quantidade;

    List listaProduto = new ArrayList();

    public void cadastrarProduto() throws IOException{
        this.nome = JOptionPane.showInputDialog(null,"Insira o nome do Produto que deseja cadastrar: ");
        this.quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade do Produto que deseja cadastrar: "));
        listaProduto.add(nome);
        listaProduto.add(quantidade);

        Path caminho = Paths.get("Produtos.txt");
        Files.write(caminho,listaProduto, StandardCharsets.UTF_8);

    }
    public void alteraQuantidade(){
        this.quantidade = quantidade;

    }

    public void removerProdutos(){
        this.nome = nome;
    }

    public void listarProdutos(){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void verEstoque(){
        this.nome = nome;
        this.quantidade = quantidade;

    }
}