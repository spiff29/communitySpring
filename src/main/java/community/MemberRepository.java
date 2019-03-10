package community;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Name, Integer> {
    Iterable<Name> findAll();
}
