Projection in Java
==================

{ "_id" : null, "uniqueValues" : [ "Nürnberg", "München", "Darmstadt" ] }

[Spring Data MongoDB: Projections and Aggregations | Baeldung](http://www.baeldung.com/spring-data-mongodb-projections-aggregations)

> 2.1. Projections Using MongoTemplate
> The include() and exclude() methods on the Field class is used to include and exclude fields respectively:
> 
> 1
> 2
> 3
> Query query = new Query();
> query.fields().include("name").exclude("id");
> List<User> john = mongoTemplate.find(query, User.class);
> These methods can be chained together to include or exclude multiple fields. The field marked as @Id (_id in the database) is always fetched unless explicitly excluded.
> 
> Excluded fields are null in the model class instance when records are fetched with projection. In the case where fields are of a primitive type or their wrapper class, then the value of excluded fields are default values of the primitive types.
> 
> For example, String would be null, int/Integer would be 0 and boolean/Boolean would be false.
> 
> Thus in the above example, the name field would be John, id would be null and age would be 0.