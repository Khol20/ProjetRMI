/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import dao.IDao;
import beans.Machine;
import beans.Salle;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import services.MachineService;
import services.SalleService;

/**
 *
 * @author HP
 */
public class ConnexionJndi {
    private static InitialContext ctx;
    public static void initJNDI(){
      
        try {
            LocateRegistry.createRegistry(1099);
            final Hashtable<Object,Object> jndiProperties = new Hashtable<Object,Object>();
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");
            jndiProperties.put(Context.PROVIDER_URL, "rmi://localhost:1099");
            ctx=new InitialContext(jndiProperties);
        } catch (RemoteException ex) {
            Logger.getLogger(ConnexionJndi .class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(ConnexionJndi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void bindJNDI(String name,Object obj) throws NamingException{
        ctx.bind(name, obj);
    }
    public static void unbindJNDI(String name) throws NamingException{
        ctx.unbind(name);
    }
    public static void unInitJNDI() throws NamingException{
        ctx.close();
    }
    public static void main(String[] args) {
    
        try {
            initJNDI();
            IDao<Salle> salleDao = new SalleService();
            IDao<Machine> machineDao = new MachineService();
            ctx.bind("machineDao", machineDao);
             ctx.bind("salleDao", salleDao);
             System.out.println("En attente des clients");
        } catch (RemoteException ex) {
            Logger.getLogger(ConnexionJndi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(ConnexionJndi.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
}
