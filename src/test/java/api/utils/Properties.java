package api.utils;

import java.util.Random;

public class Properties {

    private static Random rand = new Random();
    public static String host = "https://todo.ly/";
    public static String user = "priset@gmail.com";
    public static String userRand = "priset"+ Integer.toString(rand.nextInt(10000)) +"@gmail.com"; //Usuario para la fila B
    public static String pwd = "priset1234";

}
