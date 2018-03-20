retry() error Handling
======================
```

import { take, map, filter, distinctUntilChanged, debounceTime, tap, pluck, publishReplay, flatMap, retry, retryWhen } from 'rxjs/operators';

```
retry(x) retries x-times immediately after failure.

> Retry after time (HTTP)

retryWhed( (err) => err. delay(1000)) 
