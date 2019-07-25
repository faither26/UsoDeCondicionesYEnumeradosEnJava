package main;

import static enumerados.Constates.*;
import static enumerados.Valores.DOALR;

import javax.swing.*;


public class Main {
    public static void main(String[] args)
    {

        String valor = JOptionPane.showInputDialog(null, MENSAJE_INGRESA_VALOR.getMensaje());
        int val = Integer.parseInt(valor);

        if (val >= DOALR.getValor())
        {
            JOptionPane.showMessageDialog(null,MENSAJE_DOLAR_ALTO.getMensaje());
        }else
        {
            JOptionPane.showMessageDialog(null,MENSAJE_DOLAR_BAJO.getMensaje());
        }

        JOptionPane.showMessageDialog(null, MENSAJE_CUADRO.getMensaje(), MENSAJE_TITULO.getMensaje(),
                JOptionPane.INFORMATION_MESSAGE);


    }
}
