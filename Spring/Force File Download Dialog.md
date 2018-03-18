Force File Download Dialog
==========================


[java - Downloading a file from spring controllers - Stack Overflow](https://stackoverflow.com/questions/5673260/downloading-a-file-from-spring-controllers)

You should be able to write the file on the response directly. Something like

response.setContentType("application/pdf");      
response.setHeader("Content-Disposition", "attachment; filename=\"somefile.pdf\""); 

and then write the file as a binary stream on response.getOutputStream(). Remember to do **response.flush()** at the end and that should do it.

Use the *Content-Disposition: attachment*; etc etc **header** if you want to encourage the client to download it instead of following the default behaviour.