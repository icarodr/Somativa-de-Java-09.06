package base;
import javax.swing.*;
import java.util.ArrayList;
import java.util.*;

public class Usuario {

    Menu menu = new Menu();
    List<String> listaUser = new ArrayList<String>();

    public String nome;
    public String senha;

    public void opcaoUsuario(){
        Usuario usuarioCad = new Usuario();
        int op2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a Opção: \n(1) - Cadastrar Novo Usuário \n(2) - Fazer Login \n\n"));

        switch(op2) {
            case 1:
                usuarioCad.cadastrarUsuario();;
                break;

            case 2:
                usuarioCad.loginUsuario();
                break;

            default:
                break;
        }
    }

    public void loginUsuario(){
        this.nome = JOptionPane.showInputDialog(null,"Insira o nome de Usuário: ");
        this.senha = JOptionPane.showInputDialog(null,"Insira a senha: ");
    }

    public void validacaoUsuario(){
    
        if(nome.equalsIgnoreCase("icaro") && senha == "1234"){
            JOptionPane.showMessageDialog(null,"Login Efetuado com Sucesso!");
            menu.menuUsuario();
        }else{
            JOptionPane.showMessageDialog(null,"Erro! Usuário ou senha Incorretos!");
            loginUsuario();
            validacaoUsuario();
        }
    }
    public void cadastrarUsuario(){

        listaUser.add(nome);
        listaUser.add(senha);
        JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso!");
        System.out.println(listaUser);
    }
}