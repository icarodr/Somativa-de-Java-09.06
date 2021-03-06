package base;

import javax.swing.*;
import java.util.ArrayList;
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

    public void loginUsuario() throws IOException{
        this.nome = JOptionPane.showInputDialog(null,"Insira o nome de Usuário: ");
        this.senha = JOptionPane.showInputDialog(null,"Insira a senha: ");
        validacaoUsuario();
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

    public boolean validacaoUsuario() throws IOException{
        Path caminho = Paths.get("Usuarios.txt");
        String[] inputs = verificarLinha(caminho);

        if(Objects.equals(inputs[0], nome) && Objects.equals(inputs[1], senha)){
            JOptionPane.showMessageDialog(null, "Usuário Logado com sucesso!");
            Menu.menuUsuario();
            return true;
        }
        return false;
    }

    public void cadastrarUsuario() throws IOException{
        ArrayList<String> usuarios = new ArrayList<String>();

        String nomeUser = JOptionPane.showInputDialog(null, "Insira o nome de Usuário: ", "Cadastro", JOptionPane.QUESTION_MESSAGE);
        String senhaUser = JOptionPane.showInputDialog(null, "Insira a Senha: ","Cadastro", JOptionPane.QUESTION_MESSAGE);

        usuarios.add(nomeUser + "," + senhaUser);

        Path caminho = Paths.get("Usuarios.txt");
        Files.write(caminho, usuarios, StandardCharsets.UTF_8);
        menu.menuUsuario();
    }
}