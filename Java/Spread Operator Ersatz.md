Spread Operator Ersatz
======================

In Javascript, I had the following code:

let args = [1,2,3];

```JavaScript
function doSomething (a, b, c) {
    return a + b + c;
}
```

`doSomething(...args);`
As you can see, when calling doSomething, I am able to use the ... spread operator in order to "transform" my arguments into 1, 2, 3.

Now, I'm trying to do the same thing with Java.

Let's say I have a Foo class:

```Java
public class Foo {
    public int doSomething (int a, int b, int c) {
        return a + b + c;
    }
}
```

And now I want to call the doSomething:

`int[] args = {1, 2, 3};`
I'd like to use something like doSomething (...args) instead of calling `doSomething(args[0], args[1], args[2])`.

### Solution



### similar
Variable Arguments
