Caching HTTP with ReplaySubject
===============================

ReplaySubject
.flatMapLatest
Observable.fromCallback
.replay(null, count || 1)


onSubscribe()
// check if cached value exists



```
var api = (function() {
    var fetch_todos = Rx.Observable.fromCallback($.get('example.com/todos'))
        source = new Rx.Subject(),
        cached_todos = source
          .flatMapLatest(function() { 
              return fetch_todos(); 
          })
          .replay(null, 1)
          .refCount();

    return {
      refresh: function() {
        source.onNext(null);
      },
      current_todos: function() {
        return cached_todos;
      }
    };
})();
```

