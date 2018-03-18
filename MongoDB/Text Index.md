Text Index
==========

[Text Indexes — MongoDB Manual 3.6](https://docs.mongodb.com/manual/core/index-text/)

A collection can have at most one text index.

### language specific
> MongoDB supports text search for various languages. text indexes drop language-specific stop words (e.g. in English, the, an, a, and, etc.) and use simple language-specific suffix stemming. For a list of the supported languages, see Text Search Languages.

### get index sizes
`db.collection.totalIndexSize()`
`db.collection.stats().indexSizes`
*size in bytes* 

# erstellen

`db.reviews.createIndex( { comments: "text" } )`

## multi fields

```
db.reviews.createIndex(
   {
     subject: "text",
     comments: "text"
   }
 )
```




# abfragen
$text query operations.
[$text — MongoDB Manual 3.6](https://docs.mongodb.com/manual/reference/operator/query/text/#op._S_text)
```
{
  $text:
    {
      $search: <string>,
      $language: <string>,
      $caseSensitive: <boolean>,
      $diacriticSensitive: <boolean>
    }
}
```
> MongoDB performs a logical OR search of the terms unless specified as a phrase.

### phrases
escaped double quotes \" specifies a phrase.
`$search: "\"ssl certificate\""`
hyphen-minus (-) negates a word

# automatische ERstellung mit Mongobee

# abfragen mit text-index java spring driver


### regex searches
`{ <field>: { $regex: 'pattern', $options: '<options>' } }`
`{ <field>: { $regex: /pattern/<options> } }`


#### regex index usage
> **case sensitive** regular expression queries, if an index exists for the field, then MongoDB matches the regular expression against the values in the index,

`db.products.find( { sku: { $regex: /^ABC/i } } )`