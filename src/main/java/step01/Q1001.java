package step01;

import java.io.*;
import java.util.*;
import Function.*;

public class Q1001 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(IO.input(), " ");
        int nA, nB;

        nA = Cast.StoInt(st.nextToken());
        nB = Cast.StoInt(st.nextToken());

        IO.write(Cast.ItoString(nA - nB));
        IO.endProg();

    }
}