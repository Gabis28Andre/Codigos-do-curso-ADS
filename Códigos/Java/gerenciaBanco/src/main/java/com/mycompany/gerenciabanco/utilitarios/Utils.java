/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco.utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author GABRIEL
 */
public class Utils {
    static NumberFormat formatandoNumeros = new DecimalFormat("R$ #,##0.00");
    static SimpleDateFormat formatandoData = new SimpleDateFormat("dd/MM/yyyy");

    public static String dateToString(String data) {
        return Utils.formatandoData.format(data);
    }

    public static String doubleToString(Double valor) {
        return Utils.formatandoNumeros.format(valor);
    }

 
}
