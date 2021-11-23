package MIPS;

import Unidades.ADDER;
import Unidades.ALU;
import Unidades.AluControl;
import Unidades.Contoller;
import Unidades.DataMemory;
import Unidades.DataPath;
import Unidades.InstructionMemory;
import Unidades.MUX;
import Unidades.PC;
import Unidades.Parse;
import static Unidades.Parse.*;
//import static Units.Parse.parseDtoB;
import Unidades.RegisterFile;
import Unidades.SL2;
import Unidades.SignExtend;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class APP extends javax.swing.JFrame {

    private int[] parseInt(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    class mem{
        JLabel j;
        int address;

        public mem(JLabel j, int address) {
            this.j = j;
            this.address = address;
        }

        public int getAddress() {
            return address;
        }

        public JLabel getJ() {
            return j;
        }

        public void setAddress(int address) {
            this.address = address;
        }

        public void setJ(JLabel j) {
            this.j = j;
        }
        
    }
    private  ArrayList <mem> Labels=new ArrayList<>();
    private  int k;
    private int n;
    private  int nomono;
    private  PC pc;
    private  ADDER adder1;
    private  ADDER adder2;
    private  ALU alu;
    private  SL2 sl1;
    private  SL2 sl2;
    private  SL2 sl3;
    private  SignExtend se;
    private  Contoller control;
    private  AluControl aluControl;
    private  MUX mux1;
    private  MUX mux2;
    private  MUX mux3;
    private  MUX mux4;
    private  MUX mux5;
    private  MUX mux6;
    private  MUX mux7;
    private  MUX mux8;
    private  MUX mux9;
    private  AluControl alucont;
    private  InstructionMemory im;
    private  DataMemory dm=new DataMemory();
    private  RegisterFile rf;
    private int counter;
    
     private DataPath d2;
     private DataPath d;
    
    public APP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        south = new javax.swing.JPanel();
        memory = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        memoryscrl = new javax.swing.JScrollPane();
        mempanal = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        registers = new javax.swing.JPanel();
        $0 = new javax.swing.JLabel();
        $0s = new javax.swing.JLabel();
        $at = new javax.swing.JLabel();
        $ats = new javax.swing.JLabel();
        $v0 = new javax.swing.JLabel();
        $v0s = new javax.swing.JLabel();
        $v1 = new javax.swing.JLabel();
        $v1s = new javax.swing.JLabel();
        $a0 = new javax.swing.JLabel();
        $a0s = new javax.swing.JLabel();
        $a1 = new javax.swing.JLabel();
        $a1s = new javax.swing.JLabel();
        $a2 = new javax.swing.JLabel();
        $a2s = new javax.swing.JLabel();
        $a3 = new javax.swing.JLabel();
        $a3s = new javax.swing.JLabel();
        $t0 = new javax.swing.JLabel();
        $t0s = new javax.swing.JLabel();
        $t1 = new javax.swing.JLabel();
        $t1s = new javax.swing.JLabel();
        $t2 = new javax.swing.JLabel();
        $t2s = new javax.swing.JLabel();
        $t3 = new javax.swing.JLabel();
        $t3s = new javax.swing.JLabel();
        $t4 = new javax.swing.JLabel();
        $t4s = new javax.swing.JLabel();
        $t5 = new javax.swing.JLabel();
        $t5s = new javax.swing.JLabel();
        $t6 = new javax.swing.JLabel();
        $t6s = new javax.swing.JLabel();
        $t7 = new javax.swing.JLabel();
        $t7s = new javax.swing.JLabel();
        $s0 = new javax.swing.JLabel();
        $s0s = new javax.swing.JLabel();
        $s1 = new javax.swing.JLabel();
        $s1s = new javax.swing.JLabel();
        $s2 = new javax.swing.JLabel();
        $s2s = new javax.swing.JLabel();
        $s3 = new javax.swing.JLabel();
        $s3s = new javax.swing.JLabel();
        $s4 = new javax.swing.JLabel();
        $s4s = new javax.swing.JLabel();
        $s5 = new javax.swing.JLabel();
        $s5s = new javax.swing.JLabel();
        $s6 = new javax.swing.JLabel();
        $s6s = new javax.swing.JLabel();
        $s7 = new javax.swing.JLabel();
        $s7s = new javax.swing.JLabel();
        $t8 = new javax.swing.JLabel();
        $t8s = new javax.swing.JLabel();
        $t9 = new javax.swing.JLabel();
        $t9s = new javax.swing.JLabel();
        $k0 = new javax.swing.JLabel();
        $k0s = new javax.swing.JLabel();
        $k1 = new javax.swing.JLabel();
        $k1s = new javax.swing.JLabel();
        $gp = new javax.swing.JLabel();
        $gps = new javax.swing.JLabel();
        $sp = new javax.swing.JLabel();
        $sps = new javax.swing.JLabel();
        $fp = new javax.swing.JLabel();
        $fps = new javax.swing.JLabel();
        $ra = new javax.swing.JLabel();
        $ras = new javax.swing.JLabel();
        text_area = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        datapath_scrl = new javax.swing.JScrollPane();
        datapath_values = new javax.swing.JPanel();
        rf_rf = new javax.swing.JLabel();
        op_code_l = new javax.swing.JLabel();
        rs = new javax.swing.JLabel();
        rs_l = new javax.swing.JLabel();
        bit16 = new javax.swing.JLabel();
        rt_l = new javax.swing.JLabel();
        func = new javax.swing.JLabel();
        rd_l = new javax.swing.JLabel();
        shamt = new javax.swing.JLabel();
        funct_l = new javax.swing.JLabel();
        bit32_rd2shamt_mux = new javax.swing.JLabel();
        pc_output_l = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        address_lbl = new javax.swing.JTextField();
        data_lbl = new javax.swing.JTextField();
        ADD_btn = new javax.swing.JButton();
        counter_l = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        save_btn = new javax.swing.JButton();
        next_btn = new javax.swing.JButton();
        run_brn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        compiler = new javax.swing.JMenuItem();
        nextr = new javax.swing.JMenuItem();
        runr = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIMULADOR MIPS");
        setMinimumSize(new java.awt.Dimension(1270, 700));
        setName("application"); // NOI18N
        setResizable(false);

        south.setPreferredSize(new java.awt.Dimension(500, 100));
        south.setLayout(new java.awt.GridLayout(1, 0));

        memory.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        memory.add(jPanel2, java.awt.BorderLayout.LINE_END);

        memoryscrl.setPreferredSize(new java.awt.Dimension(200, 200));

        mempanal.setBackground(new java.awt.Color(255, 255, 255));
        mempanal.setToolTipText("");
        mempanal.setMinimumSize(new java.awt.Dimension(20, 20));
        mempanal.setPreferredSize(new java.awt.Dimension(20, 20));
        mempanal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mempanalMouseClicked(evt);
            }
        });
        mempanal.setLayout(new java.awt.GridLayout(0, 3));
        memoryscrl.setViewportView(mempanal);

        memory.add(memoryscrl, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        memory.add(jPanel5, java.awt.BorderLayout.LINE_START);

        south.add(memory);

        getContentPane().add(south, java.awt.BorderLayout.SOUTH);

        registers.setBackground(new java.awt.Color(255, 255, 255));
        registers.setBorder(javax.swing.BorderFactory.createTitledBorder("Registradores"));
        registers.setAlignmentX(10.0F);
        registers.setFocusable(false);
        registers.setPreferredSize(new java.awt.Dimension(200, 700));
        registers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registersMousePressed(evt);
            }
        });
        registers.setLayout(new java.awt.GridLayout(32, 2));

        $0.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $0.setText("$0");
        $0.setToolTipText("");
        $0.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $0.setMaximumSize(new java.awt.Dimension(22, 30));
        $0.setMinimumSize(new java.awt.Dimension(22, 30));
        $0.setPreferredSize(new java.awt.Dimension(22, 30));
        registers.add($0);

        $0s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $0s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $0s.setText("0");
        $0s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        registers.add($0s);

        $at.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $at.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $at.setText("$at");
        $at.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        registers.add($at);

        $ats.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $ats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $ats.setText("0");
        $ats.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        registers.add($ats);

        $v0.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $v0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $v0.setText("$v0");
        $v0.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        registers.add($v0);

        $v0s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $v0s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $v0s.setText("0");
        $v0s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        registers.add($v0s);

        $v1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $v1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $v1.setText("$v1");
        $v1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        registers.add($v1);

        $v1s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $v1s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $v1s.setText("0");
        $v1s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        registers.add($v1s);

        $a0.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $a0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a0.setText("$a0");
        $a0.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        registers.add($a0);

        $a0s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $a0s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a0s.setText("0");
        $a0s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        registers.add($a0s);

        $a1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $a1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a1.setText("$a1");
        $a1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $a1.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($a1);

        $a1s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $a1s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a1s.setText("0");
        $a1s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $a1s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($a1s);

        $a2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $a2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a2.setText("$a2");
        $a2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $a2.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($a2);

        $a2s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $a2s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a2s.setText("0");
        $a2s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $a2s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($a2s);

        $a3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $a3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a3.setText("$a3");
        $a3.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $a3.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($a3);

        $a3s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $a3s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a3s.setText("0");
        $a3s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $a3s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($a3s);

        $t0.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t0.setText("$t0");
        $t0.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t0.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t0);

        $t0s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t0s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t0s.setText("0");
        $t0s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t0s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t0s);

        $t1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t1.setText("$t1");
        $t1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t1.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t1);

        $t1s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t1s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t1s.setText("0");
        $t1s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t1s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t1s);

        $t2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t2.setText("$t2");
        $t2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t2.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t2);

        $t2s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t2s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t2s.setText("0");
        $t2s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t2s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t2s);

        $t3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t3.setText("$t3");
        $t3.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t3.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t3);

        $t3s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t3s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t3s.setText("0");
        $t3s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t3s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t3s);

        $t4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t4.setText("$t4");
        $t4.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t4.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t4);

        $t4s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t4s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t4s.setText("0");
        $t4s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t4s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t4s);

        $t5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t5.setText("$t5");
        $t5.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t5.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t5);

        $t5s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t5s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t5s.setText("0");
        $t5s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t5s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t5s);

        $t6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t6.setText("$t6");
        $t6.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t6.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t6);

        $t6s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t6s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t6s.setText("0");
        $t6s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t6s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t6s);

        $t7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t7.setText("$t7");
        $t7.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t7.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t7);

        $t7s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t7s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t7s.setText("0");
        $t7s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t7s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t7s);

        $s0.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s0.setText("$s0");
        $s0.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s0.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s0);

        $s0s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s0s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s0s.setText("0");
        $s0s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s0s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s0s);

        $s1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s1.setText("$s1");
        $s1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s1.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s1);

        $s1s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s1s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s1s.setText("0");
        $s1s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s1s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s1s);

        $s2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s2.setText("$s2");
        $s2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s2.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s2);

        $s2s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s2s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s2s.setText("0");
        $s2s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s2s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s2s);

        $s3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s3.setText("$s3");
        $s3.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s3.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s3);

        $s3s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s3s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s3s.setText("0");
        $s3s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s3s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s3s);

        $s4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s4.setText("$s4");
        $s4.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s4.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s4);

        $s4s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s4s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s4s.setText("0");
        $s4s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s4s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s4s);

        $s5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s5.setText("$s5");
        $s5.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s5.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s5);

        $s5s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s5s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s5s.setText("0");
        $s5s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s5s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s5s);

        $s6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s6.setText("$s6");
        $s6.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s6.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s6);

        $s6s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s6s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s6s.setText("0");
        $s6s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s6s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s6s);

        $s7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s7.setText("$s7");
        $s7.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s7.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s7);

        $s7s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $s7s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s7s.setText("0");
        $s7s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $s7s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($s7s);

        $t8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t8.setText("$t8");
        $t8.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t8.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t8);

        $t8s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t8s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t8s.setText("0");
        $t8s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t8s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t8s);

        $t9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t9.setText("$t9");
        $t9.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t9.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t9);

        $t9s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $t9s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t9s.setText("0");
        $t9s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $t9s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($t9s);

        $k0.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $k0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $k0.setText("$k0");
        $k0.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $k0.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($k0);

        $k0s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $k0s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $k0s.setText("0");
        $k0s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $k0s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($k0s);

        $k1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $k1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $k1.setText("$k1");
        $k1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $k1.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($k1);

        $k1s.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $k1s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $k1s.setText("0");
        $k1s.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $k1s.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($k1s);

        $gp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $gp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $gp.setText("$gp");
        $gp.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $gp.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($gp);

        $gps.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $gps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $gps.setText("0");
        $gps.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $gps.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($gps);

        $sp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $sp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $sp.setText("$sp");
        $sp.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $sp.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($sp);

        $sps.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $sps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $sps.setText("0");
        $sps.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $sps.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($sps);

        $fp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $fp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $fp.setText("$fp");
        $fp.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $fp.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($fp);

        $fps.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $fps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $fps.setText("0");
        $fps.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $fps.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($fps);

        $ra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $ra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $ra.setText("$ra");
        $ra.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $ra.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($ra);

        $ras.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        $ras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $ras.setText("0");
        $ras.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        $ras.setPreferredSize(new java.awt.Dimension(0, 30));
        registers.add($ras);

        getContentPane().add(registers, java.awt.BorderLayout.EAST);

        text_area.setLayout(new java.awt.BorderLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArea1FocusLost(evt);
            }
        });
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextArea1MouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        text_area.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("DADOS DA MEMORIA");
        jPanel3.add(jLabel2);

        text_area.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(200, 10));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 0));

        datapath_scrl.setBackground(new java.awt.Color(255, 255, 255));
        datapath_scrl.setBorder(javax.swing.BorderFactory.createTitledBorder("Informa��es"));
        datapath_scrl.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        datapath_scrl.setFocusable(false);
        datapath_scrl.setOpaque(false);
        datapath_scrl.setPreferredSize(new java.awt.Dimension(200, 200));
        datapath_scrl.setWheelScrollingEnabled(false);
        datapath_scrl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datapath_scrlMouseClicked(evt);
            }
        });

        datapath_values.setLayout(new java.awt.GridLayout(0, 2));

        rf_rf.setBackground(new java.awt.Color(255, 255, 255));
        rf_rf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rf_rf.setText("OP code");
        rf_rf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rf_rf.setOpaque(true);
        datapath_values.add(rf_rf);

        op_code_l.setBackground(java.awt.Color.white);
        op_code_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        op_code_l.setText("0");
        op_code_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        op_code_l.setOpaque(true);
        datapath_values.add(op_code_l);

        rs.setBackground(java.awt.Color.white);
        rs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rs.setText("Rs");
        rs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rs.setOpaque(true);
        datapath_values.add(rs);

        rs_l.setBackground(java.awt.Color.white);
        rs_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rs_l.setText("0");
        rs_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rs_l.setOpaque(true);
        datapath_values.add(rs_l);

        bit16.setBackground(java.awt.Color.white);
        bit16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bit16.setText("Rt");
        bit16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bit16.setOpaque(true);
        datapath_values.add(bit16);

        rt_l.setBackground(java.awt.Color.white);
        rt_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rt_l.setText("0");
        rt_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rt_l.setOpaque(true);
        datapath_values.add(rt_l);

        func.setBackground(java.awt.Color.white);
        func.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        func.setText("Rd");
        func.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        func.setOpaque(true);
        datapath_values.add(func);

        rd_l.setBackground(java.awt.Color.white);
        rd_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rd_l.setText("0");
        rd_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rd_l.setOpaque(true);
        datapath_values.add(rd_l);

        shamt.setBackground(java.awt.Color.white);
        shamt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shamt.setText("Funct");
        shamt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        shamt.setOpaque(true);
        datapath_values.add(shamt);

        funct_l.setBackground(java.awt.Color.white);
        funct_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        funct_l.setText("0");
        funct_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        funct_l.setOpaque(true);
        datapath_values.add(funct_l);

        bit32_rd2shamt_mux.setBackground(java.awt.Color.white);
        bit32_rd2shamt_mux.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bit32_rd2shamt_mux.setText("PC");
        bit32_rd2shamt_mux.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bit32_rd2shamt_mux.setOpaque(true);
        datapath_values.add(bit32_rd2shamt_mux);

        pc_output_l.setBackground(java.awt.Color.white);
        pc_output_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pc_output_l.setText("0");
        pc_output_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pc_output_l.setOpaque(true);
        datapath_values.add(pc_output_l);

        datapath_scrl.setViewportView(datapath_values);

        jPanel4.add(datapath_scrl);

        jLabel1.setText("Adicionar dados na Mem�ria");
        jPanel4.add(jLabel1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(20, 20));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 80));

        address_lbl.setColumns(15);
        address_lbl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        address_lbl.setText("Endere�o");
        address_lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_lblActionPerformed(evt);
            }
        });
        jPanel1.add(address_lbl);

        data_lbl.setColumns(8);
        data_lbl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        data_lbl.setText("Valor");
        data_lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_lblActionPerformed(evt);
            }
        });
        jPanel1.add(data_lbl);

        ADD_btn.setText("Salvar");
        ADD_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_btnActionPerformed(evt);
            }
        });
        jPanel1.add(ADD_btn);

        jPanel4.add(jPanel1);

        counter_l.setBackground(new java.awt.Color(255, 255, 255));
        counter_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counter_l.setText("Passos: 0");
        counter_l.setToolTipText("");
        counter_l.setAlignmentY(0.0F);
        counter_l.setFocusable(false);
        counter_l.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        counter_l.setIconTextGap(10);
        counter_l.setInheritsPopupMenu(false);
        counter_l.setOpaque(true);
        jPanel4.add(counter_l);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setAlignmentX(0.0F);
        jPanel6.setPreferredSize(new java.awt.Dimension(200, 90));

        save_btn.setText("SALVAR");
        save_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        save_btn.setPreferredSize(new java.awt.Dimension(180, 23));
        save_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compilerMouseClicked(evt);
            }
        });
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilerActionPerformed(evt);
            }
        });
        jPanel6.add(save_btn);

        next_btn.setText("PROXIMO PASSO");
        next_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        next_btn.setPreferredSize(new java.awt.Dimension(180, 23));
        next_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextrActionPerformed(evt);
            }
        });
        jPanel6.add(next_btn);

        run_brn.setText("EXECUTAR TODO");
        run_brn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        run_brn.setPreferredSize(new java.awt.Dimension(180, 23));
        run_brn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runrActionPerformed(evt);
            }
        });
        jPanel6.add(run_brn);

        jPanel4.add(jPanel6);

        text_area.add(jPanel4, java.awt.BorderLayout.LINE_START);

        getContentPane().add(text_area, java.awt.BorderLayout.CENTER);

        jMenu3.setText("Op��es");

        compiler.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        compiler.setText("Salvar");
        compiler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compilerMouseClicked(evt);
            }
        });
        compiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilerActionPerformed(evt);
            }
        });
        jMenu3.add(compiler);

        nextr.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        nextr.setText("Proximo Passo");
        nextr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextrActionPerformed(evt);
            }
        });
        jMenu3.add(nextr);

        runr.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        runr.setText("Run");
        runr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runrActionPerformed(evt);
            }
        });
        jMenu3.add(runr);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private  void writeFile(String fileName) throws IOException{
    BufferedWriter fileOut = new BufferedWriter(new FileWriter(fileName));
    this.jTextArea1.write(fileOut);
}
    
    private void registersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registersMousePressed
                this.jTextArea1.setEnabled(false);
                
    }//GEN-LAST:event_registersMousePressed

    private void runrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runrActionPerformed
        while((k<im.getI())&&k>=0){

            counter++;
            im.CreateMachineString(im.getInstructionLine(PC.getCurrent()));
            im.CreateSubDataPath();

            control.setInput(im.getOpcode(), im.getFunc());

            counter_l.setText("Instructions done:"+counter+"");
            pc_output_l.setText(parseBtoD(pc.getPC().getBits())+"");
            op_code_l.setText(parseBtoD(im.getOpcode().getBits())+"");
            rs_l.setText(parseBtoD(im.getRs().getBits())+"");
            rt_l.setText(parseBtoD(im.getRt().getBits())+"");
            rd_l.setText(parseBtoD(im.getRd().getBits())+"");
            funct_l.setText(parseBtoD(im.getFunc().getBits())+"");

            mux3.setControl(control.getRegDst());
            mux3.setInput1(im.getRt());
            mux3.setInput2(im.getRd());

            rf.setControl(control.getRegWrite());
            rf.SetRegisterFile(im.getRs(), im.getRt(), mux3.getOutput());
            se.setInput(im.getThe16bit_address());

            mux8.setControl(control.getShift());
            mux8.setInput2(im.getShamt());
            mux8.setInput1(rf.getRead2());

            mux4.setControl(control.getALUSrc());
            mux4.setInput1(mux8.getOutput());
            mux4.setInput2(se.getOutput());

            alucont.AluControl_ctrl(im.getFunc(), control.getALUop());

            alu.setInp1(rf.getRead1());
            alu.setInp2(mux4.getOutput());
            alu.setSig(alucont.getSignal(),Parse.BtoS(im.getOpcode().getBits()));


            dm.setSP(Parse.parseBtoD((rf.getReg(28).getBits())));
            int x=Parse.parseBtoD(alu.getOutput().getBits());
            dm.setAddress(x);
            dm.setRead(control.getMemRead());
            dm.setWrite(control.getMemWrite());
            dm.store(rf.getRead2().getBits());
            if(!"00".equals(control.getMemWrite()) && !"0".equals(control.getMemWrite())){
                this.ADDMEMORYLABEL(dm.getAddress(), dm.getLocation());
            }

            mux5.setControl(control.getMemToReg());
            mux5.setInput1(alu.getOutput());
            mux5.setInput2(dm.load());

            adder1.setInput1(pc.getPC());
            adder1.setInput2(d);
            adder1.add();
            DataPath w=new DataPath(32);
            
            adder2.setInput1(adder1.getOutput());
            sl2.setInput(se.getOutput());
            adder2.setInput2(sl2.getOutput());
            adder2.add();

            //ALU.ZeroFlag();
            String s;
            if(("1".equals(control.getBranch()))&&("1".equals(alu.getZeroFlag()+"")))
            s="1";
            else
            s="0";

            mux1.setControl(s);
            mux1.setInput1(adder1.getOutput());
            mux1.setInput2(adder2.getOutput());

            for(int i=4;i<30;i++)
            d2.setbyte(i, im.getThe26bit_address().getbyte(i-4));
            d2.setbyte(30, 0);
            d2.setbyte(31, 0);
            for(int i=0;i<4;i++)
            d2.setbyte(i, adder1.getOutput().getbyte(i));

            mux2.setControl(control.getJump());
            mux2.setInput1(mux1.getOutput());
            mux2.setInput2(d2);

            mux6.setControl(control.getPCSrc());
            mux6.setInput1(mux2.getOutput());
            //mux6.setInput2(rf.getReg(31));
            mux6.setInput2(rf.getReg(31));

            mux7.setControl(control.getJumpReg());
            mux7.setInput1(mux5.getOutput());
            mux7.setInput2(adder1.getOutput());

            rf.setReg(mux7.getOutput().getBits());
            pc.setPC(mux6.getOutput().getBits());
            dm.setSP(Parse.parseBtoD(rf.getReg(29).getBits()));
            rf.resetzero();
            this.GET_REGISTERVALUE();

            k=(parseBtoD(pc.getPC().getBits())-nomono)/4;
            System.out.println(k);
        }
    }

    private void nextrActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if((k<im.getI())&&k>=0){
            counter++;
            im.CreateMachineString(im.getInstructionLine(PC.getCurrent()));
            im.CreateSubDataPath();

            control.setInput(im.getOpcode(), im.getFunc());

            counter_l.setText("Instructions done:"+counter+"");
            pc_output_l.setText(parseBtoD(pc.getPC().getBits())+"");
            op_code_l.setText(parseBtoD(im.getOpcode().getBits())+"");
            rs_l.setText(parseBtoD(im.getRs().getBits())+"");
            rt_l.setText(parseBtoD(im.getRt().getBits())+"");
            rd_l.setText(parseBtoD(im.getRd().getBits())+"");
            funct_l.setText(parseBtoD(im.getFunc().getBits())+"");
            mux3.setControl(control.getRegDst());
            mux3.setInput1(im.getRt());
            mux3.setInput2(im.getRd());

            rf.setControl(control.getRegWrite());
            rf.SetRegisterFile(im.getRs(), im.getRt(), mux3.getOutput());
            se.setInput(im.getThe16bit_address());

            mux8.setControl(control.getShift());
            mux8.setInput2(im.getShamt());
            mux8.setInput1(rf.getRead2());

            mux4.setControl(control.getALUSrc());
            mux4.setInput1(mux8.getOutput());
            mux4.setInput2(se.getOutput());

            //alucont.Do(control.getALUop(),BtoS(im.getFunc().getBits()));
            alucont.AluControl_ctrl(im.getFunc(), control.getALUop());

            alu.setInp1(rf.getRead1());
            alu.setInp2(mux4.getOutput());
            alu.setSig(alucont.getSignal(),Parse.BtoS(im.getOpcode().getBits()));

            dm.setSP(Parse.parseBtoD((rf.getReg(28).getBits())));
            int x=Parse.parseBtoD(alu.getOutput().getBits());
            dm.setAddress(x);
            dm.setRead(control.getMemRead());
            dm.setWrite(control.getMemWrite());
            dm.store(rf.getRead2().getBits());
            if(!"00".equals(control.getMemWrite()) && !"0".equals(control.getMemWrite())){
                this.ADDMEMORYLABEL(dm.getAddress(), dm.getLocation());
            }

            mux5.setControl(control.getMemToReg());
            mux5.setInput1(alu.getOutput());
            mux5.setInput2(dm.load());

            adder1.setInput1(pc.getPC());
            adder1.setInput2(d);
            adder1.add();
            DataPath w=new DataPath(32);
            adder2.setInput1(adder1.getOutput());
            sl2.setInput(se.getOutput());
            adder2.setInput2(sl2.getOutput());
            adder2.add();

            //ALU.ZeroFlag();
            String s;
            if(("1".equals(control.getBranch()))&&("1".equals(alu.getZeroFlag()+"")))
            s="1";
            else
            s="0";
            mux1.setControl(s);
            mux1.setInput1(adder1.getOutput());
            mux1.setInput2(adder2.getOutput());

            for(int i=4;i<30;i++)
            d2.setbyte(i, im.getThe26bit_address().getbyte(i-4));
            d2.setbyte(30, 0);
            d2.setbyte(31, 0);
            for(int i=0;i<4;i++)
            d2.setbyte(i, adder1.getOutput().getbyte(i));

            mux2.setControl(control.getJump());
            mux2.setInput1(mux1.getOutput());
            mux2.setInput2(d2);

            mux6.setControl(control.getPCSrc());//true control signal
            mux6.setInput1(mux2.getOutput());
            mux6.setInput2(rf.getReg(31));//34an 2l shift left bta3t 2l $ra fl jr

            mux7.setControl(control.getJumpReg());//true control signal
            mux7.setInput1(mux5.getOutput());
            mux7.setInput2(adder1.getOutput());
            rf.setReg(mux7.getOutput().getBits());
            pc.setPC(mux6.getOutput().getBits());
            dm.setSP(Parse.parseBtoD(rf.getReg(29).getBits()));
            rf.resetzero();
            this.GET_REGISTERVALUE();

            k=(Parse.parseBtoD(pc.getPC().getBits())-nomono)/4;//for testing the pc
            System.out.println(k);//for testing the pc
        }
    }

    private void compilerActionPerformed(java.awt.event.ActionEvent evt) {
        Scanner sc=new Scanner(System.in);

        // nomono=sc.nextInt();
        nomono=4;
        Unidades.Instruction.setOffset(nomono);
        pc=new PC(nomono);
        adder1=new ADDER();
        adder2=new ADDER();
        alu=new ALU();
        sl1=new SL2();
        sl2=new SL2();
        sl3=new SL2();
        se=new SignExtend();
        control=new Contoller();
        aluControl =new AluControl();
        mux1=new MUX(32);
        mux2=new MUX(32);
        mux3=new MUX(5);
        mux4=new MUX(32);
        mux5=new MUX(32);
        mux6=new MUX(32);
        mux7=new MUX(32);
        mux8=new MUX(32);
        mux9=new MUX(32);
        alucont=new AluControl();
        im=new InstructionMemory();
        //dm=new DataMemory();/////////////////////////////
        rf=new RegisterFile();
        counter=0;

        try {
            this.writeFile("Modelo.txt");
        } catch (IOException ex) {
            Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
        }
        //the datapath
        //File file =new File("input.txt");
        n=Parse.parseBtoD(pc.getPC().getBits());
        im.setinstruction("Modelo.txt",n  );
        d2=new DataPath(32);
        d=new DataPath(32);
        d.setBits(parseDtoB(4,32));

        //load 2l data memory
        //System.out.println("load the Data Memory");
        //dm.loadData();

        k=(Parse.parseBtoD(pc.getPC().getBits())-nomono)/4;//for testing
        System.out.println(k);//for testing
    }//GEN-LAST:event_compilerActionPerformed

    private void compilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compilerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_compilerMouseClicked

    private void jTextArea1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1MouseExited

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        this.jTextArea1.setEnabled(true);
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jTextArea1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1FocusLost

    private void datapath_scrlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datapath_scrlMouseClicked
        this.jTextArea1.setEnabled(false);
    }//GEN-LAST:event_datapath_scrlMouseClicked

    private void mempanalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mempanalMouseClicked
        this.jTextArea1.setEnabled(false);
    }//GEN-LAST:event_mempanalMouseClicked

    private void ADD_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_btnActionPerformed
        // TODO add your handling code here:
        //dm.setSP(parseBtoD(StoB(address_lbl.getText(),32)));
        try{
            dm.setWrite("10");
            dm.setAddress(parseBtoD(StoB(address_lbl.getText())));
            dm.store(StoB(data_lbl.getText()));
            this.ADDMEMORYLABEL(dm.getAddress(), dm.getLocation());
            this.repaint();
        }
        catch(Exception e){
            address_lbl.setText("ERROR");
            data_lbl.setText("NV");
        }
    }//GEN-LAST:event_ADD_btnActionPerformed

    private void data_lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_lblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_lblActionPerformed

    private void address_lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_lblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_lblActionPerformed

    public  void ADDMEMORYLABEL(int address,int locations){
        boolean x=false;
        for(int i=0;i<Labels.size();i++){
            if(Labels.get(i).address==address){
                Labels.get(i).j.setText("memory:"+address+"="+locations);
                //Labels.get(i).j.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(), BorderFactory.createLineBorder(Color.BLACK)));
                x=true;
            }
        }
        if(x==false){
           mem jx=new mem(new JLabel(address+":"+locations), address);
           jx.j.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(), BorderFactory.createLineBorder(Color.BLACK)));
            Labels.add(jx);
            mempanal.add(jx.getJ());   
        }
        repaint();
    }
    
    private void GET_REGISTERVALUE(){
      //  $0s.setText((Parse.parseBtoD((rf.getReg(0)).getBits()))+"");
         $ats.setText((Parse.parseBtoD((rf.getReg(1)).getBits()))+"");
          $v0s.setText((Parse.parseBtoD((rf.getReg(2)).getBits()))+"");
           $v1s.setText((Parse.parseBtoD((rf.getReg(3)).getBits()))+"");
           $a0s.setText((Parse.parseBtoD((rf.getReg(4)).getBits()))+"");
           $a1s.setText((Parse.parseBtoD((rf.getReg(5)).getBits()))+"");
           $a2s.setText((Parse.parseBtoD((rf.getReg(6)).getBits()))+"");
           $a3s.setText((Parse.parseBtoD((rf.getReg(7)).getBits()))+"");
           $t0s.setText((Parse.parseBtoD((rf.getReg(8)).getBits()))+"");
           $t1s.setText((Parse.parseBtoD((rf.getReg(9)).getBits()))+"");
           $t2s.setText((Parse.parseBtoD((rf.getReg(10)).getBits()))+"");
           $t3s.setText((Parse.parseBtoD((rf.getReg(11)).getBits()))+"");
           $t4s.setText((Parse.parseBtoD((rf.getReg(12)).getBits()))+"");
           $t5s.setText((Parse.parseBtoD((rf.getReg(13)).getBits()))+"");
           $t6s.setText((Parse.parseBtoD((rf.getReg(14)).getBits()))+"");
           $t7s.setText((Parse.parseBtoD((rf.getReg(15)).getBits()))+"");
           $s0s.setText((Parse.parseBtoD((rf.getReg(16)).getBits()))+"");
           $s1s.setText((Parse.parseBtoD((rf.getReg(17)).getBits()))+"");
           $s2s.setText((Parse.parseBtoD((rf.getReg(18)).getBits()))+"");
           $s3s.setText((Parse.parseBtoD((rf.getReg(19)).getBits()))+"");
           $s4s.setText((Parse.parseBtoD((rf.getReg(20)).getBits()))+"");
           $s5s.setText((Parse.parseBtoD((rf.getReg(21)).getBits()))+"");
           $s6s.setText((Parse.parseBtoD((rf.getReg(22)).getBits()))+"");
           $s7s.setText((Parse.parseBtoD((rf.getReg(23)).getBits()))+"");
           $t8s.setText((Parse.parseBtoD((rf.getReg(24)).getBits()))+"");
           $t9s.setText((Parse.parseBtoD((rf.getReg(25)).getBits()))+"");
           $k0s.setText((Parse.parseBtoD((rf.getReg(26)).getBits()))+"");
           $k1s.setText((Parse.parseBtoD((rf.getReg(27)).getBits()))+"");
           $gps.setText((Parse.parseBtoD((rf.getReg(28)).getBits()))+"");
           $sps.setText((Parse.parseBtoD((rf.getReg(29)).getBits()))+"");
           $fps.setText((Parse.parseBtoD((rf.getReg(30)).getBits()))+"");
           $ras.setText((Parse.parseBtoD((rf.getReg(31)).getBits()))+"");
           repaint();
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel $0;
    private javax.swing.JLabel $0s;
    private javax.swing.JLabel $a0;
    private javax.swing.JLabel $a0s;
    private javax.swing.JLabel $a1;
    private javax.swing.JLabel $a1s;
    private javax.swing.JLabel $a2;
    private javax.swing.JLabel $a2s;
    private javax.swing.JLabel $a3;
    private javax.swing.JLabel $a3s;
    private javax.swing.JLabel $at;
    private javax.swing.JLabel $ats;
    private javax.swing.JLabel $fp;
    private javax.swing.JLabel $fps;
    private javax.swing.JLabel $gp;
    private javax.swing.JLabel $gps;
    private javax.swing.JLabel $k0;
    private javax.swing.JLabel $k0s;
    private javax.swing.JLabel $k1;
    private javax.swing.JLabel $k1s;
    private javax.swing.JLabel $ra;
    private javax.swing.JLabel $ras;
    private javax.swing.JLabel $s0;
    private javax.swing.JLabel $s0s;
    private javax.swing.JLabel $s1;
    private javax.swing.JLabel $s1s;
    private javax.swing.JLabel $s2;
    private javax.swing.JLabel $s2s;
    private javax.swing.JLabel $s3;
    private javax.swing.JLabel $s3s;
    private javax.swing.JLabel $s4;
    private javax.swing.JLabel $s4s;
    private javax.swing.JLabel $s5;
    private javax.swing.JLabel $s5s;
    private javax.swing.JLabel $s6;
    private javax.swing.JLabel $s6s;
    private javax.swing.JLabel $s7;
    private javax.swing.JLabel $s7s;
    private javax.swing.JLabel $sp;
    private javax.swing.JLabel $sps;
    private javax.swing.JLabel $t0;
    private javax.swing.JLabel $t0s;
    private javax.swing.JLabel $t1;
    private javax.swing.JLabel $t1s;
    private javax.swing.JLabel $t2;
    private javax.swing.JLabel $t2s;
    private javax.swing.JLabel $t3;
    private javax.swing.JLabel $t3s;
    private javax.swing.JLabel $t4;
    private javax.swing.JLabel $t4s;
    private javax.swing.JLabel $t5;
    private javax.swing.JLabel $t5s;
    private javax.swing.JLabel $t6;
    private javax.swing.JLabel $t6s;
    private javax.swing.JLabel $t7;
    private javax.swing.JLabel $t7s;
    private javax.swing.JLabel $t8;
    private javax.swing.JLabel $t8s;
    private javax.swing.JLabel $t9;
    private javax.swing.JLabel $t9s;
    private javax.swing.JLabel $v0;
    private javax.swing.JLabel $v0s;
    private javax.swing.JLabel $v1;
    private javax.swing.JLabel $v1s;
    private javax.swing.JButton ADD_btn;
    private javax.swing.JTextField address_lbl;
    private javax.swing.JLabel bit16;
    private javax.swing.JLabel bit32_rd2shamt_mux;
    private javax.swing.JMenuItem compiler;
    private javax.swing.JLabel counter_l;
    private javax.swing.JTextField data_lbl;
    private javax.swing.JScrollPane datapath_scrl;
    private javax.swing.JPanel datapath_values;
    private javax.swing.JLabel func;
    private javax.swing.JLabel funct_l;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel memory;
    private javax.swing.JScrollPane memoryscrl;
    private javax.swing.JPanel mempanal;
    private javax.swing.JButton next_btn;
    private javax.swing.JMenuItem nextr;
    private javax.swing.JLabel op_code_l;
    private javax.swing.JLabel pc_output_l;
    private javax.swing.JLabel rd_l;
    private javax.swing.JPanel registers;
    private javax.swing.JLabel rf_rf;
    private javax.swing.JLabel rs;
    private javax.swing.JLabel rs_l;
    private javax.swing.JLabel rt_l;
    private javax.swing.JButton run_brn;
    private javax.swing.JMenuItem runr;
    private javax.swing.JButton save_btn;
    private javax.swing.JLabel shamt;
    private javax.swing.JPanel south;
    private javax.swing.JPanel text_area;
    // End of variables declaration//GEN-END:variables
}
