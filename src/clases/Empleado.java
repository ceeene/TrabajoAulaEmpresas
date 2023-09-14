/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.documento;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.apellido);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.empresa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.documento != other.documento) {
            return false;
        }
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (this.empresa != other.empresa) {
            return false;
        }
        return true;
    }

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
