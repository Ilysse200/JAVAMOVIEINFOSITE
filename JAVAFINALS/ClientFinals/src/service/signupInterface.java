/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.signupModel;

/**
 *
 * @author 25078
 */
public interface signupInterface extends Remote{
    public String registerUser(signupModel user) throws RemoteException;
    public String updateUser(signupModel user) throws RemoteException;
    public String deleteUser(signupModel user) throws RemoteException;
    public List<signupModel>allMoviesUsers() throws RemoteException;
    public signupModel loginUser(signupModel user) throws RemoteException;
}

   