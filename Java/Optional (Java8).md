Optional (Java8)
============

**Optionals are not async**

Creating Optional Objects
Optional<String> errMsg = Optional.empty();



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
sehr nütlich: **orelse** gibt value or other value

```
 Optional<Integer> myFirstOptional = myService.getSomeOptionalInteger();   
 System.out.println(myFirstOptional.orElse(5));
```


throw if not present **orelsethrow**
```
Optional<Integer> myFirstOptional = myService.getSomeOptionalInteger();   
  myFirstOptional.orElseThrow(RuntimeException::new);
```
filter

```
 int someInt = myFirstOptional   
      .filter(myInt -> myInt == 3)   
      .orElse(5);
```

