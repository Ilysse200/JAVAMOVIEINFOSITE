/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.*;
import java.util.List;
import model.operationModel;

/**
 *
 * @author 25078
 */
public interface operationInterface extends Remote{
    public String registerOperation(operationModel oprate) throws RemoteException;
    public String updateOperation(operationModel oprate) throws RemoteException;
    public String deleteOperation(operationModel oprate) throws RemoteException;
    public List<operationModel>allMoviesOperations() throws RemoteException;
    public operationModel getMovieById(operationModel operate) throws RemoteException;
}
