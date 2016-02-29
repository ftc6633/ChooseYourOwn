/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chooseyourown;

/**
 *
 * @author rlloyd
 */
public class Option {
    public String mDescription ;
    public String mNext;
    public String mWhatHappens;
    
    public Option(String description, String whatHappens, String next) {
        mNext = next;
        mDescription = description ;
        mWhatHappens = whatHappens;
    }
}
