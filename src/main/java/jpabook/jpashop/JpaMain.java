package jpabook.jpashop;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Order;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    private static void relationTest2(EntityManager entityManager) {
//        Team team = new Team();
//        team.setName("TeamA");
//        entityManager.persist(team);
//
//        Member member = new Member();
//        member.setName("member1");
//        member.setTeamId(team.getId());
//        entityManager.persist(member);
//
//        Member findMember = entityManager.find(Member.class, member.getId);
//        Team findTeam = entityManager.find(Team.class, findMember.getTeamId());
    }

    private static void realationTest(EntityManager entityManager) {
        Order order = entityManager.find(Order.class, 1L);
//        Member member = order.getMember();
    }

}
