# akka-cluster-minimal
Akka Cluster - absolute minimal

Run seed node:

```
sbt run
```

Run second node:

```
sbt run -Dclustering.port=2552
```

Run third node:

```
sbt run -Dclustering.port=2553
```

And so on
