Rollback not supported
======================


2
down vote
favorite
I have 2 repositories, one for mongodb (DocumentRepository) and the other for hibernate entity (EntityRepository)

I have a simple service:

```
 @Transsactional
 public doSomePersisting() {
     try {
           this.entityRepository.save(entity);
           this.documentRepository.save(document);
     }
     catch(...) {
         //Rollback mongoDB here
     }
 }
```

Is it possible to rollback the mongoDB on the "//Rollback mongoDB here" line? I already got a rollback from the entity part (Transactional annotation)?

## Answer:
MongoDB doesn't support transactions (at least not outside the scope of a single document). If you want to roll back changes you will need to handcraft that yourself. There are a few resources out there that describe ways of implementing your own transactions in Mongo if you really need them in certain circumstances. You could take a look at..

http://docs.mongodb.org/manual/tutorial/perform-two-phase-commits/

This is just an explanation of a pattern you could use. If you find that you absolutely need transactions in your application, you should consider whether MongoDB is a good fit for your needs.

