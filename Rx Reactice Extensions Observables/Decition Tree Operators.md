Decition Tree Operators
=======================

A Decision Tree of Observable Operators
This tree can help you find the ReactiveX Observable operator you’re looking for.

I want to create a new Observable
that emits a particular item
Just
that was returned from a function called at subscribe-time
Start
that was returned from an Action, Callable, Runnable, or something of that sort, called at subscribe-time
From
after a specified delay
Timer
that pulls its emissions from a particular Array, Iterable, or something like that
From
by retrieving it from a Future
Start
that obtains its sequence from a Future
From
that emits a sequence of items repeatedly
Repeat
from scratch, with custom logic
Create
for each observer that subscribes
Defer
that emits a sequence of integers
Range
at particular intervals of time
Interval
after a specified delay
Timer
that completes without emitting items
Empty
that does nothing at all
Never
I want to create an Observable by combining other Observables
and emitting all of the items from all of the Observables in whatever order they are received
Merge
and emitting all of the items from all of the Observables, one Observable at a time
Concat
by combining the items from two or more Observables sequentially to come up with new items to emit
whenever each of the Observables has emitted a new item
Zip
whenever any of the Observables has emitted a new item
CombineLatest
whenever an item is emitted by one Observable in a window defined by an item emitted by another
Join
by means of Pattern and Plan intermediaries
And/Then/When
and emitting the items from only the most-recently emitted of those Observables
Switch
I want to emit the items from an Observable after transforming them
one at a time with a function
Map
by emitting all of the items emitted by corresponding Observables
FlatMap
one Observable at a time, in the order they are emitted
ConcatMap
based on all of the items that preceded them
Scan
by attaching a timestamp to them
Timestamp
into an indicator of the amount of time that lapsed before the emission of the item
TimeInterval
I want to shift the items emitted by an Observable forward in time before reemitting them
Delay
I want to transform items and notifications from an Observable into items and reemit them
by wrapping them in Notification objects
Materialize
which I can then unwrap again with
Dematerialize
I want to ignore all items emitted by an Observable and only pass along its completed/error notification
IgnoreElements
I want to mirror an Observable but prefix items to its sequence
StartWith
only if its sequence is empty
DefaultIfEmpty
I want to collect items from an Observable and reemit them as buffers of items
Buffer
containing only the last items emitted
TakeLastBuffer
I want to split one Observable into multiple Observables
Window
so that similar items end up on the same Observable
GroupBy
I want to retrieve a particular item emitted by an Observable:
the last item emitted before it completed
Last
the sole item it emitted
Single
the first item it emitted
First
I want to reemit only certain items from an Observable
by filtering out those that do not match some predicate
Filter
that is, only the first item
First
that is, only the first items
Take
that is, only the last item
Last
that is, only item n
ElementAt
that is, only those items after the first items
that is, after the first n items
Skip
that is, until one of those items matches a predicate
SkipWhile
that is, after an initial period of time
Skip
that is, after a second Observable emits an item
SkipUntil
that is, those items except the last items
that is, except the last n items
SkipLast
that is, until one of those items matches a predicate
TakeWhile
that is, except items emitted during a period of time before the source completes
SkipLast
that is, except items emitted after a second Observable emits an item
TakeUntil
by sampling the Observable periodically
Sample
by only emitting items that are not followed by other items within some duration
Debounce
by suppressing items that are duplicates of already-emitted items
Distinct
if they immediately follow the item they are duplicates of
DistinctUntilChanged
by delaying my subscription to it for some time after it begins emitting items
DelaySubscription
I want to reemit items from an Observable only on condition that it was the first of a collection of Observables to emit an item
Amb
I want to evaluate the entire sequence of items emitted by an Observable
and emit a single boolean indicating if all of the items pass some test
All
and emit a single boolean indicating if the Observable emitted any item (that passes some test)
Contains
and emit a single boolean indicating if the Observable emitted no items
IsEmpty
and emit a single boolean indicating if the sequence is identical to one emitted by a second Observable
SequenceEqual
and emit the average of all of their values
Average
and emit the sum of all of their values
Sum
and emit a number indicating how many items were in the sequence
Count
and emit the item with the maximum value
Max
and emit the item with the minimum value
Min
by applying an aggregation function to each item in turn and emitting the result
Scan
I want to convert the entire sequence of items emitted by an Observable into some other data structure
To
I want an operator to operate on a particular Scheduler
SubscribeOn
when it notifies observers
ObserveOn
I want an Observable to invoke a particular action when certain events occur
Do
I want an Observable that will notify observers of an error
Throw
if a specified period of time elapses without it emitting an item
Timeout
I want an Observable to recover gracefully
from a timeout by switching to a backup Observable
Timeout
from an upstream error notification
Catch
by attempting to resubscribe to the upstream Observable
Retry
I want to create a resource that has the same lifespan as the Observable
Using
I want to subscribe to an Observable and receive a Future that blocks until the Observable completes
Start
I want an Observable that does not start emitting items to subscribers until asked
Publish
and then only emits the last item in its sequence
PublishLast
and then emits the complete sequence, even to those who subscribe after the sequence has begun
Replay
but I want it to go away once all of its subscribers unsubscribe
RefCount
and then I want to ask it to start
Connect