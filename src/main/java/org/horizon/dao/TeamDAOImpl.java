package org.horizon.dao;

import org.horizon.entities.Team;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository
@Transactional
public class TeamDAOImpl implements ITeamDAO{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void save(Team t) {
        entityManager.persist(t);
    }

    @Override
    public List<Team> findAll() {
        Query query=entityManager.createQuery("select t from Teams t");
        return query.getResultList();
    }

    @Override
    public List<Team> findByName(String name) {
        Query query=entityManager.createQuery("select t from Team t where t.name like :x ");
        query.setParameter("x", "%"+ name+"%");
        return query.getResultList();
    }

    @Override
    public Team findOne(Long id) {
        Team team=entityManager.find(Team.class, id);
        return team;
    }

    @Override
    public void update(Team t) {
        entityManager.merge(t);
    }

    @Override
    public void delete(Long id) {
        Team team=entityManager.find(Team.class, id);
        entityManager.remove(team);
    }
}
