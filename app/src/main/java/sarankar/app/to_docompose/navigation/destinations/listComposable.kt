package sarankar.app.to_docompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import sarankar.app.to_docompose.ui.screens.list.ListScreen
import sarankar.app.to_docompose.util.Constants

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (Int) -> Unit
){
    composable(
        route = "list/{action}",
        arguments = listOf(
            navArgument(Constants.LIST_ARGUMENT_KEY){
                type = NavType.StringType
            }
        )
    ){
        ListScreen {
            navigateToTaskScreen(it)
        }
    }

}