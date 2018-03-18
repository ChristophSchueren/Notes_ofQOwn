For of für Arrays
=================

for...of
ist fuer **Array** iterator




for in ist fuer **properties** eines Objekts

A common error experienced by beginning JavaScript developers is that for...in for an array does not iterate over the array items. Instead it iterates over the keys of the object passed in. This is demonstrated in the below example. Here you would expect 9,2,5 but you get the indexes 0,1,2: