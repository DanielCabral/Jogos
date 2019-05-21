/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela_principal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DANIEL
 */
public class Zerartudo {

    public Zerartudo() {
        zerar();
    }

    public void zerar() {
        apagar("C:\\IFLife/Res","Dados.txt", "");
        apagar("C:\\IFLife/Res","Save.txt", "fase@0\n"
                + "0\n"
                + "0\n"
                + "70\n"
                + "0\n"
                + "1000\n"
                + "1833\n"
                + "2666\n"
                + "28666\n"
                + "3@true\n"
                + "true\n"
                + "true\n"
                + "true\n"
                + "true\n"
                + "true\n"
                + "true\n"
                + "true\n"
                + "true\n"
                + "true@false\n"
                + "false\n"
                + "false\n"
                + "false\n"
                + "false\n"
                + "false\n"
                + "false\n"
                + "false\n"
                + "false\n"
                + "false");
        apagar("C:\\IFLife/Res/Tutoria","Materia.txt", "");
        apagar("C:\\IFLife/Res/Tutoria","Passou.txt", "false");
        apagar("C:\\IFLife/Res/Dados","NumeroBonus.txt", "3@3");
        apagar("C:\\IFLife/Res/Dados","ProximoBonus.txt", "memoria1");
        apagar("C:\\IFLife/Res/Dados","Virus.txt", "");
        apagar("C:\\IFLife/Res/JogosExtras/Sudoku","contador.txt", "0@0@0@0000@0@0@000@0@0@00@0@0@0");
        apagar("C:\\IFLife/Res/JogosExtras/PalavrasCruzadas","contadorpalavrasc.txt", "1");
    }

    public void ZerarExtras() {
        apagar("C:\\IFLife/Res/Dados","JogosDesbloqueados.txt", "");
        apagar("C:\\IFLife/Res/JogosExtras/Forca","Recordes.txt", "1800-CPU\n"
                + "\n"
                + "1600-CPU\n"
                + "\n"
                + "1400-CPU\n"
                + "\n"
                + "1200-CPU\n"
                + "\n"
                + "1000-CPU");
        apagar("C:\\IFLife/Res/JogosExtras/CacaPalavras","Recordes.txt", "1800-CPU\n"
                + "\n"
                + "1600-CPU\n"
                + "\n"
                + "1400-CPU\n"
                + "\n"
                + "1200-CPU\n"
                + "\n"
                + "1000-CPU");
    }

    public void criarDiretorios(String dir) {
        File diretorio = new File(dir);
        diretorio.mkdirs();
    }

    private void apagar(String caminhoDiretorio, String nomeArquivo, String texto) {
       File diretorio = new File(caminhoDiretorio);
       if(diretorio.exists()){
           
       }else{
           criarDiretorios(caminhoDiretorio);
       }
        FileWriter fw;
        try {
            fw = new FileWriter(caminhoDiretorio + "/" + nomeArquivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Zerartudo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        new Zerartudo().ZerarExtras();
    }
}
