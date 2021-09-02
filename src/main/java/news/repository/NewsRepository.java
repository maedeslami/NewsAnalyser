package news.repository;

/**
 * Created by Lenovo on 8/15/2021.
 */


import news.model.Mock;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class NewsRepository {
    @PersistenceContext
    private EntityManager entityManager;
    public void save(Mock mock) {
        entityManager.persist(mock);
    }
}
