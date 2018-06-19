GridFS
======
# Workflow:
1. Upload file
	- file entry wird angelegt
2. Listeneintrag wird angezeigt
3. Metadata wie beschreibung werden eingetragen
	- speichern inline?
	- input element: onchange event


### commandline
`mongofiles /db:spiritInventory put .bashrc.bat`

set bucket string

set metadata JSON object

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
	- eigentlich db: spiritInventory, collection: fs.files

###  Vorschlag Mapper Klasse
```

@Document(collection="fs.files")
public class MyGridFsFile {

    @Id
    private ObjectId id;
    public ObjectId getId() { return id; }

    private String filename;
    public String getFilename() { return filename; }

    private long length;
    public long getLength() { return length; }

    ...

}
```

#### meine Ergänzung auf metadata write
```
@Document
public class DateiAnhangMetadata {
private String beschreibung;
private String berechtigung; // besser als enum



// ergaenze getter, setter
}



{
private void set }
```


### Spring ignore Attribute
```

@Transient

```
