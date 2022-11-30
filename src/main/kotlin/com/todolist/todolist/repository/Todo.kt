package com.todolist.todolist.repository

import org.hibernate.annotations.ColumnDefault
import javax.persistence.*

//Entity는 Database Table과 맵핑하는 코틀린 클래스
@Entity
class Todo (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    @ColumnDefault("false")
    var completed: Boolean = false,

    @Column(nullable = false)
    var todoName: String
)