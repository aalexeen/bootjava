package ru.javaops.bootjava.repository;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import ru.javaops.bootjava.model.User;

import java.util.Optional;

@Transactional(readOnly = true)
@Tag(name = "User Controller")
public interface UserRepository extends BaseRepository<User> {

    @Query("SELECT u FROM User u WHERE u.email = LOWER(:email)")
    Optional<User> findByEmailIgnoreCase(String email);

    /*@RestResource(rel = "by-lastname", path = "by-lastname")
    Page<User> findByLastNameContainingIgnoreCase(String lastName, Pageable page);

    Page<User> findAll(Pageable page);

    @Override
    @Modifying
    @Transactional
    @CachePut(value = "users", key = "#user.email")
    User save(User user);

    @Override
    @Modifying
    @Transactional
    @CacheEvict(value = "users", key = "#user.email")
    void delete(User user);

    @Override
    @Modifying
    @Transactional
    @CacheEvict(value = "users", allEntries = true)
    void deleteById(Integer integer);*/
}