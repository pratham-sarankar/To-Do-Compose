package sarankar.app.to_docompose.data.repositories

import kotlinx.coroutines.flow.Flow
import sarankar.app.to_docompose.data.ToDoDao
import sarankar.app.to_docompose.data.models.ToDoTask
import javax.inject.Inject


class ToDoRepository @Inject constructor(
    private val toDoDao: ToDoDao
) {
    val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTasks()
    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return toDoDao.getSelectedTask(taskId)
    }

    suspend fun updateTask(toDoTask: ToDoTask){
        toDoDao.updateTask(toDoTask)
    }
    suspend fun deleteTask(toDoTask: ToDoTask){
        toDoDao.deleteTask(toDoTask)
    }

    suspend fun deleteAllTasks(){
        toDoDao.deleteAllTasks()
    }

    fun searchDatabase(searchQuery: String): Flow<List<ToDoTask>> {
        return toDoDao.searchDatabase(searchQuery)
    }

}