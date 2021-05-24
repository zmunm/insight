package io.github.zmunm.insight.service.impl

/* TODO
class GameServiceImplSpec : GameServiceSpec({ url ->
    fun newRequestQueueForTest(context: Context): RequestQueue {
        val cacheDir = File(context.cacheDir, "volley")
        val network: Network = BasicNetwork(object : BaseHttpStack() {
            override fun executeRequest(
                request: Request<*>?,
                additionalHeaders: MutableMap<String, String>?,
            ): HttpResponse? = null
        })
        val responseDelivery: ResponseDelivery =
            ExecutorDelivery(Executors.newSingleThreadExecutor())
        val queue = RequestQueue(
            DiskBasedCache(cacheDir),
            network,
            4,
            responseDelivery)
        queue.start()
        return queue
    }
    mockkStatic(Log::class)
    every { Log.isLoggable(any(), any()) } returns false
    mockkStatic(TextUtils::class)
    every { TextUtils.isEmpty(any())} returns false
    GameServiceImpl(
        GameApi(
            mockk(),
            //newRequestQueueForTest(ApplicationProvider.getApplicationContext()),
            url,
            "KEY"
        )
    )
})
*/
