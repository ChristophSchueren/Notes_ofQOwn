Microstorage is emerging as a new architecture to address the storage scalability for microservices.
====================================================================================================

Store files permanently.

statefull

> Persistence: Operational data is stored on data volumes backed by local disk and memory. High availability is achieved through replicating data across servers. Critical components like MariaDB and MongoDB offer builtin replication capabilities. Long term persistent data is moved to object storage backend such as Amazon S3 and Minio.

Conclusion
To summarize, Application containers which includes application binaries remains stateless. The application state data is comprised of two types - semi persistent operational data and persistent long term data. Operational data uses memory and local disk. *Long term data is stored on object storage*. Each application instance is a self contained eco-system of computing and storage*. Micro storage makes storage become part of the application stack.* Infrastructure is reduced to containers running on commodity servers with local disks.