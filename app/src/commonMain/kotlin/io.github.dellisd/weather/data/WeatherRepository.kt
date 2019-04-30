package io.github.dellisd.weather.data

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.http.Url
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

internal expect val ApplicationDispatcher: CoroutineDispatcher

class WeatherRepository {
    private val client = HttpClient()

    val address = Url("https://weather.gc.ca/rss/city/on-118_e.xml")

    fun getFeed(callback: (String) -> Unit) {
        GlobalScope.apply {
            launch(ApplicationDispatcher) {
                val result: String = client.get {
                    url(this@WeatherRepository.address.toString())
                }

                callback(result)
            }
        }
    }
}