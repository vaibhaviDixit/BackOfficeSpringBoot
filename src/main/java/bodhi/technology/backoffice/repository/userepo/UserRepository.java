package bodhi.technology.backoffice.repository.userepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import bodhi.technology.backoffice.model.usermodel.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
	@Query("SELECT u FROM UserModel u WHERE u.email = :email")
	public UserModel findByEmail(@Param("email") String email);
	
}
