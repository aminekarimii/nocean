package data

import data.model.Feed
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

val BASE_URL = "TODO"

data class NotionCategory(
    val id: String,
    val name: String,
    val description: String,
    val image: String,
    val color: String,
)

interface NoceanNetworkDataSource {
    suspend fun getCategories(): List<NotionCategory>
    suspend fun getFeed(): Feed
}

class NoceanNetworkDataSourceImpl @OptIn(ExperimentalSerializationApi::class) constructor(
    private val client: HttpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                explicitNulls = false
                encodeDefaults = false
                ignoreUnknownKeys = true
                isLenient = true
                useAlternativeNames = false
            })
        }
        install(Logging)
    }
) : NoceanNetworkDataSource {
    override suspend fun getCategories(): List<NotionCategory> {
        TODO("")
    }

    override suspend fun getFeed(): Feed {
        return client.get(BASE_URL) {
            contentType(ContentType.Application.Json)
        }
            .body<Feed>()
    }
}

