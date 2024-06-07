package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.logica.Duenio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-05T16:30:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Mascotas.class)
public class Mascotas_ { 

    public static volatile SingularAttribute<Mascotas, Integer> num_cliente;
    public static volatile SingularAttribute<Mascotas, String> nombre_perro;
    public static volatile SingularAttribute<Mascotas, String> raza;
    public static volatile SingularAttribute<Mascotas, String> color;
    public static volatile SingularAttribute<Mascotas, Duenio> duenio;
    public static volatile SingularAttribute<Mascotas, String> alergico;
    public static volatile SingularAttribute<Mascotas, String> observaciones;
    public static volatile SingularAttribute<Mascotas, String> atencion_especial;

}