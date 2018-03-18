Observable Buffer Interfvall
============================

//Create an observable that emits a value every second
`const myInterval = Rx.Observable.interval(1000);`

//Create an observable that emits every time button is clicked
var button = document.getElementById('clickButton');
const bufferBy = Rx.Observable.fromEvent(button, 'click');

/*
Collect all values emitted by our interval observable until we click document. This will cause the bufferBy Observable to emit a value, satisfying the buffer. Pass us all collected values since last buffer as an array.
*/
`const myBufferedInterval = myInterval.buffer(bufferBy);`


> Message every Second