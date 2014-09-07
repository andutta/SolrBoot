package com.example;

import java.util.Vector;

/**
 * Created by adutta on 9/5/2014.
 */
public class TreasureHunt {

    private Integer[][] data = new Integer[6][6];

    public static void main(String[] args){
        TreasureHunt th = new TreasureHunt();
        th.setData();

        th.getNextDest(34);

    }

    private void getNextDest(Integer val){
        String strVal = String.valueOf(val);
        String row = strVal.substring(0,1);
        String col = strVal.substring(1);
        System.out.print(val + " -> (" + row + ", " + col + ")");
        if (!(this.data[Integer.valueOf(row)][Integer.valueOf(col)] == Integer.valueOf(row+col))){
            getNextDest(this.data[Integer.valueOf(row)][Integer.valueOf(col)]);
        }

    }

    private void setData(){
        data[0] = new Integer[]{0,0,0,0,0,0};
        data[1] = new Integer[]{0,34,21,32,41,25};
        data[2] = new Integer[]{0,14,42,43,14,31};
        data[3] = new Integer[]{0,54,45,52,42,23};
        data[4] = new Integer[]{0,33,15,51,31,35};
        data[5] = new Integer[]{0,21,52,33,13,23};
    }
}
