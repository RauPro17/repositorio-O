package com.MJJP.x00018619;

public class laptop {
    private  String marca;
    private String modelo;
    private String empresa;
    public laptop(String pmarca,String empresa){
        this.marca= marca;
        this.empresa=empresa;
    }
    public laptop(String marca,String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }
    // usar setter y getters

    public void setMarca(String marca){
        this.marca= marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setEmpresa(String empresa){
        this.empresa= empresa;
    }
    public String getEmpresa(){
        return empresa;
    }

    public void datos1(){
        System.out.println("la marca de compu 1 es  "+ marca + "y empresa creadora "+ empresa);
    }
    public void datos2(){
        System.out.println("la marca de compu 2 es "+ marca + " y modelo "+ modelo);

    }

    public void encender(){
        System.out.println("la computadora esta encendiendo");
    }

    public String password(String sesion){
        System.out.println("coloque contraseña"+ sesion);
    }

    public void apagar(){
        System.out.println("la maquina se esta apagando no desconectar");
    }




}
