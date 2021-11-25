package Unidades;

import static Unidades.Parse.*;

public class SL2 {
    private DataPath input, output;

    public SL2() {
        this.input = new DataPath(32);
        this.output = new DataPath(32);
    }

    public void setInput(DataPath input) {
        this.input = input;
    }

    public DataPath getOutput() {
        SL2();
        return output;
    }

    public void SL2() {
        output.setBits(parseDtoB(4 * parseBtoD(input.getBits()), 32));
    }
}
