# Insight
---

Sample of Android Clean Architecture using Hilt, Startup. 

Assemble the data layer by build flavor.

## API

Insight is using [RAWG api](https://rawg.io/apidocs).
Visit the site to get a `key` and add it to `local.properties` as follows:

```properties
RAWG_KEY={YOUR_KEY}
```

## available flavor

The flavors that can be combined are as follows.

1. cache
    - room
    - realm 
2. service
    - retrofit
    - ktor
    - volley

You can combine it like this.
```shell
gradle assembleRetrofitRoomDebug
```
