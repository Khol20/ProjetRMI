/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientrmi;

import dao.IDao;
import beans.Machine;
import beans.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kholo
 */
public class ClientRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            IDao<Machine> machineDao = (IDao<Machine>) Naming.lookup("rmi://localhost:1099/machineDao");
            IDao<Salle> salleDao = (IDao<Salle>) Naming.lookup("rmi://localhost:1099/salleDao");           
//            machineDao.create(new Machine("Cisco", 999.99, "ROUT1234"));
//            machineDao.create(new Machine("Cisco", 999.99, "ROUT1234"));
//            machineDao.create(new Machine("Netgear", 349.99, "SWITCH5678"));
//            machineDao.create(new Machine("TP-Link", 79.99, "TPLINK4321"));
//            machineDao.create(new Machine("D-Link", 149.95, "DLSWITCH7890"));
//            System.out.println("-----------------------------------");
//            for (Machine machine : machineDao.findAll()) {
//                System.out.println(machine.toString());
//            }
        } catch (NotBoundException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
    
    
}
