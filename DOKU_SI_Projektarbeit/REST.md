# https://blog.mwaysolutions.com/2014/06/05/10-best-practices-for-better-restful-api/

4. Use sub-resources for relations
If a resource is related to another resource use subresources.

GET /cars/711/drivers/ Returns a list of drivers for car 711
GET /cars/711/drivers/4 Returns driver #4 for car 711