package com.company;

public class Ventana {
    private String titulo;
    private Boton entrar;
    private Etiqueta etiquetaNombre,etiquetaPassword;
    private CampoTexto campNombre , campPassword;
    public Ventana(String titulo){
        this.titulo=titulo;
        this.entrar = new Boton("ENTRAR");
        this. etiquetaNombre = new Etiqueta("PASSWORD");
        this.etiquetaPassword= new Etiqueta("CONTRASEÑA");
        this.campNombre = new CampoTexto("");
        this.campPassword=new CampoTexto("");
    }
    public void  insertarNombre(String nombre){
        this.campNombre.setTexto(nombre);
    }
    public void insertarPassword(String texto){
        this.campPassword.setTexto(texto);
    }
    public boolean validar(){
            String nombre = campNombre.getTexto();
            String pass =campPassword.getTexto();
            return nombre.equals("pepito")&& pass.equals("1234");
    }
}
