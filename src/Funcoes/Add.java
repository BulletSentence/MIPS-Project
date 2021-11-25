package Funcoes;

import Unidades.Instruction;
import Unidades.*;
import java.util.Arrays;

public class Add extends Instruction implements Parse{

    public Add() {
        super("ADD", 0, 1);
    }
    
    @Override
    public String SetDataPath(String[] s) {
        opcode = "000000";
        int asd=findReg((s[2]));

        /* Remove as virgulas, os colchetes e os espa�os */

    String jo = Arrays.toString(Parse.parseDtoB(asd,5));
        String replace = jo.replace(",", "");
        String replace1 = replace.replace("[", "");
        String replace2 = replace1.replace("]", "");
         String trim = replace2.replace(" ", "");
         rs=trim;

     jo = Arrays.toString(Parse.parseDtoB(findReg(s[3]),5));

     replace = jo.replace(",", "");
         replace1 = replace.replace("[", "");
         replace2 = replace1.replace("]", "");
          trim = replace2.replace(" ", "");
         rt=trim;

       jo = Arrays.toString(Parse.parseDtoB(findReg(s[1]),5));

        replace = jo.replace(",", "");
         replace1 = replace.replace("[", "");
         replace2 = replace1.replace("]", "");
          trim = replace2.replace(" ", "");
         rd=trim;

        shamt = "00000";
        func = "100000";

        return opcode +rs+rt+rd+shamt+func;
    }
}
