package logica;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
------------------------------------------------------------
> KARAOKE

- AUTHOR:     Doramas García Jorge
- EMAIL:      dev.doramas@gmail.com
- GITHUB:     https://github.com/doramasgarciajorge
- REPOSITORY: https://github.com/doramasgarciajorge/karaoke
------------------------------------------------------------
*/

public class logicaGeneral {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
    private static EntityManager man = emf.createEntityManager();
    
}
