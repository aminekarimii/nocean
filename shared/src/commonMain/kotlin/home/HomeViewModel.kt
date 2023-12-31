package home

import data.NoceanNetworkDataSourceImpl
import data.model.Feed
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn

class HomeViewModel : ViewModel() {
    val cats = this.getCats().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000L),
        initialValue = null
    )

    val categories = MutableStateFlow(
        mutableListOf(
            Category("1", "Productivity", "Notion Templates"),
            Category("2", "Design", "Notion Templates"),
            Category("3", "Education", "Notion Templates"),
            Category("4", "Health", "Notion Templates"),
            Category("5", "Finance", "Notion Templates"),
            Category("6", "Travel", "Notion Templates"),
            Category("7", "Technology", "Notion Templates"),
            Category("8", "Food", "Notion Templates"),
            Category("9", "Sports", "Notion Templates"),
            Category("10", "Home", "Notion Templates"),
            Category("11", "Entertainment", "Notion Templates"),
            Category("12", "Hobbies", "Notion Templates")
        )
    )

    fun getCats(): Flow<Feed> {
        return flow {
            NoceanNetworkDataSourceImpl().getFeed()
        }
    }
}
