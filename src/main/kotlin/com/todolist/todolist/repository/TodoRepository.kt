package com.todolist.todolist.repository

import org.springframework.data.repository.CrudRepository

//Long 같은것은 Primary Key의 타입을 넣어야하는듯 Todo의 데이터를 조작할수 있는 Interface
interface TodoRepository : CrudRepository<Todo, Long>