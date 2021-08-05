import { Component, OnInit } from '@angular/core'
import TodoService from '../todo.service'

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css'],
})
export class FooterComponent implements OnInit {
  constructor(private todoService: TodoService) {}

  todoLeftCount: number = 0
  someCompleted = false

  currentFilter = 'ALL'

  ngOnInit(): void {
    this.todoService.todosStream.subscribe(() => {
      this.todoLeftCount = this.todoService
        .getAllTodos()
        .filter((todo) => !todo.completed).length
      this.someCompleted = this.todoService
        .getAllTodos()
        .some((todo) => todo.completed)
    })
  }

  handleClearCompleted() {
    this.todoService.clearCompleted()
  }
  handleFilter(event: any, flag: string) {
    event.preventDefault()
    this.currentFilter = flag
    this.todoService.filterTodos(this.currentFilter)
  }
}
