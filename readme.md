**File Handling**

**Assumptions:**

1. CSV file is to be uploaded or fetched or updated in the database
2. H2 in-memory db is used for the storage.
3. As Spring boot facilitates multipart file property, I have used in my project to handle csv files.


**In Local (non-docker env)**

After cloning the repo, Build using the below commands:

    mvn clean install
    mvn clean package
    
Bring the service up by executing the command

    mvn spring-boot:run

**To Test from postman**

Once the service is up Hit the uri from postman or any service testing tool

  http://localhost:8080/api/csv/orders