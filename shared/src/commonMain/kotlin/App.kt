import androidx.compose.runtime.Composable
import home.HomeRoute
import home.HomeScreen
import theme.NOTheme

@Composable
fun App() {
    NOTheme {
        HomeRoute()
    }
}

expect fun getPlatformName(): String