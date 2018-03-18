Observable Debouncing
=====================

**SwitchMap** Operator
When source emits, switch to and emit values emitted from latest inner observable, *discards* any other values which were a result of the previous source emission.

Discard means, the number of emits is reduced

//emit every click
`const sourceTwo = Rx.Observable.fromEvent(document, 'click');`
//if another click comes within 3s, message will not be emitted
`const exampleTwo = sourceTwo.switchMap(val => Rx.Observable.interval(3000).mapTo('Hello, I made it!'));`
//(click)...3s...'Hello I made it!'...(click)...2s(click)...
const subscribeTwo = exampleTwo.subscribe(val => console.log(val));