package firestorm.vuth.todolist.service

import firestorm.vuth.todolist.model.Todo
import org.springframework.data.domain.Page

interface TodoService {
    fun findAll(page: Int, limit: Int): Page<Todo>
    fun findById(id: Long): Todo
    fun createTodo(todo: Todo): Todo
    fun updateTodo(id: Long, todo: Todo): Todo
    fun deleteTodo(id: Long)
}