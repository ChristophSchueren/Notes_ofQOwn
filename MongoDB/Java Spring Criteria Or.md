Java Spring Criteria Or
=======================

Or if you are using a Criteria API

```
Criteria criteria = new Criteria();
        criteria.orOperator(Criteria.where("A").is(10),Criteria.where("B").is(20));
        Query query = new Query(criteria);

        mongoOps.find(query, <Yourclass>.class, "collectionName");
```
> criteria.orOperator(...,...);