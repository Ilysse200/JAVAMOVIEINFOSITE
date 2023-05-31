/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.Implementation;

import dao.signupDao;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.signupModel;
import service.signupInterface;

/**
 *
 * @author 25078
 */
public class signupImpl extends UnicastRemoteObject implements signupInterface{
    public signupImpl() throws RemoteException{
        super();
    }
    public signupDao dao = new signupDao();

    @Override
    public String registerUser(signupModel user) throws RemoteException {
        return dao.registerUser(user);
    }

    @Override
    public String updateUser(signupModel user) throws RemoteException {
        return dao.updateUser(user);
    }

    @Override
    public String deleteUser(signupModel user) throws RemoteException {
        return dao.deleteUser(user);
    }

    @Override
    public List<signupModel> allMoviesUsers() throws RemoteException {
        return dao.allMoviesUsers();
    }

    @Override
    public signupModel loginUser(signupModel user) throws RemoteException {
        return dao.loginUser(user);
    }
    
}
