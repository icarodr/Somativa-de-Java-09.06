package base;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"SOMATIVA DE JAVA!");
        Usuario usuario = new Usuario();
        usuario.loginUsuario();
        usuario.validacaoUsuario();
    }
}