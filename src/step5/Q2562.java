package step5;

import java.io.*;
import Function.*;

public class Q2562 {
    public static void main(String[] args) throws IOException {
        int nMax, nIndex = 0;
        String[] sNum = new String[9];

        for (int i = 0; i < 9; i++) {
            sNum[i] = IO.bInput();
        }

        nMax = Cast.StoInt(sNum[0]);

        for (int i = 1; i < 9; i++) {
            if (nMax < Cast.StoInt(sNum[i])) {
                nMax = Cast.StoInt(sNum[i]);
                nIndex = i;
            }
        }
        
        IO.bWrite(Cast.ItoString(nMax) + "\n");
        IO.bWrite(Cast.ItoString(nIndex));
        IO.EndProg();
    }
}
