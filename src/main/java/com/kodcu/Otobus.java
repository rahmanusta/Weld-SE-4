package com.kodcu;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 05.06.2013
 * Time: 22:59
 * To change this template use File | Settings | File Templates.
 */
@Default
public class Otobus implements Arac {

    @Inject
    @Hiz
    private Integer hiz;

    public String calis() {
        return "Otobus "+ hizSoyle() +" km. hızında çalışıyor..";
    }

    public int hizSoyle(){
        return this.hiz;
    }

}
