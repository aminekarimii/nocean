package home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory


@Composable
fun HomeRoute() {
    val viewModel: HomeViewModel = getViewModel(Unit, viewModelFactory { HomeViewModel() })
    val categories =
        viewModel.cats.collectAsState().value?.pageProps?.featuredTemplateCategoriesResponse?.map {
            Category(
                id = it.title,
                name = it.title,
                icon = it.notionIcon
            )
        }?.toMutableList()

    HomeScreen(categories = categories ?: mutableListOf())
}

@Composable
fun HomeScreen(categories: MutableList<Category>) {

    Scaffold(
        modifier = Modifier.padding(16.dp),
        topBar = {
            CategoryHeader(categories = categories)
        },
        content = {

        }
    )

}

@Composable
fun CategoryHeader(categories: MutableList<Category>) {
    LazyRow {
        items(categories, key = { it.id }) { category ->
            Card(
                modifier = Modifier.padding(horizontal = 8.dp).clickable { },
                shape = MaterialTheme.shapes.medium,
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
            ) {
                Column(
                    modifier = Modifier.size(100.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        modifier = Modifier.widthIn(min = 48.dp),
                        imageVector = Icons.Default.Star,
                        contentDescription = null
                    )

                    Text(text = category.name)
                }
            }
        }

    }
}


data class Category(
    val id: String,
    val name: String,
    val icon: String
)