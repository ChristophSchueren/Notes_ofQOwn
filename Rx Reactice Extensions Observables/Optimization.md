Optimization
============

As with all cases of optimizing: 
> check that this is actually a problem before you solve it. 

In a quick test I did, computing and comparing 2 MD5 sums took 382ms. Comparing the two strings directly took 0ms. This was using a string that was 10000 words long. See http://jsfiddle.net/DjM8S.

If you really see this as an issue, I would also strongly consider using a poor-mans comparison; and just comparing the length of the 2 strings, to see if they have changed or not, rather than actual string comparisons.