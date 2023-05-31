/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.operationModel;
import org.hibernate.*;


/**
 *
 * @author 25078
 */
public class operationDao {
    public String registerOperation(operationModel operation){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(operation);
            tr.commit();
            ss.close();
            return "Data saved";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Data not saved";
        
    }
     public String updateOperation(operationModel operation){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(operation);
            tr.commit();
            ss.close();
            return "Data updated";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Data not ipdated";
        
}
      public String deleteOperation(operationModel operation){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(operation);
            tr.commit();
            ss.close();
            return "Data deleted";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Data not deleted";
}
      public List<operationModel> allMoviesOperations(){
          try{
          Session ss = HibernateUtil.getSessionFactory().openSession();
          List<operationModel> allmovies = ss.createQuery("from operationModel").list();
          //ss.close();
          return allmovies;
          }catch(Exception ex){
              ex.printStackTrace();
          }
          return null;
          
      }
      //search movie
      public operationModel getMovieById(operationModel operats){
          Session ss = HibernateUtil.getSessionFactory().openSession();
          operationModel op = (operationModel)ss.get(operationModel.class, operats.getMovieId());
          ss.close();
          return  op;
      }
}
    
