package com.MJJP.x00018619;

public class Main {
    public static void main(String[] args) {
     public   laptop compu= new laptop("mac","apple");
        laptop compu2= new laptop("mac", "OS X");
     public   pupusas pupa1= new pupusas("la carreta","chicharron");
       public pupusas pupa2= new pupusas("los cruz","queso");

        compu.datos1();
        System.out.println("");
        compu2.datos2();
        System.out.println("");
        pupa1.Orden1();
        System.out.println("");
        pupa2.Orden2();
        // metodo de compu
        compu.encender();
        compu.password("la mayi");
        compu.apagar();
        compu2.encender();
        compu2.password("coronavirus");
        compu2.apagar();
        pupa1.comerla();
        pupa1.desecharla();
        pupa2.comerla();
        pupa2.desecharla();


    }

}
