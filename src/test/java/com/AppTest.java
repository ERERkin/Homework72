package com;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void countTest(){
        List<Integer> list = App.returnArray();
        int[][] val = new int[][]{{0,100},{0,200},{0,500},{0,1000}};
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < val.length; j++){
                if(val[j][1] == list.get(i)) val[j][0]++;
            }
        }
        for(int[] i : val){
            assertTrue("мало купюр, надо пополнить",i[0] >= 5);
        }
    }
    @Test
    public void twoTimesMore(){
        List<Integer> list = App.returnArray();
        int[][] val = new int[][]{{0,100},{0,200},{0,500},{0,1000}};
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < val.length; j++){
                if(val[j][1] == list.get(i)) val[j][0]++;
            }
        }
        int min = val[0][0];
        int max = val[0][0];
        for(int[] i : val){
            min = Math.min(min, i[0]);
            max = Math.max(max, i[0]);
        }
        assertTrue("Перекос",max < 2 * min);
    }
}
