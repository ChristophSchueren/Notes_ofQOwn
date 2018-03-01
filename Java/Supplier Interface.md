Supplier Interface
==================

```
SunPower produce(Supplier<SunPower> supp) { 
 return supp.get(); // supplier have get() by interface
    }
```
```
Supplier<String> i  = ()-> "java2s.com";
    
    System.out.println(i.get());
```

Lambda Expressions gehen *direkt*
```
SunPower power = new SunPower();
SunPower p1 = produce(() -> power); 
```
