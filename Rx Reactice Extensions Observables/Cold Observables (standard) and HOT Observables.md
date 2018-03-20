Cold Observables (standard) and HOT Observables
===============================================

> eager vs lazy execution

> cancellation and reuse of observables


> Promises are always multicast.

Observables are just functions!
Observables are *functions that tie an observer to a producer.* That’s it. They don’t necessarily set up the producer, they just set up an observer to listen to the producer,

## Cold
An observable is “cold” if its underlying **producer** is *created and activated during subscription.* 

1. creates the producer
2. activates the producer
3. starts listening to the producer
4. unicast

## HOT Observables: Producers created *outside*

1. shares a reference to a producer
2. starts listening to the producer
3. multicast (usually²)


## make cold HOT
In RxJS, Use `publish()` or `share()`
RxJS includes a `multicast` operator that can be applied to an observable to make it hot
it returns a **ConnectableObservable** which does *not immediately subscribe* to the source. Man muss CObservable`.connect()` manuell aufrufen.

`publishReplay(1)` will replay the specified number of next notifications whenever an observer subscribes.


> anschließend connect()