package com.company;

public class Lampe {

    public String status;
    public String lampe;
    public boolean erLampenTændt;


    public Lampe(boolean erLampenTændt, String lampe){
        this.lampe = lampe;
        this.erLampenTændt = erLampenTændt;

    }

    public void knap(){
        erLampenTændt = !erLampenTændt;
    }


    public boolean isErLampenTændt() {
        return erLampenTændt;
    }

    @Override
    public String toString(){
        if (erLampenTændt){
            status = "tændt";
        }else {
            status = "slukket";
        }
        return lampe + " er " + status;
    }
}
