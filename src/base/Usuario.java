package base;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Usuario {

//    Produto produto = new Produto();
    Menu menu = new Menu();
    public String nome;
    public String senha;

    public void loginUsuario(){
        this.nome = JOptionPane.showInputDialog(null,"Insira o nome de Usuário: ");
        this.senha = JOptionPane.showInputDialog(null,"Insira a senha: ");

    }
    
    public void validacaoUsuario() throws IOException{
        //this.nome = nome;
        //this.senha = senha;
        Path caminho = Paths.get("Usuarios.txt");

        List<String> cadastro = Files.readAllLines(caminho);
        String ListNome = cadastro.get(0);
        String ListSenha = cadastro.get(1);
        System.out.println(ListNome);
        System.out.println(ListSenha);


        if(this.nome.equalsIgnoreCase(ListNome) && this.senha.equalsIgnoreCase(ListSenha)){
            JOptionPane.showMessageDialog(null,"Login Efetuado com Sucesso!");
            menu.menuUsuario();
        }else{
            JOptionPane.showMessageDialog(null,"Erro! Usuário ou senha Incorretos!");
            loginUsuario();
            validacaoUsuario();
        }
    }
}
