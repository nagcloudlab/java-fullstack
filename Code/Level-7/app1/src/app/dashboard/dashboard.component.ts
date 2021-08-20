import { Component, OnInit } from '@angular/core';
import { TodoService } from '../todo.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  todos = []

  constructor(private todosService: TodoService) { }

  ngOnInit(): void {
  }

  loadTodos() {
    this.todosService.getTodos()
      .subscribe((response: any) => {
        console.log(response);
        this.todos=response
      });
  }

}
