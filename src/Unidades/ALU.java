package Unidades;

import static Unidades.Parse.*;

public class ALU {

    private DataPath inp1, inp2, temp;
    private int zeroflag;
    private DataPath addres, subres, mulres, divres, sltres, andres, orres, norres;
    private DataPath output;
    private int s, frstinput, scndinput;
    private String signal, memorysignal;

    public ALU() {

        inp1 = new DataPath(32);
        inp2 = new DataPath(32);
        temp = new DataPath(32);
        output = new DataPath(32);
        addres = new DataPath(32);
        subres = new DataPath(32);
        mulres = new DataPath(32);
        divres = new DataPath(32);
        sltres = new DataPath(32);
        andres = new DataPath(32);
        orres = new DataPath(32);
        norres = new DataPath(32);
    }

    private void Add() {
        int x = parseBtoD(inp1.getBits());
        int y = parseBtoD(inp2.getBits());
        int res = x + y;
        output.setBits(parseDtoB(res, 32));
    }

    private void Sub() {
        int x = parseBtoD(inp1.getBits());
        int y = parseBtoD(inp2.getBits());
        int res = x - y;
        subres.setBits(parseDtoB(res, 32));
        output = subres;
    }

    private void Mul() {
        int x = parseBtoD(inp1.getBits());
        int y = parseBtoD(inp2.getBits());
        int res = x * y;
        mulres.setBits(parseDtoB(res, 32));
        output = mulres;
    }

    private void Div() {
        int res = 0;
        int x = parseBtoD(inp1.getBits());
        int y = parseBtoD(inp2.getBits());
        if (y == 0) {
        } else {
            res = x / y;
        }
        divres.setBits(parseDtoB(res, 32));
        output = divres;
    }

    private void Slt() {
        int frst = parseBtoD(this.inp1.getBits());
        int scnd = parseBtoD(this.inp2.getBits());
        if (frst < scnd)
            output.setBits(parseDtoB(1, 32));
        else
            output.setBits(parseDtoB(0, 32));
    }

    private void SltI() {
        int frst = parseBtoD(this.inp1.getBits());
        int scnd = parseBtoD(this.inp2.getBits());
        if (frst < scnd)
            output.setBits(parseDtoB(1, 32));
        else
            output.setBits(parseDtoB(0, 32));
    }

    private void SltU() {
        int frst = parseBtoD_unsigned(this.inp1.getBits());
        int scnd = parseBtoD_unsigned(this.inp2.getBits());
        if (frst < scnd)
            output.setBits(parseDtoB(1, 32));
        else
            output.setBits(parseDtoB(0, 32));
    }

    private void AND() {
        int x = parseBtoD(this.inp1.getBits());
        int y = parseBtoD(this.inp2.getBits());
        int res = x & y;
        output.setBits(parseDtoB(res, 32));
    }

    private void OR() {
        int x = parseBtoD(this.inp1.getBits());
        int y = parseBtoD(this.inp2.getBits());
        int res = x | y;
        output.setBits(parseDtoB(res, 32));
    }

    private void NOR() {
        int x = parseBtoD(this.inp1.getBits());
        int y = parseBtoD(this.inp2.getBits());
        int res = ~(x | y);

        output.setBits(parseDtoB(res, 32));
    }

    private void SLL() {
        double tempx1 = (double) parseBtoD(this.inp2.getBits());
        int temp1 = (int) Math.pow(2, tempx1);
        this.output.setBits(parseDtoB((temp1 * (parseBtoD(this.inp1.getBits()))), 32));
    }

    private void SRL() {
        double tempx1 = (double) parseBtoD(this.inp2.getBits());
        int temp1 = (int) Math.pow(2, tempx1);
        this.output.setBits(parseDtoB(((parseBtoD(this.inp1.getBits())) / temp1), 32));
    }

    public void ZeroFlag() {
        zeroflag = 0;
        if ("0101".equals(this.signal)) {
            if (parseBtoD(inp1.getBits()) != parseBtoD(inp2.getBits()))
                zeroflag = 1;
        } else if ("0110".equals(this.signal)) {
            if (parseBtoD(inp1.getBits()) == parseBtoD(inp2.getBits()))
                zeroflag = 1;
        }

    }

    public void Op() {
        switch (signal) {

            case "0011": {
                SLL();
                break;
            }
            case "1010": {
                SRL();
                break;
            }
            case "0000": {
                AND();
                break;
            }
            case "0001": {
                OR();
                break;
            }
            case "0010": {
                switch (memorysignal) {
                    case "000000"://add
                    case "001000"://addi
                        Add();
                        break;
                    case "101011"://sw
                    case "100011"://lw
                        this.temp.setBits(this.inp1.getBits());
                        Add();
                        break;
                    case "101101"://h
                    case "110011":
                    case "110010":
                        this.temp.setBits(this.inp1.getBits());
                        Add();
                        break;
                    case "101100"://b
                    case "110001":
                    case "110000":
                        this.temp.setBits(this.inp1.getBits());
                        Add();
                        break;
                }
                break;
            }
            case "0110": {
                Sub();
                break;
            }
            case "0101": {
                Sub();
                break;
            }
            case "0100": {
                SltU();
                break;
            }
            case "1000": {
                SltI();
                break;
            }
            case "0111": {
                Slt();
                break;
            }
            case "1100": {
                NOR();
                break;
            }
            case "1111": {
                Mul();
                break;
            }
            case "1110": {
                Div();
                break;
            }
        }
    }


    public void setInp1(DataPath inp1) {
        this.inp1 = inp1;
    }

    public void setInp2(DataPath inp2) {
        this.inp2 = inp2;
    }

    public void setSig(String signal, String memorystring) {
        this.signal = signal;
        this.memorysignal = memorystring;
    }

    public DataPath getOutput() {
        Op();
        return output;
    }

    public int getZeroFlag() {
        ZeroFlag();
        return zeroflag;
    }

}      
