Getters und Setters
===================

http://www.typescriptlang.org/docs/handbook/classes.html

In particular, for those not familiar with it, note that you don't incorporate the word 'get' into a call to a getter (and similarly for setters):

var myBar = myFoo.getBar(); // wrong    
var myBar = myFoo.get('bar');  // wrong
You should simply do this:

var myBar = myFoo.bar;  // correct (get)
myFoo.bar = true;  // correct (set) (false is correct too obviously!)
given a class like:

class foo {
  private _bar:boolean = false;

  get bar():boolean {
    return this._bar;
  }
  set bar(theBar:boolean) {
    this._bar = theBar;
  }
}