package br.com.fiap.carona2.bean;

import javax.faces.bean.ManagedBean;
import br.com.fiap.carona2.dao.UserDAO;
import br.com.fiap.carona2.dao.impl.UserDAOImpl;
import br.com.fiap.carona2.entity.User;

@ManagedBean
public class UserBean extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	
	@SuppressWarnings("unused")
	private void init() {
		user = new User();
	}
	
	public void register() throws Exception {
		
		UserDAO dao = new UserDAOImpl();
		dao.register(user);
		dao.commit();
		
	}

}
