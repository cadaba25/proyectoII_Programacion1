/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calendar;

import java.util.Calendar;

/**
 *
 * @author David Barreda
 */
public class DateCalendar {
   
    
    public static void main(String[] args) {
        Calendar DateCalendar = Calendar.getInstance();
        
        int fechaa = DateCalendar.getWeekYear();
        System.out.println(fechaa);
        
    }
    
}
