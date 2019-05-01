package io.github.dellisd.weather.data

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class WeatherApi {
    private val client = HttpClient()

    suspend fun getFeed(address: String): String {
        return client.get {
            url(address)
        }
    }
}