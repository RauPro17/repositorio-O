package com.MJJP.x00018619;

public class pupusas {
    private String ingrediente;
    private String restaurante;


    public pupusas(String ingrediente){
        this.ingrediente=ingrediente;
    }
    public pupusas(String restaurante){
        this.restaurante=restaurante;
    }
    // aca solo estas pasando un parametro y debes pasar dos:
    /*
    public pupusas(String ingrediente,String restaurante){
        this.ingrediente=ingrediente;
        this.restaurante=restaurante;
    }

    */

    // uso setter y getter
    public void setIngrediente(String ingrediente){
        this.ingrediente=ingrediente;
    }
    public String getIngrediente(){
        return ingrediente;
    }
    public void setRestaurante(String restaurante){
        this.restaurante= restaurante;
    }
    public String getRestaurante(){
        return restaurante;
    }

    public void Orden1(){
        System.out.println("ingrediente de pupusa1 " + ingrediente + "restaurante de procedencia de  pupusa1"+ restaurante);
    }
    public void Orden2(){

            System.out.println("ingrediente de pupusa2 " + ingrediente + "restaurante de procedencia de pupusa2"+ restaurante);
        }
        //metodos
        public void comerla(){
            System.out.println("usted esta comiendo la pupusa");
        }
        public void desecharla(){
            System.out.println("usted se dirige al baño");
        }
    }

