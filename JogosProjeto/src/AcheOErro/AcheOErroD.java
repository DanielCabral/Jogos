/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AcheOErro;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author DANIEL
 */
public class AcheOErroD extends javax.swing.JFrame {

    int s = 1, m = 0, cont = 0, aleatorio = 1;
    String z, s1, s2, p = "play";
    int numeroTmp = 0, comp = 0, points = 0;
    boolean v = true;
    ActionListener action;
    Timer t;

    /**
     * Creates new form AcheOErro
     */
    public AcheOErroD() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Res/icone.png")).getImage());
        getContentPane().setBackground(new Color(40, 215, 188));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/JogosExtras/AcheOErro/pause.png")));;
        jPanel2.setBackground(new Color(40, 215, 188));
        Tempo();
    }

    public void Aleatorio() {
        Imagem i = new Imagem("" + aleatorio, "dificil");
        if (aleatorio < 15) {
            aleatorio++;
        } else {
            aleatorio = 1;
        }
        numeroTmp = i.getNumeroTmp();
        s1 = i.getS();
        s2 = i.getS2();
        if (numeroTmp == 1) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 2) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 3) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 4) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 5) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 6) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 7) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 8) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 9) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 10) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 11) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 12) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 13) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 14) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 15) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 16) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 17) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 18) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 19) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 20) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 21) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 22) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 23) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 24) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
        }
        if (numeroTmp == 25) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(s1)));
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(s2)));
        }
    }

    public void Tempo() {
        if (v) {
            v = false;
        }
        action = new ActionListener() {
            public void actionPerformed(@SuppressWarnings("unused") java.awt.event.ActionEvent e) {
                if (cont == 0) {
                    Aleatorio();
                    cont++;
                }
                if (s == 60) {
                    m++;
                    s = 0;
                }
                z = "" + s;
                if (z.length() == 1) {
                    jLabel18.setText("0" + s);
                } else {
                    jLabel18.setText("" + s);
                }
                z = "" + m;
                if (z.length() == 1) {
                    jLabel17.setText("0" + m + " :");
                } else {
                    jLabel17.setText("" + m + " :");
                }
                s++;
            }
        };
        t = new Timer(1000, action);
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ache o Erro!");
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(40, 215, 188));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 33)); // NOI18N
        jLabel19.setText("Pontos: 0");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(24, 1, 180, 43);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 0, 102), null, new java.awt.Color(244, 0, 114)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 102))));

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel18.setText("00");

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel17.setText("00 :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1);
        jPanel1.setBounds(355, 1, 98, 46);

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 0, 0), null, new java.awt.Color(204, 204, 204)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null)));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel21MousePressed(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel23MousePressed(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel24MousePressed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel25MousePressed(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel26MousePressed(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel27MousePressed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel28MousePressed(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AcheOErro/Images/AcheoerroB.png"))); // NOI18N
        jLabel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel29MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel24)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29)
                    .addComponent(jLabel26))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2);
        jPanel2.setBounds(11, 50, 489, 527);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Parar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(211, 15, 90, 29);

        jLabel20.setIcon(null);
        jLabel20.setToolTipText("Pausar o jogo");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel20);
        jLabel20.setBounds(303, 1, 42, 43);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        if (p.equals("play")) {
            t.stop();
            jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/JogosExtras/AcheOErro/play.png")));;
            p = "pause";
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jLabel13.setVisible(false);
            jLabel14.setVisible(false);
            jLabel15.setVisible(false);
            jLabel16.setVisible(false);
            jLabel23.setVisible(false);
            jLabel24.setVisible(false);
            jLabel21.setVisible(false);
            jLabel22.setVisible(false);
            jLabel25.setVisible(false);
            jLabel26.setVisible(false);
            jLabel27.setVisible(false);
            jLabel28.setVisible(false);
            jLabel29.setVisible(false);
        } else {
            if (p.equals("pause")) {
                t.start();
                jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/JogosExtras/AcheOErro/pause.png")));;
                p = "play";
                jLabel1.setVisible(true);
                jLabel2.setVisible(true);
                jLabel3.setVisible(true);
                jLabel4.setVisible(true);
                jLabel5.setVisible(true);
                jLabel6.setVisible(true);
                jLabel7.setVisible(true);
                jLabel8.setVisible(true);
                jLabel9.setVisible(true);
                jLabel10.setVisible(true);
                jLabel11.setVisible(true);
                jLabel12.setVisible(true);
                jLabel13.setVisible(true);
                jLabel14.setVisible(true);
                jLabel15.setVisible(true);
                jLabel16.setVisible(true);
                jLabel23.setVisible(true);
                jLabel24.setVisible(true);
                jLabel21.setVisible(true);
                jLabel22.setVisible(true);
                jLabel25.setVisible(true);
                jLabel26.setVisible(true);
                jLabel27.setVisible(true);
                jLabel28.setVisible(true);
                jLabel29.setVisible(true);
            }
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setForeground(Color.red);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setForeground(Color.white);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PrincipalAcheOErro p = new PrincipalAcheOErro();
        p.setVisible(true);
        t.stop();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        comp = 1;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        comp = 2;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        comp = 3;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        comp = 4;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed
        comp = 5;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel21MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        comp = 6;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        comp = 7;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        comp = 8;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        comp = 9;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MousePressed
        comp = 10;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            this.dispose();
        }
    }//GEN-LAST:event_jLabel24MousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        comp = 11;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        comp = 12;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        comp = 13;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        comp = 14;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
        comp = 15;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            this.dispose();
        }
    }//GEN-LAST:event_jLabel22MousePressed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        comp = 16;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        comp = 17;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        comp = 18;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel16MousePressed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        comp = 19;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            PrincipalAcheOErro p = new PrincipalAcheOErro();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MousePressed
        comp = 20;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            this.dispose();
        }
    }//GEN-LAST:event_jLabel23MousePressed

    private void jLabel28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MousePressed
        comp = 21;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            this.dispose();
        }
    }//GEN-LAST:event_jLabel28MousePressed

    private void jLabel27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MousePressed
        comp = 22;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            this.dispose();
        }
    }//GEN-LAST:event_jLabel27MousePressed

    private void jLabel29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MousePressed
        comp = 23;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            this.dispose();
        }
    }//GEN-LAST:event_jLabel29MousePressed

    private void jLabel26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MousePressed
        comp = 24;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            this.dispose();
        }
    }//GEN-LAST:event_jLabel26MousePressed

    private void jLabel25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MousePressed
        comp = 25;
        if (comp == numeroTmp) {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            points++;
            jLabel19.setText("Pontos: " + points);
            cont = 0;
        } else {
            t.stop();
            JOptionPane.showMessageDialog(null, "Você errou, você conseguiu: " + points + " pontos.\nTempo: " + jLabel17.getText() + " " + jLabel18.getText());
            this.dispose();
        }
    }//GEN-LAST:event_jLabel25MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AcheOErroD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcheOErroD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcheOErroD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcheOErroD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcheOErroD().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
