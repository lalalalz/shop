package jpabook.jpashop;

import jpabook.jpashop.domain.*;

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


        Order order = new Order();
        entityManager.persist(order);

        Member member = new Member();
        member.getOrders().add(order);
        entityManager.persist(member);


        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    private static void 연관관계매핑실전예제테스트(EntityManager entityManager) {
        Member member = new Member();
        member.setName("memberA");
        entityManager.persist(member);

        Order order = new Order();
        order.setOrderStatus(OrderStatus.ORDER);
        order.setMember(member);
        entityManager.persist(order);

        Item item = new Item();
        item.setName("itemA");
        entityManager.persist(item);


        OrderItem orderItem = new OrderItem();
        orderItem.setOrder(order);
        orderItem.setItem(item);
        entityManager.persist(orderItem);
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
