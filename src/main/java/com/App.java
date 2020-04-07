package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static List<Integer> returnArray(){
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < 10; i++){
            list.add(100);
            list.add(200);
            list.add(500);
        }
        list.add(1000);
        return list;
    }
}
