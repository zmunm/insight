---
title: GameRepository -
---
//[usecase](../../../index.md)/[io.github.zmunm.insight.repository](../index.md)/[GameRepository](index.md)



# GameRepository  
 [jvm] interface [GameRepository](index.md)   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.zmunm.insight.repository/GameRepository/getGameDetail/#kotlin.Int/PointingToDeclaration/"></a>[getGameDetail](get-game-detail.md)| <a name="io.github.zmunm.insight.repository/GameRepository/getGameDetail/#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [getGameDetail](get-game-detail.md)(id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Flow<Game>  <br><br><br>|
| <a name="io.github.zmunm.insight.repository/GameRepository/getGames/#kotlin.Int?/PointingToDeclaration/"></a>[getGames](get-games.md)| <a name="io.github.zmunm.insight.repository/GameRepository/getGames/#kotlin.Int?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract suspend fun [getGames](get-games.md)(page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<Game>  <br><br><br>|
| <a name="io.github.zmunm.insight.repository/GameRepository/getRecentGames/#/PointingToDeclaration/"></a>[getRecentGames](get-recent-games.md)| <a name="io.github.zmunm.insight.repository/GameRepository/getRecentGames/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [getRecentGames](get-recent-games.md)(): Flow<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<Game>>  <br><br><br>|
| <a name="io.github.zmunm.insight.repository/GameRepository/insertAll/#kotlin.collections.List[io.github.zmunm.insight.entity.Game]/PointingToDeclaration/"></a>[insertAll](insert-all.md)| <a name="io.github.zmunm.insight.repository/GameRepository/insertAll/#kotlin.collections.List[io.github.zmunm.insight.entity.Game]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract suspend fun [insertAll](insert-all.md)(games: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<Game>)  <br><br><br>|

