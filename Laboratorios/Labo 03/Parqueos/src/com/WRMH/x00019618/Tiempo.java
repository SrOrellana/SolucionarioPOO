package com.WRMH.x00019618;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tiempo{
    private String horaEntrada, horaSalida;

    public Tiempo(String horaEntrada){
        this.horaEntrada = horaEntrada;
        this.horaSalida = "";
    }

    public String getHoraEntrada(){ return horaEntrada; }

    public void setHoraSalida(String horaSalida){
        this.horaSalida = horaSalida;
    }

    public double diferenciaTiempo(){
        // El formato en el que se almacenan las cadenas de las horas va a ser militar, 16:00:00
        // Java proveee de una clase SimpleDateFormat que permite declarar fechas y horas en un formato estandar
        // HH:mm:ss es una expresion que le dice al lenguaje que quiero horas en formato militar, con minutos y segundos

        Date entrada = null, salida = null;


        // Bloque try catch se explicara en el tema de excepciones
        try{
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

            // Declaracion de variables de tipo fecha para operar las horas
            entrada = format.parse(horaEntrada);
            salida = format.parse(horaSalida);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error");
        }

        // Para calcular la diferencia, la resta devuelve milisegundos (asi opera getTime, en ms) que deben convertise a horas
        return (salida.getTime() - entrada.getTime()) / (60 * 60 * 1000) % 24;
    }

}