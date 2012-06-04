package oz.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: alberto
 * Date: 29/05/12
 * Time: 01:55 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
//@Table(name = "Person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_person", nullable = false)
    private Long id;

    @Column(name = "name", nullable = true)
    private String name;


}
