EMPTY typed Observable
======================

import 'rxjs/add/observable/empty' 



```
import { empty } from "rxjs/observable/empty";
import { of } from "rxjs/observable/of";

empty() //completes ;
of({}) //does not complete;
```

> Just one thing to keep in mind, empty() completes the observable, so it won't trigger next in your stream, only completes! So if you have tap for instance they might not get trigger as you wish (see example below).
> 
> whereas of({}) creates an observable and emits next with a value of {}, it won't complete the observable alone, perhaps you should do of({}).pipe(take(1)) to emit and complete.