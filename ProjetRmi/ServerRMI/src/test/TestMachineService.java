/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import beans.Machine;
import dao.IDao;
import services.MachineService;
import util.HibernateUtil;

/**
 *
 * @author kholo
 */
public class TestMachineService {

    public static void main(String[] args) {
        // HibernateUtil.getSessionFactory().openSession();

        IDao<Machine> dao;
        try {

            dao = new MachineService();
            //tester la methode create----------------------------------
//            dao.create(new Machine("Cisco", 999.99, "ROUT1234"));
//            dao.create(new Machine("Netgear", 349.99, "SWITCH5678"));
//            dao.create(new Machine("TP-Link", 79.99, "TPLINK4321"));
//            dao.create(new Machine("D-Link", 149.95, "DLSWITCH7890"));
//            System.out.println("------------------------------");

            //tester la methode delete et findById----------------------
//            dao.delete(dao.findById(4));
//            System.out.println("------------------------------");
//            for (Machine machine : dao.findAll()) {
//                System.out.println(machine.toString());
//            }
            //tester la methode update----------------------
            // Retrieve the machine you want to update
            Machine machineToUpdate = dao.findById(3);
            machineToUpdate.setPrix(89.0);
            dao.update(machineToUpdate);
//            System.out.println("------------------------------");

        } catch (RemoteException ex) {
            Logger.getLogger(TestMachineService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
