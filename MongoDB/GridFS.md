GridFS
======

### commandline
`mongofiles /db:spiritInventory put .bashrc.bat`

#### erzeugt
- in Datenbank "spiritInventory"
- Collection fs.files
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
