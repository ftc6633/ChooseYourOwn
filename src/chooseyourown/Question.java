/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chooseyourown;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Question  {
    // list of all Question objects searchable by name
    static private HashMap<String, Question> allQuestionsByName = new HashMap<>() ;

    private String mName = "";
    private String mDescription = "";
    private ArrayList<Option> mOptions  = new ArrayList<>() ;
            
    public Question(String name, String description) {
        mName = name ;
        mDescription = description ;
        allQuestionsByName.put(name, this) ;
    }
    
    public void addOption(String description, String what, String next) {
        mOptions.add(new Option(description, what, next));
    }
    
    public Question getNextQuestion() {
        System.out.println(mDescription);
        int nOption = 0 ;
        for(Option o : mOptions) {
            nOption++;
            System.out.println(nOption + ": " + o.mDescription);
        }
        
        System.out.println("Enter a number from 1 to " + nOption + ":");
        Scanner scan = new Scanner(System.in);
        int userChose = scan.nextInt();
        
        Option opt = mOptions.get(userChose-1);        
        System.out.println("---");
        System.out.println(opt.mWhatHappens);
        System.out.println("---");
        
        return allQuestionsByName.get(opt.mNext);
    }
    
}
