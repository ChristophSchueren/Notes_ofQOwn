Optional (8)
============

Optionals are not async


schlechter alter Nullcheck nachprogrammiert
```
 Optional<Integer> myFirstOptional = myService.getSomeOptionalInteger();   
  if(myFirstOptional.isPresent()) {   
   int someInt = myFirstOptional.get();   
  }
```

wahre Stärke: *IFPRESENT*
```
  Optional<Integer> myFirstOptional = myService.getSomeOptionalInteger();   
  myFirstOptional.ifPresent(myInt -> System.out.println(myInt));   
  if(!myFirstOptional.isPresent()) {   
   System.out.println(3);   
  }
```

