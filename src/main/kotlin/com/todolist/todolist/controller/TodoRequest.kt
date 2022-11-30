package com.todolist.todolist.controller

//코틀린은 data class가 있는데 게터나 세터 tostring equals hashcode같은 롬복을 dto역할 하는것을 만들어 줄 수 있음 json으로 만들어줌
data class TodoRequest (val todoName: String)