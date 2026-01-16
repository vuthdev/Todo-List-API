package firestorm.vuth.todolist.repository

import firestorm.vuth.todolist.model.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.PagingAndSortingRepository

interface TodoRepo: JpaRepository<Todo, Long>, PagingAndSortingRepository<Todo, Long> {
}