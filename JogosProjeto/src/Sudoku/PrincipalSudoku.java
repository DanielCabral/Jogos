/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku;

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
public class PrincipalSudoku {

    public PrincipalSudoku(int num, String nivel) {
        String arquivo = "C:\\IFLife/Res/JogosExtras/Sudoku/contador.txt", linha = "", f = "", line;
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            try {
                while (br.ready()) {
                    linha = "";
                    linha += br.readLine();
                    if (!linha.equals("")) {
                        f += linha + "\n";
                    }
                }
                br.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(PrincipalSudoku.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrincipalSudoku.class.getName()).log(Level.SEVERE, null, ex);
        }
        f = f.substring(0, f.length() - 1);
        String[] conts = f.split("@");
        linha = conts[num];
         InputStream stream;
        if (nivel.equals("facil")) {
            stream = PrincipalSudoku.class.getResourceAsStream("/Res/JogosExtras/Sudoku/SudokuFacil.txt");
        } else if (nivel.equals("medio")) {
           stream = PrincipalSudoku.class.getResourceAsStream("/Res/JogosExtras/Sudoku/SudokuMedio.txt");
        } else if (nivel.equals("dificil")) {
            stream = PrincipalSudoku.class.getResourceAsStream("/Res/JogosExtras/Sudoku/SudokuDificil.txt");
        } else {
            stream = PrincipalSudoku.class.getResourceAsStream("/Res/JogosExtras/Sudoku/SudokuAvancado.txt");
        }
        f = "";
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
                Logger.getLogger(PrincipalSudoku.class.getName()).log(Level.SEVERE, null, ex);
            }
        String caca[] = f.split("\n");
        Sudoku s = new Sudoku(caca[Integer.parseInt(linha)], Integer.parseInt(linha), nivel);
        s.setVisible(true);

    }
}
