package ru.bit;

/**
 * Author:      Nosov Dmitriy <br>
 * Date:        01.10.11, 0:09 <br>
 * Company:     SofIT labs <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class ChangeOne {
    /**
     * RCS (CVS/SVN) information
     */
    @SuppressWarnings("unused")
    public static final String RCS_ID = "$Id$";


    public static void main(String[] args) {
        Integer i = new Integer(4);
        System.out.println("i = " + Integer.toBinaryString(4));
        System.out.println("j = " + Integer.toBinaryString(i & ~(i - 1)));



    }
}
