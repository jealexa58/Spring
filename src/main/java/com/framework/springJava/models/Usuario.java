package com.framework.springJava.models;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;




@Entity
@Table(name = "usuarios")
@ToString
@EqualsAndHashCode
public class Usuario {
// Declarando las variables y métodos Getter and Setter a través de la libreria  lombok

    @Id // indica la clave primaria
    @Getter  @Setter @Column(name = "id")
    private Long  id;

    @Getter  @Setter @Column(name = "nombre")
    private String nombre;

    @Getter  @Setter @Column(name = "apellido")
    private String apellido;

    @Getter  @Setter @Column(name = "email")
    private String email;

    @Getter  @Setter @Column(name = "telefono")
    private String telefono;

    @Getter  @Setter @Column(name = "password")
    private  String password;

}
