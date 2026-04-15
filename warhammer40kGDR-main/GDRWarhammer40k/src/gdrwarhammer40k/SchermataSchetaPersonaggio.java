/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gdrwarhammer40k;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author bernicchi.davide
 */
public class SchermataSchetaPersonaggio extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SchermataSchetaPersonaggio.class.getName());

    /**
     * Creates new form SchermataSchetaPersonaggio
     */
    
    
    GestoreGioco gg;  
    FileManager fm;
        ImageIcon iconAss = new javax.swing.ImageIcon(getClass().getResource("/imagini/Assoult.png"));
        Image scaledImgAss = iconAss.getImage().getScaledInstance(330, 260, Image.SCALE_SMOOTH);
    
        ImageIcon iconBull = new javax.swing.ImageIcon(getClass().getResource("/imagini/Bulwark.png"));
        Image scaledImgBull = iconBull.getImage().getScaledInstance(240, 330, Image.SCALE_SMOOTH);
    
        ImageIcon iconChap = new javax.swing.ImageIcon(getClass().getResource("/imagini/Chaplain.png"));
        Image scaledImgChap = iconChap.getImage().getScaledInstance(240, 310, Image.SCALE_SMOOTH);
    
        ImageIcon iconTer = new javax.swing.ImageIcon(getClass().getResource("/imagini/Terminator.png"));
        Image scaledImgTer = iconTer.getImage().getScaledInstance(200, 270, Image.SCALE_SMOOTH);
    
    
    public SchermataSchetaPersonaggio() {

        initComponents();    
        
        

    
        
        this.setBackground(Color.black);
        this.AssoultButton.setIcon(new ImageIcon(scaledImgAss));
        this.BulWarkButton.setIcon(new ImageIcon(scaledImgBull));
        this.ChaplainButton.setIcon(new ImageIcon(scaledImgChap));
        this.TerminatorButton.setIcon(new ImageIcon(scaledImgTer));
        this.setContentPane(sfondo);
        sfondo.add(AssoultButton);
        sfondo.add(TerminatorButton);
        sfondo.add(ChaplainButton);
        sfondo.add(BulWarkButton);
        sfondo.add(this.jLabel1);
        sfondo.add(this.jLabelArma1);
        sfondo.add(this.jLabelArmatura1);
        sfondo.add(this.jLabel4);
        sfondo.add(this.jLabel5);
        sfondo.add(this.jLabel6);
        sfondo.add(this.jLabel7);
        sfondo.add(this.jLabelArma2);
        sfondo.add(this.jLabelArmatura2);
        sfondo.add(this.jLabel10);
        sfondo.add(this.jLabelArma3);
        sfondo.add(this.jLabelArmatura3);
        sfondo.add(this.jLabel13);
        sfondo.add(this.jLabelArma4);
        sfondo.add(this.jLabelArmatura4);
        sfondo.add(this.jLabel20);
        sfondo.add(this.jLabelPO);
        sfondo.add(this.jLabelCM);
        sfondo.add(this.jLabelBI);
        sfondo.add(this.jLabelCPH);
        sfondo.add(this.jTextAreaBI);
        sfondo.add(this.jTextAreaCM);
        sfondo.add(this.jTextAreaPO);
        sfondo.add(this.jTextAreaCPH);
        sfondo.add(this.jTextArea1);
        sfondo.add(jTextAreaSpiegaArma);
        sfondo.add(titolo);
        
        AssoultButton.setOpaque(false);
        AssoultButton.setContentAreaFilled(false);
        AssoultButton.setBorderPainted(false);
        AssoultButton.setFocusPainted(false);        
        
        TerminatorButton.setOpaque(false);
        TerminatorButton.setContentAreaFilled(false);
        TerminatorButton.setBorderPainted(false);
        TerminatorButton.setFocusPainted(false);        
        
        ChaplainButton.setOpaque(false);
        ChaplainButton.setContentAreaFilled(false);
        ChaplainButton.setBorderPainted(false);
        ChaplainButton.setFocusPainted(false);        
        
        BulWarkButton.setOpaque(false);
        BulWarkButton.setContentAreaFilled(false);
        BulWarkButton.setBorderPainted(false);
        BulWarkButton.setFocusPainted(false);
        
        this.jTextAreaBI.setVisible(false);
        this.jTextAreaCM.setVisible(false);
        this.jTextAreaCPH.setVisible(false);
        this.jTextAreaPO.setVisible(false);
        this.jTextArea1.setVisible(false);
        this.jTextAreaSpiegaArma.setVisible(false);
        //arma
        this.jLabelArma1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {        
                jTextAreaSpiegaArma.setVisible(true);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                jTextAreaSpiegaArma.setVisible(false); 
            }
        }); 
        this.jLabelArma2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {        
                jTextAreaSpiegaArma.setVisible(true); 
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                jTextAreaSpiegaArma.setVisible(false);
            }
        });         
        this.jLabelArma3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {        
                jTextAreaSpiegaArma.setVisible(true); 
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                jTextAreaSpiegaArma.setVisible(false); 
            }
        }); 
        this.jLabelArma4.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {        
                jTextAreaSpiegaArma.setVisible(true); 
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                jTextAreaSpiegaArma.setVisible(false);
            }
        }); 
        //FNP
        this.jLabelArmatura1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {        
                jTextArea1.setVisible(true);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                jTextArea1.setVisible(false); 
            }
        }); 
        this.jLabelArmatura1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {        
                jTextArea1.setVisible(true); 
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                jTextArea1.setVisible(false);
            }
        });         
        this.jLabelArmatura3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {        
                jTextArea1.setVisible(true); 
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                jTextArea1.setVisible(false); 
            }
        }); 
        this.jLabelArmatura4.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {        
                jTextArea1.setVisible(true); 
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                jTextArea1.setVisible(false);
            }
        }); 
        //Effeti speciali
        this.jLabelBI.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {        
                jTextAreaBI.setVisible(true); 
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                jTextAreaBI.setVisible(false); 
            }
        }); 
        this.jLabelCM.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {        
                jTextAreaCM.setVisible(true); 
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                jTextAreaCM.setVisible(false); 
            }
        }); 
        this.jLabelCPH.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {        
                jTextAreaCPH.setVisible(true); 
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                jTextAreaCPH.setVisible(false); 
            }
        }); 
        this.jLabelPO.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {        
                jTextAreaPO.setVisible(true); 
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                jTextAreaPO.setVisible(false); 
            }
        }); 
        
        //schelta personaggio
        AssoultButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {        
                AssoultButton.setBorderPainted(true);
                AssoultButton.setBackground(Color.yellow);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                AssoultButton.setBorderPainted(false);
                AssoultButton.setText("Carica");
            }
        }); 
        TerminatorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                TerminatorButton.setBorderPainted(true);
                TerminatorButton.setBackground(Color.yellow);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                TerminatorButton.setBorderPainted(false);
            }
        }); 
        ChaplainButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                ChaplainButton.setBorderPainted(true);
                ChaplainButton.setBackground(Color.yellow);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                ChaplainButton.setBorderPainted(false);
            }
        }); 
        BulWarkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                BulWarkButton.setBorderPainted(true);
                BulWarkButton.setBackground(Color.yellow);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                BulWarkButton.setBorderPainted(false);
            }
        }); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sfondo = new javax.swing.JLabel();
        AssoultButton = new javax.swing.JButton();
        TerminatorButton = new javax.swing.JButton();
        ChaplainButton = new javax.swing.JButton();
        BulWarkButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelArma1 = new javax.swing.JLabel();
        jLabelArmatura1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelArma2 = new javax.swing.JLabel();
        jLabelArmatura2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelArma3 = new javax.swing.JLabel();
        jLabelArmatura3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelArma4 = new javax.swing.JLabel();
        jLabelArmatura4 = new javax.swing.JLabel();
        jLabelCM = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCPH = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaPO = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaBI = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaCM = new javax.swing.JTextArea();
        jLabelPO = new javax.swing.JLabel();
        jLabelBI = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabelCPH = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaSpiegaArma = new javax.swing.JTextArea();
        titolo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(sfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1049, 540, -1, -1));

        AssoultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssoultButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AssoultButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 290, 284));

        TerminatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminatorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TerminatorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 220, 280));

        ChaplainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChaplainButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ChaplainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 230, 284));

        BulWarkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BulWarkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BulWarkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 280, 360));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Terminator");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 213, -1));

        jLabelArma1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelArma1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabelArma1.setForeground(new java.awt.Color(255, 204, 51));
        jLabelArma1.setText("Plasma SupaMelta: 3 (DMG 5/6D6) ");
        getContentPane().add(jLabelArma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 213, 30));

        jLabelArmatura1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelArmatura1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelArmatura1.setForeground(new java.awt.Color(255, 204, 51));
        jLabelArmatura1.setText("grado Armatura: 3 (FNP 4+)");
        getContentPane().add(jLabelArmatura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 213, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 51));
        jLabel4.setText("Effetto speciale:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 213, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 51));
        jLabel5.setText("Chaplain");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 213, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setText("Assoult");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 225, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 51));
        jLabel7.setText("BullWark");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 279, -1));

        jLabelArma2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelArma2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabelArma2.setForeground(new java.awt.Color(255, 204, 51));
        jLabelArma2.setText("Crozius Arcanum: 1 (DMG 2D6)");
        getContentPane().add(jLabelArma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 213, 30));

        jLabelArmatura2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelArmatura2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelArmatura2.setForeground(new java.awt.Color(255, 204, 51));
        jLabelArmatura2.setText("grado Armatura: 1 (FNP 6+)");
        getContentPane().add(jLabelArmatura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 213, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 51));
        jLabel10.setText("Effetto speciale:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 213, -1));

        jLabelArma3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelArma3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelArma3.setForeground(new java.awt.Color(255, 204, 51));
        jLabelArma3.setText("BoltGun: 2 (DMG 4D6)");
        getContentPane().add(jLabelArma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 213, 30));

        jLabelArmatura3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelArmatura3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelArmatura3.setForeground(new java.awt.Color(255, 204, 51));
        jLabelArmatura3.setText("grado Armatura: 2 (FNP 5+)");
        getContentPane().add(jLabelArmatura3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 213, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 51));
        jLabel13.setText("Effetto Speciale:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 213, -1));

        jLabelArma4.setBackground(new java.awt.Color(255, 255, 255));
        jLabelArma4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelArma4.setForeground(new java.awt.Color(255, 204, 51));
        jLabelArma4.setText("Power Hammer: 2 (DMG 4D6)");
        getContentPane().add(jLabelArma4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 213, 30));

        jLabelArmatura4.setBackground(new java.awt.Color(255, 255, 255));
        jLabelArmatura4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelArmatura4.setForeground(new java.awt.Color(255, 204, 51));
        jLabelArmatura4.setText("grado Armatura: 2 (FNP 5+)");
        getContentPane().add(jLabelArmatura4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 213, -1));

        jLabelCM.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCM.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelCM.setForeground(new java.awt.Color(255, 204, 51));
        jLabelCM.setText("Colpo Mirato");
        getContentPane().add(jLabelCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 213, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 204, 51));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 608, 213, -1));

        jTextAreaCPH.setColumns(20);
        jTextAreaCPH.setRows(5);
        jTextAreaCPH.setText("\"carica il martello di energia (x3 attacchi) \n indefinivamente e quando attacca scarica\n tutte le cariche in un unico colpo\"");
        jScrollPane1.setViewportView(jTextAreaCPH);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 630, 250, 100));

        jTextAreaPO.setColumns(20);
        jTextAreaPO.setRows(5);
        jTextAreaPO.setText("\"fa un attacco che non fa passare il turno\n ma ha una possibilita(1/6) di esplodere\n e fare danno al proprietario\n(ogni colpo a segno aggiunge 5 danni\n all'esplosione)\"");
        jScrollPane2.setViewportView(jTextAreaPO);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 630, 230, 100));

        jTextAreaBI.setColumns(20);
        jTextAreaBI.setRows(5);
        jTextAreaBI.setText("\"aumenta il danno permanentemente(+1D6) \n ma ha una possibilita (50%) di fare danno al\nproprietario (2D6)\"");
        jScrollPane5.setViewportView(jTextAreaBI);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 250, 100));

        jTextAreaCM.setColumns(20);
        jTextAreaCM.setRows(5);
        jTextAreaCM.setText("\"fa un attacco 3 volte\"");
        jScrollPane6.setViewportView(jTextAreaCM);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, 200, 80));

        jLabelPO.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPO.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelPO.setForeground(new java.awt.Color(255, 204, 51));
        jLabelPO.setText("Plasma Overdrive");
        getContentPane().add(jLabelPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 213, 50));

        jLabelBI.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBI.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelBI.setForeground(new java.awt.Color(255, 204, 51));
        jLabelBI.setText("Benedizione dell'imperatore");
        getContentPane().add(jLabelBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 213, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 204, 51));
        jLabel20.setText("Effetto Speciale:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 213, -1));

        jLabelCPH.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCPH.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabelCPH.setForeground(new java.awt.Color(255, 204, 51));
        jLabelCPH.setText("Carica PowerHammer ");
        getContentPane().add(jLabelCPH, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 213, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\"L'armatura tira un D6\nper ogni danno, se fa piu del \nnumero scritto il danno si annulla \n(grd-1 {6+} / grd-2 {5+} / grd-2 {4+})\"");
        jScrollPane3.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 750, 220, -1));

        jTextAreaSpiegaArma.setColumns(20);
        jTextAreaSpiegaArma.setRows(5);
        jTextAreaSpiegaArma.setText("\"Larma tira x dadi caratterizzati\ndal grado, nel risultato viene aggiunto un numero \ncaratteristico di ogni classe\n(grd-1 {2-12} / grd-2 {4-24} / grd-3{5-30 o 6-36})\"");
        jScrollPane4.setViewportView(jTextAreaSpiegaArma);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 750, 310, -1));

        titolo.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        titolo.setForeground(new java.awt.Color(255, 204, 0));
        titolo.setText("Scegli il personaggio");
        getContentPane().add(titolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 480, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TerminatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminatorButtonActionPerformed
        // TODO add your handling code here:
        Terminator player = new Terminator(new Weapon(3, "Plasma SupaMelta"), new Armor(3));
        player.setImgFile("/imagini/Terminator.png");
        player.setAlt(this.scaledImgTer.getHeight(rootPane));
        player.setLar(this.scaledImgTer.getWidth(rootPane));
        gg.setGiocatore(player);
        SchermataGioco sg = new SchermataGioco();
        sg.setGG(gg);
        sg.setFileManager(fm);
        sg.startRound();
        sg.setVisible(true);
        sg.setExtendedState(sg.MAXIMIZED_BOTH);
    }//GEN-LAST:event_TerminatorButtonActionPerformed

    private void AssoultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssoultButtonActionPerformed
        // TODO add your handling code here:        
        Assoult player = new Assoult(new Weapon(2, "Bolt Gun"), new Armor(2));
        player.setImgFile("/imagini/Assoult.png");
        player.setAlt(this.scaledImgAss.getHeight(rootPane));
        player.setLar(this.scaledImgAss.getWidth(rootPane));
        gg.setGiocatore(player);
        SchermataGioco sg = new SchermataGioco();
        sg.setGG(gg);
        sg.setFileManager(fm);
        sg.startRound();
        sg.setVisible(true);
        sg.setExtendedState(sg.MAXIMIZED_BOTH);
    }//GEN-LAST:event_AssoultButtonActionPerformed

    private void ChaplainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChaplainButtonActionPerformed
        // TODO add your handling code here:
        Chaplain player = new Chaplain(new Weapon(1, "Melee"), new Armor(1));
        player.setImgFile("/imagini/Chaplain.png");
        player.setAlt(this.scaledImgChap.getHeight(rootPane));
        player.setLar(this.scaledImgChap.getWidth(rootPane));
        gg.setGiocatore(player);
        SchermataGioco sg = new SchermataGioco();
        sg.setGG(gg);
        sg.setFileManager(fm);
        sg.startRound();
        sg.setVisible(true);
        sg.setExtendedState(sg.MAXIMIZED_BOTH);
    }//GEN-LAST:event_ChaplainButtonActionPerformed

    private void BulWarkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BulWarkButtonActionPerformed
        // TODO add your handling code here:Chaplainù
        BulWark player = new BulWark(new Weapon(2, "Melee"), new Armor(2));
        player.setImgFile("/imagini/Bulwark.png");
        player.setAlt(this.scaledImgBull.getHeight(rootPane));
        player.setLar(this.scaledImgBull.getWidth(rootPane));
        gg.setGiocatore(player);
        SchermataGioco sg = new SchermataGioco();
        sg.setGG(gg);
        sg.setFileManager(fm);
        sg.startRound();
        sg.setVisible(true);
        sg.setExtendedState(sg.MAXIMIZED_BOTH);
    }//GEN-LAST:event_BulWarkButtonActionPerformed
    void setGG(GestoreGioco gegio){
        gg = gegio;
    }
    void setFileManager(FileManager faMa){
        fm = faMa;
    }
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new SchermataSchetaPersonaggio().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssoultButton;
    private javax.swing.JButton BulWarkButton;
    private javax.swing.JButton ChaplainButton;
    private javax.swing.JButton TerminatorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelArma1;
    private javax.swing.JLabel jLabelArma2;
    private javax.swing.JLabel jLabelArma3;
    private javax.swing.JLabel jLabelArma4;
    private javax.swing.JLabel jLabelArmatura1;
    private javax.swing.JLabel jLabelArmatura2;
    private javax.swing.JLabel jLabelArmatura3;
    private javax.swing.JLabel jLabelArmatura4;
    private javax.swing.JLabel jLabelBI;
    private javax.swing.JLabel jLabelCM;
    private javax.swing.JLabel jLabelCPH;
    private javax.swing.JLabel jLabelPO;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaBI;
    private javax.swing.JTextArea jTextAreaCM;
    private javax.swing.JTextArea jTextAreaCPH;
    private javax.swing.JTextArea jTextAreaPO;
    private javax.swing.JTextArea jTextAreaSpiegaArma;
    private javax.swing.JLabel sfondo;
    private javax.swing.JLabel titolo;
    // End of variables declaration//GEN-END:variables
}
