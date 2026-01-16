package firestorm.vuth.todolist.controller

import firestorm.vuth.todolist.dto.response.PageResponse
import firestorm.vuth.todolist.model.Todo
import firestorm.vuth.todolist.service.TodoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("/api/todos")
class TodoController(
    private val todoService: TodoService
) {

    @GetMapping
    fun getAll(
        @RequestParam(defaultValue = "1") page: Int,
        @RequestParam(defaultValue = "10") limit: Int,
    ): ResponseEntity<PageResponse<Todo>> {
        val todos = todoService.findAll(page, limit)

        val response = PageResponse(
            todos.content,
            page,
            limit,
            todos.totalPages,
        )

        return ResponseEntity.ok(response)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<Todo> {
        return ResponseEntity.ok(todoService.findById(id))
    }

    @PostMapping
    fun createTodo(@RequestBody request: Todo): ResponseEntity<Todo> {
        return ResponseEntity.status(HttpStatus.CREATED).body(todoService.createTodo(request))
    }

    @PutMapping("/{id}")
    fun updateTodo(@PathVariable id: Long, @RequestBody todo: Todo): ResponseEntity<Todo> {
        return ResponseEntity.status(HttpStatus.OK).body(todoService.updateTodo(id, todo))
    }

    @DeleteMapping
    fun deleteTodo(@PathVariable id: Long): ResponseEntity<Any> {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(todoService.deleteTodo(id))
    }
}