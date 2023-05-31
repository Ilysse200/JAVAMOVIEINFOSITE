/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.Implementation;

import dao.operationDao;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.operationModel;
import service.operationInterface;

/**
 *
 * @author 25078
 */
public class operationImpl extends UnicastRemoteObject implements operationInterface{
    public operationImpl() throws RemoteException{
        super();
    }
    public operationDao dao = new operationDao();
    
   
    @Override
    public String registerOperation(operationModel oprate) throws RemoteException {
        return dao.registerOperation(oprate);
    }

    @Override
    public String updateOperation(operationModel oprate) throws RemoteException {
        return dao.updateOperation(oprate);
    }

    @Override
    public String deleteOperation(operationModel oprate) throws RemoteException {
        return dao.deleteOperation(oprate);
    }

    @Override
    public List<operationModel> allMoviesOperations() throws RemoteException {
        return dao.allMoviesOperations();
    }

    @Override
    public operationModel getMovieById(operationModel operate) throws RemoteException {
        return dao.getMovieById(operate);
    }
    
}
