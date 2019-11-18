/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itta.net;

import java.util.Date;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.TimedObject;
import javax.ejb.Timer;


@Singleton
public class PerrinTimerSessionBean implements PerrinTimerSessionBeanRemote, PerrinTimerSessionBeanLocal, TimedObject {

    @Schedule(dayOfWeek = "Mon-Fri", month = "*", hour = "9-17", dayOfMonth = "*", year = "*", minute = "*", second = "*/10")
    @Override
    public void myTimer() {
        System.out.println("Timer event: " + new Date());
    }

    @Override
    public void ejbTimeout(Timer timer) {
      System.out.println("Timer out event: " + new Date());
        
    }

 
}
