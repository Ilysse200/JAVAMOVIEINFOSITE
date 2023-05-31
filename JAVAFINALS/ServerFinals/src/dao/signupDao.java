/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.signupModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author 25078
 */
public class signupDao {
    public String registerUser(signupModel signup){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(signup);
            tr.commit();
            ss.close();
            return "user registered";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "user not registered";
        
    }
     public String updateUser(signupModel signup){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(signup);
            tr.commit();
            ss.close();
            return "user updated";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "user not ipdated";
        
}
      public String deleteUser(signupModel signup){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(signup);
            tr.commit();
            ss.close();
            return "user deleted";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "user not deleted";
}
      public List<signupModel> allMoviesUsers(){
          Session ss = HibernateUtil.getSessionFactory().openSession();
          List<signupModel> allusers = ss.createSQLQuery("select user from signupModel user").list();
          ss.close();
          return allusers;
      }
       public signupModel loginUser(signupModel user) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = null;
    signupModel logUser = null;

    try {
        transaction = session.beginTransaction();

//        String hql = "select acc FROM signupModel acc WHERE signupModel.email = :email AND signupModel.password = :password";
        Query query = session.createQuery("select user FROM signupModel user WHERE user.email = :email AND user.password = :password");
        query.setParameter("email", user.getEmail());
        query.setParameter("password", user.getPassword());

        logUser = (signupModel) query.uniqueResult();

        transaction.commit();
        System.out.println(logUser);
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        // Handle or log the exception
    } finally {
        session.close();
    }

    return logUser;   
}

  
}    
