package com.kodcu;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 3/22/13
 * Time: 5:31 PM
 * To change this template use File | Settings | File Templates.
 */
@Default // olmasada olur
public class Araba implements Arac{

    private int hiz;

    @Override
    public String calis() {
        return "Araba "+hizSoyle()+" km. hızında çalışıyor..";
    }

    @PostConstruct
    private void init(){
        hiz = ThreadLocalRandom.current().nextInt(20, 240);
    }

    @Override
    public int hizSoyle(){
        return this.hiz;
    }

}
