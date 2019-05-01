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

    val address = "https://weather.gc.ca/rss/city/on-118_e.xml"


}