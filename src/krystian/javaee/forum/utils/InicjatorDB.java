package krystian.javaee.forum.utils;

import javax.persistence.EntityManager;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import krystian.javaee.forum.dao.TematyDAO;
import krystian.javaee.forum.dao.UzytkownicyDAO;
import krystian.javaee.forum.dao.WpisyDAO;

/**
 * Application Lifecycle Listener implementation class InicjatorDB
 *
 */
@WebListener
public class InicjatorDB implements ServletRequestListener {


    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    }

	
    public void requestInitialized(ServletRequestEvent sre)  { 
       EntityManager em=DBConfig.createEntityManagaer();
       UzytkownicyDAO uzytkownicyDAO= new UzytkownicyDAO(em);
       TematyDAO tematyDAO=new TematyDAO(em);
       WpisyDAO wpisyDAO=new WpisyDAO(em);
       ServletRequest req = sre.getServletRequest();
       req.setAttribute("wpisyDAO", wpisyDAO);
       req.setAttribute("tematyDAO", tematyDAO);
       req.setAttribute("uzytkownicyDAO",uzytkownicyDAO);
       
    }
	
}
