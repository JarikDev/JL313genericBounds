package com;

import javax.swing.*;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Cell<Job> cell=new Cell<>();
        cell.setT(new Job());
        cell.doJob();

        Cell<ChildJob> cell2=new Cell<>();
        cell2.setT(new ChildJob());
        cell2.doJob();
    }
}
class Job implements Serializable{
    void doIt(){
        System.out.println(" do it");
    }
}
class ChildJob extends Job{}
class Cell<T extends Job & Serializable>{
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {

        this.t = t;
    }
    public void doJob( ){
        t.doIt();
    }
}












