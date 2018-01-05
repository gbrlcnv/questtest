package it.etianus.quest.repository;

import it.etianus.quest.domain.SchemaAnswerField;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the SchemaAnswerField entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SchemaAnswerFieldRepository extends JpaRepository<SchemaAnswerField, Long> {

}
