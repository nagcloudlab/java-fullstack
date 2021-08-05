import { Component, Input, OnInit } from '@angular/core'
import { Todo } from '../todo'
import TodoService from '../todo.service'

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css'],
})
export class ItemComponent implements OnInit {
  @Input('value')
  todo: any

  constructor(private todoService: TodoService) {}

  ngOnInit(): void {}

  handleDelete() {
    this.todoService.deleteTodo(this.todo.id)
  }
  handleComplete() {
    this.todoService.completeTodo(this.todo.id)
  }
}
