import { Injectable } from '@angular/core'
import { Todo } from './todo'

import { BehaviorSubject } from 'rxjs'

@Injectable({
  providedIn: 'root',
})
export class TodoService {
  todos: Array<Todo> = [
    new Todo('Title-1'),
    new Todo('Title-2'),
    new Todo('Title-3'),
  ]

  leftCount: number = this.todos.length

  todosStream: BehaviorSubject<any> = new BehaviorSubject(this.todos)

  getAllTodos() {
    return this.todos
  }

  addTodo(title: string) {
    const todo = new Todo(title)
    this.todos = this.todos.concat(todo)
    this.todosStream.next(this.todos)
  }

  deleteTodo(id: number) {
    this.todos = this.todos.filter((todo) => todo.id !== id)
    this.leftCount = this.todos.length
    this.todosStream.next(this.todos)
  }

  clearCompleted() {
    this.todos = this.todos.filter((todo) => !todo.completed)
    this.todosStream.next(this.todos)
  }

  completeTodo(id: number) {
    this.todos = this.todos.map((todo: any) => {
      let tdo = todo.id === id ? { ...todo, completed: !todo.completed } : todo
      return tdo
    })
    this.todosStream.next(this.todos)
  }

  completeAll() {
    let areAllCompleted = this.todos.every((todo) => todo.completed)
    this.todos = this.todos.map((todo) => {
      todo.completed = !areAllCompleted
      return todo
    })
    this.todosStream.next(this.todos)
  }

  filterTodos(filter = 'ALL') {
    let todos = this.todos
    if (filter === 'ACTIVE')
      todos = this.todos.filter((todo) => !todo.completed)
    if (filter === 'COMPLETED')
      todos = this.todos.filter((todo) => todo.completed)
    this.todosStream.next(todos)
  }
}

export default TodoService
