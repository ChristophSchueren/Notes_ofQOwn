add Operators
=============

```
import { take, map } from 'rxjs/operators';
import { of } from 'rxjs/observable/of';

of(1,2,3)
  .pipe(
    take(2),
    map(val => val + 2)
  );
```





------------

`import 'rxjs/add/operator/take';`

> Typescript way?

This adds the imported operator to the Observable prototype for use throughout your project:

```
import { Observable } from '../../Observable';
import { take } from '../../operator/take';

Observable.prototype.take = take;
```


# Problem:
### depending on other ones imports
> Person B upgrades the dependency, builds their project, which now fails. They never included switchMap or concatMap themselves, it was just working based on the inclusion of a 3rd party dependency. If you were not aware this could be an issue it may take a bit to track down.

Solution
## Pipeable Operators