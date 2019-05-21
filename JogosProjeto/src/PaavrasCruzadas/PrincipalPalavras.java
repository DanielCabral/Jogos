/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PaavrasCruzadas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DANIEL
 */
public class PrincipalPalavras {

    public PrincipalPalavras() {
        String arquivo = "C:\\IFLife/Res/JogosExtras/PalavrasCruzadas/contadorpalavrasc.txt", linha = "", f = "", line;
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            try {
                while (br.ready()) {
                    linha = "";
                    linha += br.readLine();
                }
                br.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(PrincipalPalavras.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrincipalPalavras.class.getName()).log(Level.SEVERE, null, ex);
        }
            InputStream stream = PrincipalPalavras.class.getResourceAsStream("/Res/JogosExtras/PalavrasCruzadas/palavrasc.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(stream));
            try {
                while (br.ready()) {
                    line = "";
                    line += br.readLine();
                    if (!line.equals("")) {
                        f += line + "\n";
                    }
                }
                br.close();
                f = f.substring(0, f.length() - 1);
            } catch (IOException ex) {
                Logger.getLogger(PrincipalPalavras.class.getName()).log(Level.SEVERE, null, ex);
            }
        String caca[] = f.split("\n");
        if (linha.equals("1")) {
            Palavras_Cruzadas pa = new Palavras_Cruzadas(caca[0]);
            pa.setVisible(true);
        }
        if (linha.equals("2")) {
            Palavras_Cruzadas pa = new Palavras_Cruzadas(caca[1]);
            pa.setVisible(true);
        }
        if (linha.equals("3")) {
            Palavras_Cruzadas pa = new Palavras_Cruzadas(caca[2]);
            pa.setVisible(true);
        }
        if (linha.equals("4")) {
            Palavras_Cruzadas pa = new Palavras_Cruzadas(caca[3]);
            pa.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new PrincipalPalavras();
    }
}
