# akka-cluster-minimal

Akka Cluster ... pretty minimal setup ... the awesome Management Http Api is included 

Run seed node:

```
sbt run # default management.port = 19999
```

Run second node:

```
sbt run -Dclustering.port=2552 -Dmanagement.port=20000
```

Run third node:

```
sbt run -Dclustering.port=2553 -Dmanagement.port=20001
```

And so on

Access API via ```curl```

```
$ curl -XGET http://127.0.0.1:19999/members | python -mjson.tool
$ curl -XGET http://127.0.0.1:20000/members | python -mjson.tool
$ curl -XGET http://127.0.0.1:20001/members | python -mjson.tool 
etc
```