Aggregation, Projection
=======================

```
db.inv_geraet.aggregate([
      {
         "$project": {
             "_id": 0,
            "eigenschaften": "$eigenschaften"
			}
     },
	 {
         "$unwind": "$eigenschaften"
     }
])
```

	 
	// above works 
	
	
```
	db.inv_geraet.aggregate([{
    $group: {_id: null, uniqueValues: {$addToSet: "$standort"}}
}])
```
```

db.inv_geraet.aggregate([{     $group: {_id: null, uniqueValues: {$addToSet: "$eigenschaften.key"}} }])

```

resulting document:

`{ "_id" : null, "uniqueValues" : [ "Nürnberg", "München", "Darmstadt" ] }`
	


// in Java:
db.inv_geraet.aggregate([{     $group: {_id: null, uniqueValues: {$addToSet: "$eigenschaften.key"}} }])

Aggregation aggregation = Aggregation.newAggregation(
	Aggregation.group("emptyID").addToSet("$eigenschaften.key").as("uniqueValues)
);


// ausfuehren

 AggregationResults<BasicDBObject> groupResults = groupsMongoTemplate.aggregate(aggregation,
                    GroupsDocument.class, BasicDBObject.class);

[java - Spring Aggregate representation of mongodb query - Stack Overflow](https://stackoverflow.com/questions/40643267/spring-aggregate-representation-of-mongodb-query)


// WORKS
db.getCollection('inv_geraet').aggregate([{$unwind: "$eigenschaften"}, {$group: {_id: null, uniqueValues: {$addToSet: "$eigenschaften.key"}}}])