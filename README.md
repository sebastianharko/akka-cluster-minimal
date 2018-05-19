# akka-cluster-minimal

Akka Cluster ... pretty minimal setup ... 

Run seed node:

```
sbt run # default management.port = 19999
```

Run second node:

```
sbt -Dclustering.port=2553 -Dmanagement.port=20000 run
```

Run third node:

```
sbt -Dclustering.port=2554 -Dmanagement.port=20001 run
```

And so on

Access Akka Management Cluster HTTP via ```curl```

```
$ curl -XGET http://127.0.0.1:19999/cluster/members | python -mjson.tool
$ curl -XGET http://127.0.0.1:20000/cluster/members | python -mjson.tool
$ curl -XGET http://127.0.0.1:20001/cluster/members | python -mjson.tool
etc
```
