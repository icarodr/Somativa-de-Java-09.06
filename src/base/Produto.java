package base;
import jdk.nashorn.internal.scripts.JO;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.*;

public class Produto {
    String nome;
    String quantidade;

    List listaProduto = new ArrayList();

    public void cadastrarProduto() throws IOException{
        this.nome = JOptionPane.showInputDialog(null,"Insira o nome do Produto que deseja cadastrar: ");
        this.quantidade = JOptionPane.showInputDialog(null,"Insira a quantidade do Produto que deseja cadastrar: ");
        listaProduto.add(nome);
        listaProduto.add(quantidade);
        verEstoque();
    }
    public void alteraQuantidade(){
        String escolha = JOptionPane.showInputDialog(null,"Deseja Alterar a quantidade?");

        if(escolha.equals("sim")) {

            this.quantidade = JOptionPane.showInputDialog(null, "Insira nova quantidade: ");
            JOptionPane.showMessageDialog(null, "A quantidade do produto agora é: " + this.quantidade);

        }
    }

    public void removerProdutos(){

        String removeProd = JOptionPane.showInputDialog(null,"Qual produto deseja remover? ");



        this.nome = nome;
        this.quantidade = quantidade;
        nome = "";
        quantidade = "";
    }

    public void verEstoque() throws IOException {

        Path caminho = Paths.get("Produtos.txt");
        if(Files.exists(caminho)){
            Files.write(caminho, listaProduto, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        }else {
            Files.write(caminho, listaProduto, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        }
    }
}