Caching HTTP
============

```
getFriends(){
    if(!this._friends){
      this._friends = this._http.get('./components/rxjs-caching/friends.json')
                                   .map((res:Response) => res.json().friends)
                                   .publishReplay(1)
                                   .refCount();
    }
    return this._friends;
}
```

publishReplay(1) tells rxjs to cache the most recent value which is perfect for single value http calls. refCount() is used to keep the observable alive for as long as there are subscribers.