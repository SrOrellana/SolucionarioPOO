package com.WRMH.x00019618;

import javax.swing.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Ticket> parqueo = new ArrayList<>();
        double ganancias = 0;		// Al case 3

        int op = 0;

        do{
            // Pedir la opcion con input dialog
            op = Integer.parseInt(JOptionPane.showInputDialog(null, menuPrincipal()));

            switch(op){
                case 1:
                    String placa = JOptionPane.showInputDialog(null, "No. placa: ");
                    String hora = JOptionPane.showInputDialog(null, "Hora de entrada (HH:mm:ss): ");
                    parqueo.add(new Ticket(placa, hora));
                    break;
                case 2:
                    // Variable auxiliar para guardar todos los tickets
                    String mess = "";

                    // For each para concatenar los datos de cada ticket
                    for(Ticket t : parqueo){
                        mess += t.toString() + "\n";
                    }

                    // Mostrar los tickets en un JOptionPane
                    JOptionPane.showMessageDialog(null, mess);
                    break;
                case 3:
                    String autoDespachar = JOptionPane.showInputDialog(null, "Auto a despachar: ");

                    Ticket tt = null;

                    for(Ticket busca : parqueo){
                        if(busca.getPlaca().equals(autoDespachar)){
                            tt = busca;
                            break;
                        }
                    }

                    // Vamos a cambiar tambien el metodo despachra auto de ticket, linea 73
                    ganancias = tt.despacharAuto(JOptionPane.showInputDialog(null, "Hora salida: "));
                    // Modificar case 0
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Ganancia generada: " + ganancias + "\nSaliendo . . .");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tremendo pendejo, no es una opcion valida . . .");
                    break;
            }
        } while(op != 0);
    }

    static String menuPrincipal(){
        return "1. Agregar auto\n2. Ver tickets\n3. Despachar auto\n0. Salir";
    }
}