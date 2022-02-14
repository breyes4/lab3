package edu.wctc;

public class Main {

    public static void main(String[] args) {

        Triplet<String> t = new Triplet<String>
                ("Bryan", "Alexis", "Reyes");

        System.out.println (t.getFname());
        System.out.println (t.getMname());
        System.out.println (t.getLname());
        
    }
}
