package in.codecraftsbysanta.splitexpense.repositories;

import in.codecraftsbysanta.splitexpense.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}