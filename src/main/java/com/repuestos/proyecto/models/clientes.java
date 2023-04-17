package com.repuestos.proyecto.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cliente")

@ToString @EqualsAndHashCode
public class clientes {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Integer id;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "celular")
    private String celular;
    @Getter @Setter @Column(name = "correo")
    private String correo;
    @Getter @Setter @Column(name = "direccion")
    private String direccion;

}
