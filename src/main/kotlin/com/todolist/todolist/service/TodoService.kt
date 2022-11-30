package com.todolist.todolist.service

import com.todolist.todolist.repository.Todo
import com.todolist.todolist.repository.TodoRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

//todoList의 로직
@Service
class TodoService(
        private val todoRepository: TodoRepository
) {
    fun getTodos() = todoRepository.findAll()

    //save 파라미터에 저렇게 넣어주면 새로운 데이터 리턴할거 : Todo이런식
    fun insertTodo(todoName: String): Todo = todoRepository.save(Todo(todoName = todoName))

    //기존에 있는것을 save 파라미터에 저렇게 넣어주면 업데이트
    fun updateTodo(todoId: Long): Todo {
        val todo = todoRepository.findByIdOrNull(todoId) ?: throw Exception()
        todo.completed = !todo.completed
        return todoRepository.save(todo)
    }

    fun deleteTodo(todoId: Long) = todoRepository.deleteById(todoId)
}