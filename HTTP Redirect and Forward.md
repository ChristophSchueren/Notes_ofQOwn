HTTP Redirect and Forward
=========================

**redirect** will respond with a 302 and the new URL in the Location header; the browser/client will then make another request to the new URL


**forward** happens entirely on a server side; the Servlet container forwards the same request to the target URL; the URL won’t change in the browser