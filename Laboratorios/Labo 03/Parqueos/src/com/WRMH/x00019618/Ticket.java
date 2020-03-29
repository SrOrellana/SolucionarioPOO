package com.WRMH.x00019618;

import javax.swing.*;
import java.util.ArrayList;

public class Ticket{
    private Automovil ingreso;
    private Tiempo estadia;

    public Ticket(String placaAuto, String horaIngreso){
        this.ingreso = new Automovil(placaAuto);
        this.estadia = new Tiempo(horaIngreso);
    }

    public double despacharAuto(String horaSalida){
        estadia.setHoraSalida(horaSalida);

        double t = estadia.diferenciaTiempo();

        if(t < 0.5){
            JOptionPane.showMessageDialog(null, "Gratis");
            return 0;
        }
        else if(t >= 0.5 && t < 1){
            JOptionPane.showMessageDialog(null, "Cantidad a pagar: 0.5");
            cobrarUsuario(0.5);
            return 0.5;
        }
        else if(t >= 1 && t < 2){
            JOptionPane.showMessageDialog(null, "Cantidad a pagar: 1.00");
            cobrarUsuario(1);
            return 1;
        }
        else{
            JOptionPane.showMessageDialog(null, "Cantidad a pagar: 5.00");
            cobrarUsuario(5);
            return 5;
        }
    }

    private void cobrarUsuario(double cantidad){
        ArrayList<Moneda> monedas = new ArrayList<>();

        do{
            double d = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese una moneda: "));
            monedas.add(new Moneda(d));

        } while(sumarMonedas(monedas) < cantidad);

        if(sumarMonedas(monedas) == cantidad)
            JOptionPane.showMessageDialog(null, "Vuelto: $0.00");
        else
            JOptionPane.showMessageDialog(null, "Vuelto: $" + (sumarMonedas(monedas) - cantidad));
    }

    private double sumarMonedas(ArrayList<Moneda> monedas){

        // Para evitar errores
        if(monedas.isEmpty())
            return 0;

        double cant = 0;

        for(Moneda m : monedas)
            cant += m.getDenominacion();

        return cant;
    }

    public String getPlaca(){
        return ingreso.getPlaca();
    }

    public String toString(){
        return "Ticket { Automovil: " + ingreso.getPlaca() + ", Hora de entrada: " + estadia.getHoraEntrada() + "}";
    }

}