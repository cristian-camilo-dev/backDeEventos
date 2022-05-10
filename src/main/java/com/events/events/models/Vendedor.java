package com.events.events.models;

import javax.persistence.*;

@Entity
@Table(name = "vendedor")


public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;



    @Column(name = "nombre_comercial")
    private String nombreComercial;

    @Column(name = "nombre_contacto")
    private String nombreContacto;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "cuenta_bancaria")
    private String cuentaBancaria;

    @Column(name = "nif")
    private String nif;

    @Column(name = "codigo_postal")
    private int codigoPostal;

    @Column(name = "direccion_facturacion")
    private String direccionFacturacion;

    @Column(name = "email")
    private String email;

    @Column(name = "contraseña")
    private String contraseña;

    public Vendedor() {

    }

    public Vendedor(String name, String nombreComercial, String nombreContacto, String telefono, String razonSocial, String cuentaBancaria, String nif, int codigoPostal, String direccionFacturacion, String email, String contraseña) {
        this.name = name;
        this.nombreComercial = nombreComercial;
        this.nombreContacto = nombreContacto;
        this.telefono = telefono;
        this.razonSocial = razonSocial;
        this.cuentaBancaria = cuentaBancaria;
        this.nif = nif;
        this.codigoPostal = codigoPostal;
        this.direccionFacturacion = direccionFacturacion;
        this.email = email;
        this.contraseña = contraseña;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nombreComercial='" + nombreComercial + '\'' +
                ", nombreContacto='" + nombreContacto + '\'' +
                ", telefono='" + telefono + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuentaBancaria='" + cuentaBancaria + '\'' +
                ", nif='" + nif + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", direccionFacturacion='" + direccionFacturacion + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}


