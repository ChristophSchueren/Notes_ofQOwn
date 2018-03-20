flatMap
=======
```

http.get( • /api/person/123' ) 
.map(res => res.json()) 
> . flatMap( person => http.get( ' /api/dealer/' )
.map(res res.json()) 
. subscribe(dealer { 
console. log(dealer) ; 
+ person. zipCode) ) 
```


Flatmap keeps ONE main Observable

What happens if *http.get( ' /api/dealer/' )* errors?