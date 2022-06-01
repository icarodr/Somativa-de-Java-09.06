package base;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.*;

public class Arquivo {

    public static void main(String[] args) {

        Path caminho = Paths.get("Usuarios.txt");
        //String texto = "Isso é um teste";
        //byte[] textoEmByte = texto.getBytes();


        try {
            List<String> cadastro = Files.readAllLines(caminho);
            

        } catch (Exception erro) {}
    }
}
   