package base;
import javax.swing.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Usuario {
//    Produto produto = new Produto();
    Menu menu = new Menu();
    public String nome;
    public int senha;

    public void loginUsuario(){
        this.nome = JOptionPane.showInputDialog(null,"Insira o nome de Usuário: ");
        this.senha = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a senha: "));

    }
    public void validacaoUsuario(){
    
        if(nome.equalsIgnoreCase("icaro") && senha == 1234){
            JOptionPane.showMessageDialog(null,"Login Efetuado com Sucesso!");
            menu.menuUsuario();
        }else{
            JOptionPane.showMessageDialog(null,"Erro! Usuário ou senha Incorretos!");
            loginUsuario();
            validacaoUsuario();
        }
    }
    public void cadastrarUsuario(String nome, int senha){
        
    }
}