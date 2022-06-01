package base;
import javax.swing.*;

public class Produto {
    String nome;
    int quantidade;

    public void cadastrarProduto(){
        this.nome = JOptionPane.showInputDialog(null,"Insira o nome do Produto que deseja cadastrar: ");
        this.quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade do Produto que deseja cadastrar: "));

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
}