package com.kodcu;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created with IntelliJ IDEA. User: usta Date: 3/22/13 Time: 5:33 PM To change
 * this template use File | Settings | File Templates.
 */
public class Galeri {

    @Inject
    @New(Araba.class) // new Araba(); gibi
    private Arac arac;

    @Inject
    @New(value = Otobus.class) // new Otobus(); gibi
    private Arac tasit;

    /*
    @Inject
    @New // new Arac(); gibi. Hata!!
    private Arac motorlu;
     */

    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer konteyner = weld.initialize();
        Galeri galeri = konteyner.instance().select(Galeri.class).get();

        String aracMesaj = galeri.arac.calis();
        System.out.println("> " + aracMesaj);

        String tasitMesaj = galeri.tasit.calis();
        System.out.println("> " + tasitMesaj);


    }
}
