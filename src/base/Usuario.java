package base;
import javax.swing.*;
import java.util.ArrayList;

import static java.nio.file.Files.write;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
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

    public void validacaoUsuario() throws IOException{
    
        if(nome.equalsIgnoreCase("icaro") && senha.equalsIgnoreCase("1234")){
            JOptionPane.showMessageDialog(null,"Login Efetuado com Sucesso!");
            menu.menuUsuario();
        }else{
            JOptionPane.showMessageDialog(null,"Erro! Usuário ou senha Incorretos!");
            loginUsuario();
            validacaoUsuario();
        }
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
    }
}