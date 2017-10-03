package com.google.ar.core.examples.java.helloar;

/**
 * Created by dcaetano on 9/28/17.
 */

public class CalcDistance {

    public static final double distance(float x1,float y1,float z1,float x2, float y2, float z2){

        double distancia = 0;

        distancia = Math.sqrt( Math.pow( (x1 - x2),2 ) +
                Math.pow( (y1 - y2),2 ) +   Math.pow( (z1 - z2),2 ) );

        return  distancia;
    }



}
