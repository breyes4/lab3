package edu.wctc;

public class Triplet<T> {
    private T fName;
    private T mName;
    private T lName;

    public Triplet (T fName, T mName, T lName) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    public T getFname() {
        return fName;
    }

    public void impFname(T fName) {
        this.fName = fName;
    }

    public T getMname() {
        return mName;
    }

    public void impMname(T mName) {
        this.mName = mName;
    }

    public T getLname() {
        return lName;
    }

    public void impLname(T lName) {
        this.lName = lName;
    }
}

