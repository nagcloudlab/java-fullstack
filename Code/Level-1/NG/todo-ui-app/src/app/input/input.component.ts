import { Component, OnInit } from '@angular/core'
import TodoService from '../todo.service'

@Component({
  selector: 'app-input',
  templateUrl: './input.component.html',
  styleUrls: ['./input.component.css'],
})
export class InputComponent implements OnInit {
  constructor(private todoService: TodoService) {}

  ngOnInit(): void {}

  handleKeyup(event: any) {
    if (event.key !== 'Enter') return
    let title = event.target.value
    if (title) {
      this.todoService.addTodo(title)
      event.target.value = ''
    }
  }
}
