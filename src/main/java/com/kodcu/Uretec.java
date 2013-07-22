package com.kodcu;

import javax.enterprise.inject.Produces;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 22.07.2013
 * Time: 15:05
 * To change this template use File | Settings | File Templates.
 */
public class Uretec {

    @Hiz
    @Produces
    public Integer hizSoyle() {
        return ThreadLocalRandom.current().nextInt(20, 160);
    }

    // veya

    // @Hiz
    // @Produces
    // private Integer hiz = ThreadLocalRandom.current().nextInt(20, 160);

}
