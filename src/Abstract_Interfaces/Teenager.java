package Abstract_Interfaces;

import Java2.Computer;

/**
 * Created by Fer on 5/19/17.
 */

// This Teenager decided to be a coder and a blogger at the same time, implementing 2 interfaces allows you to have all their actions at the same time on demand. And also this Teenager is a Human.
public class Teenager extends Human implements Coder, Blogger {

    // Implementation of all the methods involved with being a Coder
    @Override
    public String code(Computer cp) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void fixBugs() {

    }

    // Implementation of all the methods involved with being a Blogger

    @Override
    public void blog(Computer cp) {

    }

    @Override
    public void format() {

    }
}
