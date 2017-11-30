package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Paciente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T21:33:06")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, String> medicacao;
    public static volatile SingularAttribute<Consulta, String> data;
    public static volatile SingularAttribute<Consulta, Paciente> paciente;
    public static volatile SingularAttribute<Consulta, String> relato;
    public static volatile SingularAttribute<Consulta, Long> id;
    public static volatile SingularAttribute<Consulta, String> exames;

}