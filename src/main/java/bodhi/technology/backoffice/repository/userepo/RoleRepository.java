package bodhi.technology.backoffice.repository.userepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bodhi.technology.backoffice.model.usermodel.RoleModel;

public interface RoleRepository extends JpaRepository<RoleModel, Integer> {
	@Query("SELECT r FROM RoleModel r WHERE r.name = :name")
	public RoleModel findByName(String name);
}