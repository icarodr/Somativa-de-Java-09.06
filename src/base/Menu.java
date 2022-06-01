package base;
import javax.swing.*;

public class Menu {
    Produto produtoMenu = new Produto();

    public void menuUsuario(){
        int opUser = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha o que deseja realizar: \n(1) - Cadastrar Produto \n(2) - Remover Produto \n(3) - Listar Produto \n(4) - Alterar Quantidade\n"));

        switch(opUser) {
            case 1:
                produtoMenu.cadastrarProduto();
                break;
            case 2:
                produtoMenu.removerProdutos();
                break;
            case 3:
                produtoMenu.listarProdutos();
                break;
            case 4:
                produtoMenu.alteraQuantidade();
            default:
                JOptionPane.showMessageDialog(null,"Sem valor especifícado!");
        }
    }
}