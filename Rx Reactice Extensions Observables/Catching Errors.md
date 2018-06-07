Catching Errors
===============

Example 1: Catching error from observable

```
import { _throw } from 'rxjs/observable/throw';
import { of } from 'rxjs/observable/of';
import { catchError } from 'rxjs/operators';
//emit error
const source = _throw('This is an error!');
//gracefully handle error, returning observable with error message
const example = source.pipe(catchError(val => of(`I caught: ${val}`)));
//output: 'I caught: This is an error'
const subscribe = example.subscribe(val => console.log(val));
```


```
this.users$ = httpClient.get<User[]>('/api/users').pipe(
      catchError((error) => {
        // it's important that we log an error here.
        // Otherwise you won't see an error in the console.
        console.error('error loading the list of users', error);
        loadingError$.next(true);
        return of(); // KEINE next()
      })
    );
```

