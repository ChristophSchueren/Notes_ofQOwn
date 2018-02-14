UnitTest_Spring_Verschachtelte_Entitäten
========================================

You need a transaction to insert data

> EntityManagerFactory emf = Persistence
>     .createEntityManagerFactory("UnidadOGM");
> 
>     EntityManager em = emf.createEntityManager();
>     Persona p = new Pwersona();
>     p.setId("1");
>     p.setNombre("Alberto");
>     p.setNombre("Perez");
> 
>     em.getTransaction().begin();
> 
>     em.persist(p);
> 
>     em.getTransaction().commit();
>     em.close();
If you want to insert and query data in one transaction, probably, you need to call flush() after inserting data.

