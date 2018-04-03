manually genrating ObjectId
===========================

`someEmbeddedDoc._id = new ObjectId();`


```
@Document
public class Location {
    @Id
    private ObjectId _id;

    public Location() {
        this._id = ObjectId.get();
    }
}

@Document
public class User {
    @Id
    private ObjectId _id;

    public User() {
        this._id = ObjectId.get();
    }
}
```
