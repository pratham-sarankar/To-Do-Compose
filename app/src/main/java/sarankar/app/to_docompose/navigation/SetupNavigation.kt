package sarankar.app.to_docompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import sarankar.app.to_docompose.navigation.destinations.taskComposable
import sarankar.app.to_docompose.navigation.destinations.listComposable
import sarankar.app.to_docompose.util.Constants

@Composable
fun SetupNavigation(
    navController: NavHostController,
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(navController = navController, startDestination = Constants.LIST_SCREEN){
        listComposable(){
            screen.task
        }
        taskComposable(){
            screen.list
        }
    }
}