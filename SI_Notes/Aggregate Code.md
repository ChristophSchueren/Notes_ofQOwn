Aggregate Code
==============

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
	 
	// above works 
	
	
	db.inv_geraet.aggregate([{
    $group: {_id: null, uniqueValues: {$addToSet: "$standort"}}
}])
	
	
	 ,
     {
        "$match": {
            "passengers.user": "user3"
        }
     },
     {
         "$project": {
             "_id": 0,
            "driver": "$driver",
            "times": "$passengers.times"
        }
     }
])