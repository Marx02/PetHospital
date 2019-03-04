/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import dto.PetsDTO;
import entity.pethospital.Pet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author caspe
 */
public class DataFacade {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

    public EntityManager getManager() {
        return emf.createEntityManager();
    }

    public List<Pet> getAllPets() {
        EntityManager em = getManager();
        return em.createQuery("SELECT a FROM Pet a").getResultList();
    }

    public List<PetsDTO> getAllPetsDTO() {
        EntityManager em = getManager();
        return em.createQuery("SELECT NEW dto.PetsDTO(p) FROM Pet p").getResultList();
    }

//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//        DataFacade df = new DataFacade(emf);
//        System.out.println(df.getAllPets());
//    }
//
//    public DataFacade(EntityManagerFactory df) {
//        this.emf = df;
//    }
}
