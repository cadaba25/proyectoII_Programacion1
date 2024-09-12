/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoredsocial;

import Calendar.DateCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.Calendar;
import java.util.Timer;

/**
 *
 
@author OMy*/
    class fechaa {
      private static DateCalendar fechaa;

      
      public static String getFecha() {

        Calendar calendar = Calendar.getInstance();

        String[] days = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        String[] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        return days[dayOfWeek - 1] + ", " + dayOfMonth + " " + months[month] + " " + year;
        }
    }
    
  

