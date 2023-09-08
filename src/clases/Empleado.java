/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Celia
 */
public class Empleado {
    int documento;
    String nombre;
    String apellido;
    double sueldo;
    EmpresaEnum empresa;

    public Empleado(int documento, String nombre, String apellido, double sueldo, EmpresaEnum empresa) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public EmpresaEnum getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaEnum empresa) {
        this.empresa = empresa;
    }
    
}
