package com.github.xenteros.repository;

import com.github.xenteros.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by agurgul on 14.06.2017.
 */
@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
