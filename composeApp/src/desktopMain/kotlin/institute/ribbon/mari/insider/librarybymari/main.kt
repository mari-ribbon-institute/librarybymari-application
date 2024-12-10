package institute.ribbon.mari.insider.librarybymari

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "librarybymari",
    ) {
        App()
    }
}