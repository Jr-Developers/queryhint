package io.velog.youmakemesmile.queryhint.jpa;

import io.velog.youmakemesmile.queryhint.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;

import javax.persistence.QueryHint;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    @QueryHints({
            @QueryHint(name = org.hibernate.annotations.QueryHints.COMMENT, value = "userRepository.findAll")
    })
    List<User> findAll();

    @QueryHints({
            @QueryHint(name = org.hibernate.annotations.QueryHints.COMMENT, value = "userRepository.findById")
    })
    Optional<User> findById(String id);

    @QueryHints({
            @QueryHint(name = org.hibernate.annotations.QueryHints.COMMENT, value = "userRepository.save")
    })
    User save(User user);
}
