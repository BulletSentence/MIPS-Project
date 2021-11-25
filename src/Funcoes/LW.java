package Funcoes;

import Unidades.Instruction;
import Unidades.*;


public class LW extends Instruction implements Parse{

    public LW() {
        super("LW", 1, 12);
    }

    
    @Override
    public String SetDataPath(String[] s) {
        opcode = "100011";
        rs = Parse.BtoS(Parse.parseDtoB(findReg(s[2]),5));
        rt =  Parse.BtoS(Parse.parseDtoB(findReg(s[1]),5));

        the16bit_address= Parse.BtoS(Parse.parseDtoB(Integer.parseInt(s[3]),16));
        return opcode +rs+rt+the16bit_address;
    }
}
