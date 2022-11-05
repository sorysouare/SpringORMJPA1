package org.horizon;

import org.horizon.dao.ITeamDAO;
import org.horizon.entities.Team;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class TpSpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(TpSpringJpaApplication.class, args);

		ITeamDAO dao=ctx.getBean(ITeamDAO.class);
		dao.save(new Team(null,"Real Madrid"));
		dao.save(new Team(null,"FC Barcelone"));
		dao.save(new Team(null,"Paris FC"));

		List<Team> teamList=dao.findByName("FC");
		for(Team team:teamList){
			System.out.println(team.getName());
		}
	}

}
