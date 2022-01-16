package Main;

import Units.ADDER;
import Units.ALU;
import Units.AluControl;
import Units.Contoller;
import Units.DataMemory;
import Units.DataPath;
import Units.InstructionMemory;
import Units.MUX;
import Units.PC;
import Units.Parse;

import static Units.Parse.*;
//import static Units.Parse.parseDtoB;
import Units.RegisterFile;
import Units.SL2;
import Units.SignExtend;

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

    class mem {
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

    private ArrayList<mem> Labels = new ArrayList<>();
    private int compi = 0;
    private int k;
    private int n;
    private int nomono;
    private PC pc;
    private ADDER adder1;
    private ADDER adder2;
    private ALU alu;
    private SL2 sl1;
    private SL2 sl2;
    private SL2 sl3;
    private SignExtend se;
    private Contoller control;
    private AluControl aluControl;
    private MUX mux1;
    private MUX mux2;
    private MUX mux3;
    private MUX mux4;
    private MUX mux5;
    private MUX mux6;
    private MUX mux7;
    private MUX mux8;
    private MUX mux9;
    private AluControl alucont;
    private InstructionMemory im;
    private DataMemory dm = new DataMemory();//////////////////////////
    private RegisterFile rf;
    private int counter;

    private DataPath d2;
    private DataPath d;

    public APP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        read_data1 = new javax.swing.JLabel();
        shamt_l = new javax.swing.JLabel();
        shamt = new javax.swing.JLabel();
        funct_l = new javax.swing.JLabel();
        bit32_rd2shamt_mux = new javax.swing.JLabel();
        pc_output_l = new javax.swing.JLabel();
        zerofalg = new javax.swing.JLabel();
        pc_adder_output_l = new javax.swing.JLabel();
        jr_mux = new javax.swing.JLabel();
        read_data1_l = new javax.swing.JLabel();
        bit32_sl2 = new javax.swing.JLabel();
        read_data2_l = new javax.swing.JLabel();
        branch_mux = new javax.swing.JLabel();
        alu_input1_l = new javax.swing.JLabel();
        pcoutput = new javax.swing.JLabel();
        alu_input2_l = new javax.swing.JLabel();
        jumb_add = new javax.swing.JLabel();
        alu_output_l = new javax.swing.JLabel();
        ctr_jump = new javax.swing.JLabel();
        mem_address_l = new javax.swing.JLabel();
        ctr_memread = new javax.swing.JLabel();
        mem_write_data_l = new javax.swing.JLabel();
        ctr_alusrc = new javax.swing.JLabel();
        and_gate_l = new javax.swing.JLabel();
        rt1 = new javax.swing.JLabel();
        signextend_input_l = new javax.swing.JLabel();
        regdstmux1 = new javax.swing.JLabel();
        signextend_output_l = new javax.swing.JLabel();
        bit33 = new javax.swing.JLabel();
        alu_control_l = new javax.swing.JLabel();
        jumb_mux1 = new javax.swing.JLabel();
        ctr_regDest_l = new javax.swing.JLabel();
        pcp5 = new javax.swing.JLabel();
        ctr_regWrite_l = new javax.swing.JLabel();
        ctr_branch1 = new javax.swing.JLabel();
        ctr_aluOp_l = new javax.swing.JLabel();
        ctr_memreg1 = new javax.swing.JLabel();
        ctr_branch_l = new javax.swing.JLabel();
        ctr_memwrite1 = new javax.swing.JLabel();
        ctr_memRead_l = new javax.swing.JLabel();
        ctr_regwrite1 = new javax.swing.JLabel();
        ctr_memWrite_l = new javax.swing.JLabel();
        ctr_shiftlogic1 = new javax.swing.JLabel();
        ctr_memToReg_l = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ctr_jump_l = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ctr_shiftLogic_l = new javax.swing.JLabel();
        memoryscrl = new javax.swing.JScrollPane();
        mempanal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        counter_l = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIMULADOR 2.0");
        setMinimumSize(new java.awt.Dimension(1270, 700));
        setName("application");
        setResizable(false);

        registers.setFocusable(false);
        registers.setName("");
        registers.setPreferredSize(new java.awt.Dimension(200, 800));
        registers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registersMousePressed(evt);
            }
        });
        registers.setLayout(new java.awt.GridLayout(32, 2));

        $0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $0.setText("$0");
        $0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $0.setIconTextGap(2);
        $0.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($0);

        $0s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $0s.setText("0");
        $0s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $0s.setIconTextGap(2);
        $0s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($0s);

        $at.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $at.setText("$at");
        $at.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $at.setIconTextGap(2);
        $at.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($at);

        $ats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $ats.setText("0");
        $ats.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $ats.setIconTextGap(2);
        $ats.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($ats);

        $v0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $v0.setText("$v0");
        $v0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $v0.setIconTextGap(2);
        $v0.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($v0);

        $v0s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $v0s.setText("0");
        $v0s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $v0s.setIconTextGap(2);
        $v0s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($v0s);

        $v1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $v1.setText("$v1");
        $v1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $v1.setIconTextGap(2);
        $v1.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($v1);

        $v1s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $v1s.setText("0");
        $v1s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $v1s.setIconTextGap(2);
        $v1s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($v1s);

        $a0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a0.setText("$a0");
        $a0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $a0.setIconTextGap(2);
        $a0.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($a0);

        $a0s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a0s.setText("0");
        $a0s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $a0s.setIconTextGap(2);
        $a0s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($a0s);

        $a1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a1.setText("$a1");
        $a1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $a1.setIconTextGap(2);
        $a1.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($a1);

        $a1s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a1s.setText("0");
        $a1s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $a1s.setIconTextGap(2);
        $a1s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($a1s);

        $a2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a2.setText("$a2");
        $a2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $a2.setIconTextGap(2);
        $a2.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($a2);

        $a2s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a2s.setText("0");
        $a2s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $a2s.setIconTextGap(2);
        $a2s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($a2s);

        $a3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a3.setText("$a3");
        $a3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $a3.setIconTextGap(2);
        $a3.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($a3);

        $a3s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $a3s.setText("0");
        $a3s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $a3s.setIconTextGap(2);
        $a3s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($a3s);

        $t0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t0.setText("$t0");
        $t0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t0.setIconTextGap(2);
        $t0.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t0);

        $t0s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t0s.setText("0");
        $t0s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t0s.setIconTextGap(2);
        $t0s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t0s);

        $t1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t1.setText("$t1");
        $t1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t1.setIconTextGap(2);
        $t1.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t1);

        $t1s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t1s.setText("0");
        $t1s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t1s.setIconTextGap(2);
        $t1s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t1s);

        $t2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t2.setText("$t2");
        $t2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t2.setIconTextGap(2);
        $t2.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t2);

        $t2s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t2s.setText("0");
        $t2s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t2s.setIconTextGap(2);
        $t2s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t2s);

        $t3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t3.setText("$t3");
        $t3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t3.setIconTextGap(2);
        $t3.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t3);

        $t3s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t3s.setText("0");
        $t3s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t3s.setIconTextGap(2);
        $t3s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t3s);

        $t4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t4.setText("$t4");
        $t4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t4.setIconTextGap(2);
        $t4.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t4);

        $t4s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t4s.setText("0");
        $t4s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t4s.setIconTextGap(2);
        $t4s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t4s);

        $t5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t5.setText("$t5");
        $t5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t5.setIconTextGap(2);
        $t5.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t5);

        $t5s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t5s.setText("0");
        $t5s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t5s.setIconTextGap(2);
        $t5s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t5s);

        $t6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t6.setText("$t6");
        $t6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t6.setIconTextGap(2);
        $t6.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t6);

        $t6s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t6s.setText("0");
        $t6s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t6s.setIconTextGap(2);
        $t6s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t6s);

        $t7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t7.setText("$t7");
        $t7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t7.setIconTextGap(2);
        $t7.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t7);

        $t7s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t7s.setText("0");
        $t7s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t7s.setIconTextGap(2);
        $t7s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t7s);

        $s0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s0.setText("$s0");
        $s0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s0.setIconTextGap(2);
        $s0.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s0);

        $s0s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s0s.setText("0");
        $s0s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s0s.setIconTextGap(2);
        $s0s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s0s);

        $s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s1.setText("$s1");
        $s1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s1.setIconTextGap(2);
        $s1.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s1);

        $s1s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s1s.setText("0");
        $s1s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s1s.setIconTextGap(2);
        $s1s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s1s);

        $s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s2.setText("$s2");
        $s2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s2.setIconTextGap(2);
        $s2.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s2);

        $s2s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s2s.setText("0");
        $s2s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s2s.setIconTextGap(2);
        $s2s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s2s);

        $s3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s3.setText("$s3");
        $s3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s3.setIconTextGap(2);
        $s3.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s3);

        $s3s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s3s.setText("0");
        $s3s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s3s.setIconTextGap(2);
        $s3s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s3s);

        $s4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s4.setText("$s4");
        $s4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s4.setIconTextGap(2);
        $s4.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s4);

        $s4s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s4s.setText("0");
        $s4s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s4s.setIconTextGap(2);
        $s4s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s4s);

        $s5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s5.setText("$s5");
        $s5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s5.setIconTextGap(2);
        $s5.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s5);

        $s5s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s5s.setText("0");
        $s5s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s5s.setIconTextGap(2);
        $s5s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s5s);

        $s6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s6.setText("$s6");
        $s6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s6.setIconTextGap(2);
        $s6.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s6);

        $s6s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s6s.setText("0");
        $s6s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s6s.setIconTextGap(2);
        $s6s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s6s);

        $s7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s7.setText("$s7");
        $s7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s7.setIconTextGap(2);
        $s7.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s7);

        $s7s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $s7s.setText("0");
        $s7s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $s7s.setIconTextGap(2);
        $s7s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($s7s);

        $t8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t8.setText("$t8");
        $t8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t8.setIconTextGap(2);
        $t8.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t8);

        $t8s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t8s.setText("0");
        $t8s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t8s.setIconTextGap(2);
        $t8s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t8s);

        $t9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t9.setText("$t9");
        $t9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t9.setIconTextGap(2);
        $t9.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t9);

        $t9s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $t9s.setText("0");
        $t9s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $t9s.setIconTextGap(2);
        $t9s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($t9s);

        $k0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $k0.setText("$k0");
        $k0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $k0.setIconTextGap(2);
        $k0.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($k0);

        $k0s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $k0s.setText("0");
        $k0s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $k0s.setIconTextGap(2);
        $k0s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($k0s);

        $k1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $k1.setText("$k1");
        $k1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $k1.setIconTextGap(2);
        $k1.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($k1);

        $k1s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $k1s.setText("0");
        $k1s.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $k1s.setIconTextGap(2);
        $k1s.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($k1s);

        $gp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $gp.setText("$gp");
        $gp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $gp.setIconTextGap(2);
        $gp.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($gp);

        $gps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $gps.setText("0");
        $gps.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $gps.setIconTextGap(2);
        $gps.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($gps);

        $sp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $sp.setText("$sp");
        $sp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $sp.setIconTextGap(2);
        $sp.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($sp);

        $sps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $sps.setText("0");
        $sps.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $sps.setIconTextGap(2);
        $sps.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($sps);

        $fp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $fp.setText("$fp");
        $fp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $fp.setIconTextGap(2);
        $fp.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($fp);

        $fps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $fps.setText("0");
        $fps.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $fps.setIconTextGap(2);
        $fps.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($fps);

        $ra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $ra.setText("$ra");
        $ra.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $ra.setIconTextGap(2);
        $ra.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($ra);

        $ras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        $ras.setText("0");
        $ras.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        $ras.setIconTextGap(2);
        $ras.setPreferredSize(new java.awt.Dimension(0, 0));
        registers.add($ras);

        getContentPane().add(registers, java.awt.BorderLayout.WEST);

        text_area.setLayout(new java.awt.BorderLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setMaximumSize(new java.awt.Dimension(200, 2147483647));
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

        datapath_scrl.setPreferredSize(new java.awt.Dimension(300, 1035));
        datapath_scrl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datapath_scrlMouseClicked(evt);
            }
        });

        datapath_values.setFocusable(false);
        datapath_values.setLayout(new java.awt.GridLayout(0, 2));

        rf_rf.setText("OP code");
        rf_rf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(rf_rf);

        op_code_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        op_code_l.setText("0");
        op_code_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        op_code_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        op_code_l.setMaximumSize(new java.awt.Dimension(10, 24));
        op_code_l.setMinimumSize(new java.awt.Dimension(10, 24));
        op_code_l.setPreferredSize(new java.awt.Dimension(10, 10));
        datapath_values.add(op_code_l);

        rs.setText("Rs");
        rs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(rs);

        rs_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rs_l.setText("0");
        rs_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rs_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(rs_l);

        bit16.setText("Rt");
        bit16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(bit16);

        rt_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rt_l.setText("0");
        rt_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rt_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(rt_l);

        func.setText("Rd");
        func.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(func);

        rd_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rd_l.setText("0");
        rd_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rd_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(rd_l);

        read_data1.setText("Shamt");
        read_data1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(read_data1);

        shamt_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shamt_l.setText("0");
        shamt_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        shamt_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(shamt_l);

        shamt.setText("Funct");
        shamt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(shamt);

        funct_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        funct_l.setText("0");
        funct_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        funct_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(funct_l);

        bit32_rd2shamt_mux.setText("PC - Saida");
        bit32_rd2shamt_mux.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(bit32_rd2shamt_mux);

        pc_output_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pc_output_l.setText("0");
        pc_output_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pc_output_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(pc_output_l);

        zerofalg.setText("PC Adder - Saida");
        zerofalg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(zerofalg);

        pc_adder_output_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pc_adder_output_l.setText("0");
        pc_adder_output_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pc_adder_output_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(pc_adder_output_l);

        jr_mux.setText("Le dados 1");
        jr_mux.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(jr_mux);

        read_data1_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        read_data1_l.setText("0");
        read_data1_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        read_data1_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(read_data1_l);

        bit32_sl2.setText("Le dados 2");
        bit32_sl2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(bit32_sl2);

        read_data2_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        read_data2_l.setText("0");
        read_data2_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        read_data2_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(read_data2_l);

        branch_mux.setText("ULA - Entrada 1");
        branch_mux.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(branch_mux);

        alu_input1_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alu_input1_l.setText("0");
        alu_input1_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        alu_input1_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(alu_input1_l);

        pcoutput.setText("ULA - Entrada 2");
        pcoutput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(pcoutput);

        alu_input2_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alu_input2_l.setText("0");
        alu_input2_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        alu_input2_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(alu_input2_l);

        jumb_add.setText("ULA - Saida");
        jumb_add.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(jumb_add);

        alu_output_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alu_output_l.setText("0");
        alu_output_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        alu_output_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(alu_output_l);

        ctr_jump.setText("Endereco de Memoria");
        ctr_jump.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(ctr_jump);

        mem_address_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mem_address_l.setText("0");
        mem_address_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mem_address_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(mem_address_l);

        ctr_memread.setText("MemWrite - Dados");
        ctr_memread.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(ctr_memread);

        mem_write_data_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mem_write_data_l.setText("0");
        mem_write_data_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mem_write_data_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(mem_write_data_l);

        ctr_alusrc.setText("Porta AND - Saida");
        ctr_alusrc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(ctr_alusrc);

        and_gate_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        and_gate_l.setText("0");
        and_gate_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        and_gate_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(and_gate_l);

        rt1.setText("Extensao de Sinal - Entrada");
        rt1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(rt1);

        signextend_input_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signextend_input_l.setText("0");
        signextend_input_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        signextend_input_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(signextend_input_l);

        regdstmux1.setText("Extensao de Sinal - Saida");
        regdstmux1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(regdstmux1);

        signextend_output_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signextend_output_l.setText("0");
        signextend_output_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        signextend_output_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(signextend_output_l);

        bit33.setText("ULA CONTROL");
        bit33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(bit33);

        alu_control_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alu_control_l.setText("0");
        alu_control_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        alu_control_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(alu_control_l);

        jumb_mux1.setText("CONTROLE - regDest");
        jumb_mux1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(jumb_mux1);

        ctr_regDest_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ctr_regDest_l.setText("0");
        ctr_regDest_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ctr_regDest_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(ctr_regDest_l);

        pcp5.setText("CONTROLE - regWrite");
        pcp5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(pcp5);

        ctr_regWrite_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ctr_regWrite_l.setText("0");
        ctr_regWrite_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ctr_regWrite_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(ctr_regWrite_l);

        ctr_branch1.setText("CONTROLE - ALUOp");
        ctr_branch1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(ctr_branch1);

        ctr_aluOp_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ctr_aluOp_l.setText("0");
        ctr_aluOp_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ctr_aluOp_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(ctr_aluOp_l);

        ctr_memreg1.setText("CONTROLE - branch");
        ctr_memreg1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(ctr_memreg1);

        ctr_branch_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ctr_branch_l.setText("0");
        ctr_branch_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ctr_branch_l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datapath_values.add(ctr_branch_l);

        ctr_memwrite1.setText("CONTROLE - memRead");
        ctr_memwrite1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(ctr_memwrite1);

        ctr_memRead_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ctr_memRead_l.setText("0");
        ctr_memRead_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(ctr_memRead_l);

        ctr_regwrite1.setText("CONTROLE - memWrite");
        ctr_regwrite1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(ctr_regwrite1);

        ctr_memWrite_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ctr_memWrite_l.setText("0");
        ctr_memWrite_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(ctr_memWrite_l);

        ctr_shiftlogic1.setText("CONTROLE - memToReg");
        ctr_shiftlogic1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(ctr_shiftlogic1);

        ctr_memToReg_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ctr_memToReg_l.setText("0");
        ctr_memToReg_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(ctr_memToReg_l);

        jLabel1.setText("CONTROLE - Jump");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(jLabel1);

        ctr_jump_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ctr_jump_l.setText("0");
        ctr_jump_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(ctr_jump_l);

        jLabel6.setText("CONTROLE - Deslocamento");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(jLabel6);

        ctr_shiftLogic_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ctr_shiftLogic_l.setText("0");
        ctr_shiftLogic_l.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        datapath_values.add(ctr_shiftLogic_l);

        datapath_scrl.setViewportView(datapath_values);

        text_area.add(datapath_scrl, java.awt.BorderLayout.LINE_END);

        memoryscrl.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        memoryscrl.setPreferredSize(new java.awt.Dimension(200, 0));

        mempanal.setEnabled(false);
        mempanal.setFocusable(false);
        mempanal.setMinimumSize(new java.awt.Dimension(300, 0));
        mempanal.setPreferredSize(new java.awt.Dimension(300, 20));
        mempanal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mempanalMouseClicked(evt);
            }
        });
        memoryscrl.setViewportView(mempanal);

        text_area.add(memoryscrl, java.awt.BorderLayout.LINE_START);

        counter_l.setText("Passos: 0");
        jPanel1.add(counter_l);

        jButton1.setText("Executar");
        jButton1.addActionListener(e -> {
            compilerActionPerformed(e);
            runrActionPerformed(e);
        });
        jPanel1.add(jButton1);

        jButton2.setText("Proximo Passo");
        jButton2.addActionListener(e -> {
            if(compi != 1){
                compilerActionPerformed(e);
                compi = 1;
            }
            nextrActionPerformed(e);
        });
        jPanel1.add(jButton2);

        text_area.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(text_area, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void writeFile(String fileName) throws IOException {
        BufferedWriter fileOut = new BufferedWriter(new FileWriter(fileName));
        this.jTextArea1.write(fileOut);
    }

    private void jTextArea1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1MouseExited

    private void mempanalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mempanalMouseClicked
        this.jTextArea1.setEnabled(false);

    }//GEN-LAST:event_mempanalMouseClicked

    private void datapath_scrlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datapath_scrlMouseClicked
        this.jTextArea1.setEnabled(false);

    }//GEN-LAST:event_datapath_scrlMouseClicked

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        this.jTextArea1.setEnabled(true);

    }//GEN-LAST:event_jTextArea1MouseClicked

    private void registersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registersMousePressed
        this.jTextArea1.setEnabled(false);

    }//GEN-LAST:event_registersMousePressed

    private void jTextArea1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1FocusLost

    private void runrActionPerformed(java.awt.event.ActionEvent evt) {
        while ((k < im.getI()) && k >= 0) {

            counter++;
            im.CreateMachineString(im.getInstructionLine(Units.PC.getCurrent()));
            im.CreateSubDataPath();

            control.setInput(im.getOpcode(), im.getFunc());

            counter_l.setText("Passos: " + counter + "");
            pc_output_l.setText(parseBtoD(pc.getPC().getBits()) + "");
            op_code_l.setText(parseBtoD(im.getOpcode().getBits()) + "");
            rs_l.setText(parseBtoD(im.getRs().getBits()) + "");
            rt_l.setText(parseBtoD(im.getRt().getBits()) + "");
            rd_l.setText(parseBtoD(im.getRd().getBits()) + "");
            funct_l.setText(parseBtoD(im.getFunc().getBits()) + "");
            shamt_l.setText(parseBtoD(im.getShamt().getBits()) + "");
            ctr_aluOp_l.setText(control.getALUop());
            ctr_branch_l.setText(control.getBranch());
            ctr_jump_l.setText(control.getJump());
            ctr_memRead_l.setText(control.getMemRead());
            ctr_memToReg_l.setText(control.getMemToReg());
            ctr_memWrite_l.setText(control.getMemWrite());
            ctr_regDest_l.setText(control.getRegDst());
            ctr_regWrite_l.setText(control.getRegWrite());
            ctr_shiftLogic_l.setText(control.getShift());

            mux3.setControl(control.getRegDst());
            mux3.setInput1(im.getRt());
            mux3.setInput2(im.getRd());

            rf.setControl(control.getRegWrite());
            rf.SetRegisterFile(im.getRs(), im.getRt(), mux3.getOutput());
            se.setInput(im.getThe16bit_address());
            signextend_input_l.setText(parseBtoD(im.getThe16bit_address().getBits()) + "");

            mux8.setControl(control.getShift());
            mux8.setInput2(im.getShamt());
            mux8.setInput1(rf.getRead2());
            read_data1_l.setText(parseBtoD(rf.getRead1().getBits()) + "");
            read_data2_l.setText(parseBtoD(rf.getRead2().getBits()) + "");

            mux4.setControl(control.getALUSrc());
            mux4.setInput1(mux8.getOutput());
            mux4.setInput2(se.getOutput());

            alucont.AluControl_ctrl(im.getFunc(), control.getALUop());

            alu.setInp1(rf.getRead1());
            alu.setInp2(mux4.getOutput());
            alu.setSig(alucont.getSignal(), Parse.BtoS(im.getOpcode().getBits()));
            alu_input1_l.setText(parseBtoD(rf.getRead1().getBits()) + "");
            alu_input2_l.setText(parseBtoD(mux4.getOutput().getBits()) + "");
            alu_control_l.setText(alucont.getSignal());

            dm.setSP(Parse.parseBtoD((rf.getReg(28).getBits())));
            int x = Parse.parseBtoD(alu.getOutput().getBits());
            alu_output_l.setText(parseBtoD(alu.getOutput().getBits()) + "");
            mem_address_l.setText(parseBtoD(alu.getOutput().getBits()) + "");
            mem_write_data_l.setText(parseBtoD(rf.getRead2().getBits()) + "");
            dm.setAddress(x);
            dm.setRead(control.getMemRead());
            dm.setWrite(control.getMemWrite());
            dm.store(rf.getRead2().getBits());
            if (!"00".equals(control.getMemWrite()) && !"0".equals(control.getMemWrite())) {
                this.ADDMEMORYLABEL(dm.getAddress(), dm.getLocation());
            }

            mux5.setControl(control.getMemToReg());
            mux5.setInput1(alu.getOutput());
            mux5.setInput2(dm.load());

            //rf.setReg(mux5.getOutput().getBits());

            adder1.setInput1(pc.getPC());
            adder1.setInput2(d);
            adder1.add();
            pc_adder_output_l.setText(parseBtoD(adder1.getOutput().getBits()) + "");
            DataPath w = new DataPath(32);
            //  w.setBits(parseDtoB((Parse.parseBtoD_unsigned(se.getOutput().getBits())-1),32));//2l -1 34an 2l 16 bit bytb3to fl branch zyada wa7ed
            adder2.setInput1(adder1.getOutput());
            sl2.setInput(se.getOutput());
            adder2.setInput2(sl2.getOutput());
            adder2.add();

            String s;
            if (("1".equals(control.getBranch())) && ("1".equals(alu.getZeroFlag() + "")))
                s = "1";
            else
                s = "0";
            and_gate_l.setText(s);
            mux1.setControl(s);
            mux1.setInput1(adder1.getOutput());
            mux1.setInput2(adder2.getOutput());

            for (int i = 4; i < 30; i++)
                d2.setbyte(i, im.getThe26bit_address().getbyte(i - 4));
            d2.setbyte(30, 0);
            d2.setbyte(31, 0);
            for (int i = 0; i < 4; i++)
                d2.setbyte(i, adder1.getOutput().getbyte(i));

            mux2.setControl(control.getJump());
            mux2.setInput1(mux1.getOutput());
            mux2.setInput2(d2);

            mux6.setControl(control.getPCSrc());
            mux6.setInput1(mux2.getOutput());
            mux6.setInput2(rf.getReg(31));

            mux7.setControl(control.getJumpReg());
            mux7.setInput1(mux5.getOutput());
            mux7.setInput2(adder1.getOutput());

            signextend_output_l.setText(parseBtoD(se.getOutput().getBits()) + "");
            rf.setReg(mux7.getOutput().getBits());
            pc.setPC(mux6.getOutput().getBits());
            dm.setSP(Parse.parseBtoD(rf.getReg(29).getBits()));
            rf.resetzero();
            this.GET_REGISTERVALUE();

            k = (parseBtoD(pc.getPC().getBits()) - nomono) / 4;
            System.out.println(k);
        }
    }

    private void nextrActionPerformed(java.awt.event.ActionEvent evt) {
        if ((k < im.getI()) && k >= 0) {
            counter++;
            im.CreateMachineString(im.getInstructionLine(Units.PC.getCurrent()));
            im.CreateSubDataPath();

            control.setInput(im.getOpcode(), im.getFunc());

            counter_l.setText("Passos: " + counter + "");
            pc_output_l.setText(parseBtoD(pc.getPC().getBits()) + "");
            op_code_l.setText(parseBtoD(im.getOpcode().getBits()) + "");
            rs_l.setText(parseBtoD(im.getRs().getBits()) + "");
            rt_l.setText(parseBtoD(im.getRt().getBits()) + "");
            rd_l.setText(parseBtoD(im.getRd().getBits()) + "");
            funct_l.setText(parseBtoD(im.getFunc().getBits()) + "");
            shamt_l.setText(parseBtoD(im.getShamt().getBits()) + "");
            ctr_aluOp_l.setText(control.getALUop());
            ctr_branch_l.setText(control.getBranch());
            ctr_jump_l.setText(control.getJump());
            ctr_memRead_l.setText(control.getMemRead());
            ctr_memToReg_l.setText(control.getMemToReg());
            ctr_memWrite_l.setText(control.getMemWrite());
            ctr_regDest_l.setText(control.getRegDst());
            ctr_regWrite_l.setText(control.getRegWrite());
            ctr_shiftLogic_l.setText(control.getShift());

            mux3.setControl(control.getRegDst());
            mux3.setInput1(im.getRt());
            mux3.setInput2(im.getRd());

            rf.setControl(control.getRegWrite());
            rf.SetRegisterFile(im.getRs(), im.getRt(), mux3.getOutput());
            se.setInput(im.getThe16bit_address());
            signextend_input_l.setText(parseBtoD(im.getThe16bit_address().getBits()) + "");

            mux8.setControl(control.getShift());
            mux8.setInput2(im.getShamt());
            mux8.setInput1(rf.getRead2());
            read_data1_l.setText(parseBtoD(rf.getRead1().getBits()) + "");
            read_data2_l.setText(parseBtoD(rf.getRead2().getBits()) + "");

            mux4.setControl(control.getALUSrc());
            mux4.setInput1(mux8.getOutput());
            mux4.setInput2(se.getOutput());

            alucont.AluControl_ctrl(im.getFunc(), control.getALUop());

            alu.setInp1(rf.getRead1());
            alu.setInp2(mux4.getOutput());
            alu.setSig(alucont.getSignal(), Parse.BtoS(im.getOpcode().getBits()));
            alu_input1_l.setText(parseBtoD(rf.getRead1().getBits()) + "");
            alu_input2_l.setText(parseBtoD(mux4.getOutput().getBits()) + "");
            alu_control_l.setText(alucont.getSignal());

            dm.setSP(Parse.parseBtoD((rf.getReg(28).getBits())));
            int x = Parse.parseBtoD(alu.getOutput().getBits());
            alu_output_l.setText(parseBtoD(alu.getOutput().getBits()) + "");
            mem_address_l.setText(parseBtoD(alu.getOutput().getBits()) + "");
            mem_write_data_l.setText(parseBtoD(rf.getRead2().getBits()) + "");
            dm.setAddress(x);
            dm.setRead(control.getMemRead());
            dm.setWrite(control.getMemWrite());
            dm.store(rf.getRead2().getBits());
            if (!"00".equals(control.getMemWrite()) && !"0".equals(control.getMemWrite())) {
                this.ADDMEMORYLABEL(dm.getAddress(), dm.getLocation());
            }

            mux5.setControl(control.getMemToReg());
            mux5.setInput1(alu.getOutput());
            mux5.setInput2(dm.load());

            //rf.setReg(mux5.getOutput().getBits());

            adder1.setInput1(pc.getPC());
            adder1.setInput2(d);
            adder1.add();
            pc_adder_output_l.setText(parseBtoD(adder1.getOutput().getBits()) + "");
            DataPath w = new DataPath(32);

            adder2.setInput1(adder1.getOutput());
            sl2.setInput(se.getOutput());
            adder2.setInput2(sl2.getOutput());
            adder2.add();

            String s;
            if (("1".equals(control.getBranch())) && ("1".equals(alu.getZeroFlag() + "")))
                s = "1";
            else
                s = "0";
            and_gate_l.setText(s);
            mux1.setControl(s);
            mux1.setInput1(adder1.getOutput());
            mux1.setInput2(adder2.getOutput());

            for (int i = 4; i < 30; i++)
                d2.setbyte(i, im.getThe26bit_address().getbyte(i - 4));
            d2.setbyte(30, 0);
            d2.setbyte(31, 0);
            for (int i = 0; i < 4; i++)
                d2.setbyte(i, adder1.getOutput().getbyte(i));

            mux2.setControl(control.getJump());
            mux2.setInput1(mux1.getOutput());
            mux2.setInput2(d2);

            mux6.setControl(control.getPCSrc());
            mux6.setInput1(mux2.getOutput());

            mux6.setInput2(rf.getReg(31));


            mux7.setControl(control.getJumpReg());
            mux7.setInput1(mux5.getOutput());
            mux7.setInput2(adder1.getOutput());

            signextend_output_l.setText(parseBtoD(se.getOutput().getBits()) + "");
            rf.setReg(mux7.getOutput().getBits());
            pc.setPC(mux6.getOutput().getBits());
            dm.setSP(Parse.parseBtoD(rf.getReg(29).getBits()));
            rf.resetzero();
            this.GET_REGISTERVALUE();

            k = (Parse.parseBtoD(pc.getPC().getBits()) - nomono) / 4;
            System.out.println(k);
        }
    }

    private void compilerActionPerformed(java.awt.event.ActionEvent evt) {
        Scanner sc = new Scanner(System.in);

        nomono = 4;
        Units.Instruction.setOffset(nomono);

        pc = new PC(nomono);
        adder1 = new ADDER();
        adder2 = new ADDER();
        alu = new ALU();
        sl1 = new SL2();
        sl2 = new SL2();
        sl3 = new SL2();
        se = new SignExtend();
        control = new Contoller();
        aluControl = new AluControl();
        mux1 = new MUX(32);
        mux2 = new MUX(32);
        mux3 = new MUX(5);
        mux4 = new MUX(32);
        mux5 = new MUX(32);
        mux6 = new MUX(32);
        mux7 = new MUX(32);
        mux8 = new MUX(32);
        mux9 = new MUX(32);
        alucont = new AluControl();
        im = new InstructionMemory();
        rf = new RegisterFile();
        counter = 0;

        try {
            this.writeFile("New Text Document.txt");
        } catch (IOException ex) {
            Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
        }

        n = Parse.parseBtoD(pc.getPC().getBits());
        im.setinstruction("New Text Document.txt", n);
        d2 = new DataPath(32);
        d = new DataPath(32);
        d.setBits(parseDtoB(4, 32));

        k = (Parse.parseBtoD(pc.getPC().getBits()) - nomono) / 4;//for testing
        System.out.println(k);//for testing
    }

    private void compilerMouseClicked(java.awt.event.MouseEvent evt) {

    }

    public void ADDMEMORYLABEL(int address, int locations) {
        boolean x = false;
        for (int i = 0; i < Labels.size(); i++) {
            if (Labels.get(i).address == address) {
                Labels.get(i).j.setText("memory:" + address + "=" + locations);
                x = true;
            }
        }
        if (x == false) {
            mem jx = new mem(new JLabel(address + ":" + locations), address);
            jx.j.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(), BorderFactory.createLineBorder(Color.BLACK)));
            Labels.add(jx);
            mempanal.add(jx.getJ());
        }
        repaint();
    }

    private void GET_REGISTERVALUE() {
        $ats.setText((Parse.parseBtoD((rf.getReg(1)).getBits())) + "");
        $v0s.setText((Parse.parseBtoD((rf.getReg(2)).getBits())) + "");
        $v1s.setText((Parse.parseBtoD((rf.getReg(3)).getBits())) + "");
        $a0s.setText((Parse.parseBtoD((rf.getReg(4)).getBits())) + "");
        $a1s.setText((Parse.parseBtoD((rf.getReg(5)).getBits())) + "");
        $a2s.setText((Parse.parseBtoD((rf.getReg(6)).getBits())) + "");
        $a3s.setText((Parse.parseBtoD((rf.getReg(7)).getBits())) + "");
        $t0s.setText((Parse.parseBtoD((rf.getReg(8)).getBits())) + "");
        $t1s.setText((Parse.parseBtoD((rf.getReg(9)).getBits())) + "");
        $t2s.setText((Parse.parseBtoD((rf.getReg(10)).getBits())) + "");
        $t3s.setText((Parse.parseBtoD((rf.getReg(11)).getBits())) + "");
        $t4s.setText((Parse.parseBtoD((rf.getReg(12)).getBits())) + "");
        $t5s.setText((Parse.parseBtoD((rf.getReg(13)).getBits())) + "");
        $t6s.setText((Parse.parseBtoD((rf.getReg(14)).getBits())) + "");
        $t7s.setText((Parse.parseBtoD((rf.getReg(15)).getBits())) + "");
        $s0s.setText((Parse.parseBtoD((rf.getReg(16)).getBits())) + "");
        $s1s.setText((Parse.parseBtoD((rf.getReg(17)).getBits())) + "");
        $s2s.setText((Parse.parseBtoD((rf.getReg(18)).getBits())) + "");
        $s3s.setText((Parse.parseBtoD((rf.getReg(19)).getBits())) + "");
        $s4s.setText((Parse.parseBtoD((rf.getReg(20)).getBits())) + "");
        $s5s.setText((Parse.parseBtoD((rf.getReg(21)).getBits())) + "");
        $s6s.setText((Parse.parseBtoD((rf.getReg(22)).getBits())) + "");
        $s7s.setText((Parse.parseBtoD((rf.getReg(23)).getBits())) + "");
        $t8s.setText((Parse.parseBtoD((rf.getReg(24)).getBits())) + "");
        $t9s.setText((Parse.parseBtoD((rf.getReg(25)).getBits())) + "");
        $k0s.setText((Parse.parseBtoD((rf.getReg(26)).getBits())) + "");
        $k1s.setText((Parse.parseBtoD((rf.getReg(27)).getBits())) + "");
        $gps.setText((Parse.parseBtoD((rf.getReg(28)).getBits())) + "");
        $sps.setText((Parse.parseBtoD((rf.getReg(29)).getBits())) + "");
        $fps.setText((Parse.parseBtoD((rf.getReg(30)).getBits())) + "");
        $ras.setText((Parse.parseBtoD((rf.getReg(31)).getBits())) + "");
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
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel alu_control_l;
    private javax.swing.JLabel alu_input1_l;
    private javax.swing.JLabel alu_input2_l;
    private javax.swing.JLabel alu_output_l;
    private javax.swing.JLabel and_gate_l;
    private javax.swing.JLabel bit16;
    private javax.swing.JLabel bit32_rd2shamt_mux;
    private javax.swing.JLabel bit32_sl2;
    private javax.swing.JLabel bit33;
    private javax.swing.JLabel branch_mux;
    private javax.swing.JLabel counter_l;
    private javax.swing.JLabel ctr_aluOp_l;
    private javax.swing.JLabel ctr_alusrc;
    private javax.swing.JLabel ctr_branch1;
    private javax.swing.JLabel ctr_branch_l;
    private javax.swing.JLabel ctr_jump;
    private javax.swing.JLabel ctr_jump_l;
    private javax.swing.JLabel ctr_memRead_l;
    private javax.swing.JLabel ctr_memToReg_l;
    private javax.swing.JLabel ctr_memWrite_l;
    private javax.swing.JLabel ctr_memread;
    private javax.swing.JLabel ctr_memreg1;
    private javax.swing.JLabel ctr_memwrite1;
    private javax.swing.JLabel ctr_regDest_l;
    private javax.swing.JLabel ctr_regWrite_l;
    private javax.swing.JLabel ctr_regwrite1;
    private javax.swing.JLabel ctr_shiftLogic_l;
    private javax.swing.JLabel ctr_shiftlogic1;
    private javax.swing.JScrollPane datapath_scrl;
    private javax.swing.JPanel datapath_values;
    private javax.swing.JLabel func;
    private javax.swing.JLabel funct_l;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jr_mux;
    private javax.swing.JLabel jumb_add;
    private javax.swing.JLabel jumb_mux1;
    private javax.swing.JLabel mem_address_l;
    private javax.swing.JLabel mem_write_data_l;
    private javax.swing.JScrollPane memoryscrl;
    private javax.swing.JPanel mempanal;
    private javax.swing.JLabel op_code_l;
    private javax.swing.JLabel pc_adder_output_l;
    private javax.swing.JLabel pc_output_l;
    private javax.swing.JLabel pcoutput;
    private javax.swing.JLabel pcp5;
    private javax.swing.JLabel rd_l;
    private javax.swing.JLabel read_data1;
    private javax.swing.JLabel read_data1_l;
    private javax.swing.JLabel read_data2_l;
    private javax.swing.JLabel regdstmux1;
    private javax.swing.JPanel registers;
    private javax.swing.JLabel rf_rf;
    private javax.swing.JLabel rs;
    private javax.swing.JLabel rs_l;
    private javax.swing.JLabel rt1;
    private javax.swing.JLabel rt_l;
    private javax.swing.JLabel shamt;
    private javax.swing.JLabel shamt_l;
    private javax.swing.JLabel signextend_input_l;
    private javax.swing.JLabel signextend_output_l;
    private javax.swing.JPanel text_area;
    private javax.swing.JLabel zerofalg;
    // End of variables declaration//GEN-END:variables
}
