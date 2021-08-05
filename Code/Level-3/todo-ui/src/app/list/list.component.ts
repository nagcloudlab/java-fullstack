import { Component, OnInit } from '@angular/core'
import { Todo } from '../todo'
import TodoService from '../todo.service'

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css'],
})
export class ListComponent implements OnInit {
  constructor(private todoService: TodoService) {}

  todos: Array<Todo> = []

  ngOnInit(): void {
    this.todoService.todosStream.subscribe((todos) => {
      this.todos = todos
    })
  }

  handleCompleteAll() {
    this.todoService.completeAll()
  }
}
