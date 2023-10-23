/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import beans.Salle;
import dao.IDao;
import services.SalleService;
import util.HibernateUtil;

/**
 *
 * @author kholo
 */
public class TestSalleService {
    
     public static void main(String[] args) {
        // HibernateUtil.getSessionFactory().openSession();
         IDao<Salle> dao;
        try {

            dao = new SalleService();
            //tester la methode create----------------------------------
//            dao.create(new Salle("salle1"));
//            dao.create(new Salle("salle2"));
//            dao.create(new Salle("salle3"));
//            System.out.println("------------------------------");

            //tester la methode delete et findById----------------------
//            dao.delete(dao.findById(3));
//            System.out.println("------------------------------");
//            for (Salle salle : dao.findAll()) {
//                System.out.println(salle.toString());
//            }
            //tester la methode update----------------------
            // Retrieve the machine you want to update
//            Salle salleToUpdate = dao.findById(2);
//            salleToUpdate.setCode("salleA");
//            dao.update(salleToUpdate);
//            System.out.println("------------------------------");

        } catch (RemoteException ex) {
            Logger.getLogger(TestSalleService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
