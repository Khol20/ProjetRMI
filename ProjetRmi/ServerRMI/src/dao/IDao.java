package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public interface IDao<T> extends Remote {

    boolean create(T o) throws RemoteException;

    boolean delete(T o) throws RemoteException;

    boolean update(T o) throws RemoteException;

    T findById(int o) throws RemoteException;

    List<T> findAll() throws RemoteException;

}
