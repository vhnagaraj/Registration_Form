package comRegistration.Form.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comRegistration.Form.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	
	

}
