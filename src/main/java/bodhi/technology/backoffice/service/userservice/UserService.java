package bodhi.technology.backoffice.service.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import bodhi.technology.backoffice.model.usermodel.RoleModel;
import bodhi.technology.backoffice.model.usermodel.UserModel;
import bodhi.technology.backoffice.repository.userepo.RoleRepository;
import bodhi.technology.backoffice.repository.userepo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired RoleRepository roleRepo;
	
	@Autowired PasswordEncoder passwordEncoder;
	
	@Autowired private RoleRepository repo;
	
	public void registerDefaultUser(UserModel user) {
		RoleModel roleUser = roleRepo.findByName("Admin");
		user.addRole(roleUser);
		encodePassword(user);
		userRepo.save(user);
	}
	
	public void createRoles() {
        RoleModel staff = new RoleModel("Staff");
        RoleModel admin = new RoleModel("Admin");
//        Role staff = new Role("Staff");
         
        repo.saveAll(List.of(staff, admin));
         
       // List<Role> listRoles = repo.findAll();
         
       // assertThat(listRoles.size()).isEqualTo(3);
    }
	
	
	public void createDefaultUser() {
	    RoleModel roleAdmin = roleRepo.findByName("Admin");
	    UserModel user = new UserModel();
	    user.setEmail("bodhi12.technology@outlook.com");
	    user.setPassword("bodhi@2022");
	    user.setFirstName("Bodhi1");
	    user.setLastName("Technology2");
	    user.addRole(roleAdmin);  
	    encodePassword(user);
	    userRepo.save(user);
	     
	    UserModel savedUser = userRepo.save(user);
	    System.out.println(savedUser);
	    
	     
	    //assertThat(savedUser.getRoles().size()).isEqualTo(1);
	}
	
	
	
	public List<UserModel> listAll() {
		return userRepo.findAll();
	}

	public UserModel get(Long id) {
		return userRepo.findById(id).get();
	}
	
	public List<RoleModel> listRoles() {
		return roleRepo.findAll();
	}
	
	public void save(UserModel user) {
		encodePassword(user);		
		userRepo.save(user);
	}
	
	private void encodePassword(UserModel user) {
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);		
	}
}

