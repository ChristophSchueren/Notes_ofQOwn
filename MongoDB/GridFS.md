GridFS
======

### commandline
`mongofiles /db:spiritInventory put .bashrc.bat`

#### erzeugt
- in Datenbank "spiritInventory"
- Collection fs.files
```

{
    "_id" : ObjectId("5b27a52d66f32710a4388921"),
    "chunkSize" : 261120,
    "uploadDate" : ISODate("2018-06-18T12:27:25.444Z"),
    "length" : 138,
    "md5" : "118772cdac4699566517de014d9d7dd1",
    "filename" : ".bashrc.bat"
}
```

- Collection fs.chunks

#### in Spring
GridFsTemplate
```

public GridFsTemplate(MongoDbFactory dbFactory, MongoConverter converter, String bucket)
```


### Without GridFsTemplate
```

file = gridOperations.findOne(Query.query(Criteria.where("_id").is(id))); InputStream is = file.getInputStream();
```
> WORAUF muss die gridOperation angewendet werden???
	- eigentlich db: spiritInventory, 

###