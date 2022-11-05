package org.horizon.dao;

import org.horizon.entities.Team;

import java.util.List;

public interface ITeamDAO {
    public void save(Team t);
    public List<Team> findAll();
    public List<Team> findByName(String name);
    public Team findOne(Long id);
    public void update(Team t);
    public void delete(Long id);
}
