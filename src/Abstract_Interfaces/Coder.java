package Abstract_Interfaces;

import Java2.Computer;

/**
 * Created by Fer on 5/19/17.
 */
public interface Coder {
    //Actions that a Coder requires
    String code(Computer cp);
    int count();
    void fixBugs();

}
