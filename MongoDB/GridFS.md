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
