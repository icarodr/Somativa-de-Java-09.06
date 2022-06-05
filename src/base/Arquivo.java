package base;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import javax.swing.*;

public class Arquivo {
    public static void main(String[] args) {

        Path caminho = (Path) Paths.get("Lembrar de trocar o caminho da pasta");
        String texto = "Isso é um teste";
        byte[] textoEmByte = texto.getBytes();

        try {

                Files.write(caminho, textoEmByte);

        } catch (Exception e) {}
    }

    public void lerTxt(String nome, int senha){
        Path caminho = Paths.get("Usuarios.txt");
        try{
            byte[] texto = Files.readAllBytes(caminho);
            // String leitura = new String(texto);

            JOptionPane.showMessageDialog(null, "Dados Gravados!");

        }catch(Exception e){

        }
    }
}