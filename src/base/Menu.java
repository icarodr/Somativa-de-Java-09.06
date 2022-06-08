package base;
import java.io.IOException;
import javax.swing.*;

public class Menu {
    static Produto produtoMenu = new Produto();

    public static void menuUsuario() throws IOException{
        
        int opUser = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha o que deseja realizar: \n(1) - Cadastrar Produto \n(2) - Remover Produto \n(3) - Listar Produto \n(4) - Alterar Quantidade\n\n"));
        switch(opUser) {
            case 1:
                produtoMenu.cadastrarProduto();
                break;
            case 2:
                produtoMenu.removerProdutos();
                break;
            case 3:
//                produtoMenu.listarProdutos();
                break;
            case 4:
                produtoMenu.alteraQuantidade();
            if(opUser != 1 || opUser != 2 || opUser != 3 || opUser !=4)
                JOptionPane.showMessageDialog(null,"Sem valor especifícado!");
        }
    }
}