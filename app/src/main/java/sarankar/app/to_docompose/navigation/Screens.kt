package sarankar.app.to_docompose.navigation

import androidx.navigation.NavController
import androidx.navigation.NavHostController
import sarankar.app.to_docompose.util.Action
import sarankar.app.to_docompose.util.Constants

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(Constants.LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit ={ taskId->
        navController.navigate("task/$taskId")
    }
}