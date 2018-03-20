retry() error Handling
======================
```

import { take, map, filter, distinctUntilChanged, debounceTime, tap, pluck, publishReplay, flatMap, retry, retryWhen } from 'rxjs/operators';

```
retry(x) retries x-times immediately after failure.

> Retry after time (HTTP), 1sec
```

retryWhen( (err) => err. delay(1000)) 
```

// neuer Ansatz ohne flatMap
```

ngOnInit() { 
let empCode: string = this._activatedRoute.snapshot.params[ •code']; 
this. _emp10yeeService. get Emp loyeeByCode (empCode) 
return err. scan((retryCount) => { 
retryCount 1; 
if (retryCount < 6) { 
' Retrying.... Attempt # 
this. statusMessage = 
return retryCount; 
else { 
throw (err) 
0). delay (1000) 
+ retryCount; 
```
