package base;
import javax.swing.*;
import java.util.ArrayList;
import static java.nio.file.Files.write;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Usuario {
    Menu menu = new Menu();
    List listaUser = new ArrayList();

    public String nome;
    public String senha;

    public void opcaoUsuario() throws IOException{
        // Usuario usuarioCad = new Usuario();
        int op2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a Opção: \n(1) - Cadastrar Novo Usuário \n(2) - Fazer Login \n\n"));
        switch(op2) {

            case 1:
                cadastrarUsuario();
                break;

            case 2:
                loginUsuario();
                break;

            default:
                break;
        }
    }

    public boolean loginUsuario() throws IOException{

        String nome = JOptionPane.showInputDialog(null,"Insira o nome de Usuário: ");
        String senha = JOptionPane.showInputDialog(null,"Insira a senha: ");

        Path caminho = Paths.get("Usuarios.txt");
        String[] inputs = verificarLinha(caminho);

        if(Objects.equals(inputs[0], nome) && Objects.equals(inputs[1], senha)){
            System.out.println("teste");
            JOptionPane.showMessageDialog(null, "Usuário Logado com sucesso!");
            Menu.menuUsuario();
            return true;
        }
        return false;
    }

    public String[] verificarLinha(Path caminho){
        String dados = "";
        String[] array = new String[2];

        try {
            List<String> allLines = Files.readAllLines(Paths.get(String.valueOf(caminho)));
            for (String line : allLines){
                dados = line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        array = dados.split(",");
        return array;
    }

    public void cadastrarUsuario() throws IOException{

        this.nome = JOptionPane.showInputDialog(null,"Insira o nome de Usuário: ");
        this.senha = JOptionPane.showInputDialog(null,"Insira a senha: ");
        listaUser.add(nome);
        listaUser.add(senha);
        
        Path caminho = Paths.get("Usuarios.txt");
        write(caminho,listaUser, StandardCharsets.UTF_8);

        System.out.println(listaUser);
        JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso!");
        menu.menuUsuario();
    }
}