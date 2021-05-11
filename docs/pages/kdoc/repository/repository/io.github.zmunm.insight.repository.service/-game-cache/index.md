---
title: GameCache -
---
//[repository](../../../index.md)/[io.github.zmunm.insight.repository.service](../index.md)/[GameCache](index.md)



# GameCache  
 [androidJvm] interface [GameCache](index.md)   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.zmunm.insight.repository.service/GameCache.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="io.github.zmunm.insight.repository.service/GameCache.Companion///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.zmunm.insight.repository.service/GameCache/getGame/#kotlin.Int/PointingToDeclaration/"></a>[getGame](get-game.md)| <a name="io.github.zmunm.insight.repository.service/GameCache/getGame/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [getGame](get-game.md)(id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Flow<Game>  <br><br><br>|
| <a name="io.github.zmunm.insight.repository.service/GameCache/getGames/#/PointingToDeclaration/"></a>[getGames](get-games.md)| <a name="io.github.zmunm.insight.repository.service/GameCache/getGames/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [getGames](get-games.md)(): Flow<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<Game>>  <br><br><br>|
| <a name="io.github.zmunm.insight.repository.service/GameCache/hasGame/#kotlin.Int#kotlin.Long/PointingToDeclaration/"></a>[hasGame](has-game.md)| <a name="io.github.zmunm.insight.repository.service/GameCache/hasGame/#kotlin.Int#kotlin.Long/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract suspend fun [hasGame](has-game.md)(id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), timeout: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) = FRESH_TIMEOUT): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>|
| <a name="io.github.zmunm.insight.repository.service/GameCache/insertAll/#kotlin.collections.List[io.github.zmunm.insight.entity.Game]/PointingToDeclaration/"></a>[insertAll](insert-all.md)| <a name="io.github.zmunm.insight.repository.service/GameCache/insertAll/#kotlin.collections.List[io.github.zmunm.insight.entity.Game]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract suspend fun [insertAll](insert-all.md)(games: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<Game>)  <br><br><br>|
| <a name="io.github.zmunm.insight.repository.service/GameCache/putGame/#io.github.zmunm.insight.entity.Game/PointingToDeclaration/"></a>[putGame](put-game.md)| <a name="io.github.zmunm.insight.repository.service/GameCache/putGame/#io.github.zmunm.insight.entity.Game/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract suspend fun [putGame](put-game.md)(game: Game)  <br><br><br>|

