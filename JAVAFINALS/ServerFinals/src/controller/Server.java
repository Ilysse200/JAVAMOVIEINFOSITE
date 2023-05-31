/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.rmi.registry.*;
import service.Implementation.operationImpl;
import service.Implementation.signupImpl;

/**
 *
 * @author 25078
 */
public class Server {
    public static void main(String[] args) {
        try{
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry registry = LocateRegistry.createRegistry(5000);
            registry.rebind("operation", new operationImpl());
            registry.rebind("signup", new signupImpl());
            registry.rebind("login", new  signupImpl());
            System.out.println("The server is running on port 5000");
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
