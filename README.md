# Hello world

Playin' around with the jvm and springboot... 

install docker and enjoy!

```bash
docker compose up  

curl -X POST "http://localhost:8080/api/items?name=Apple"
curl -X POST "http://localhost:8080/api/items?name=Banana"
curl -X GET http://localhost:8080/api/items
curl -X DELETE "http://localhost:8080/api/items?name=Apple"
```
