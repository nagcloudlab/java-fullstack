"use strict";

/*

  Todo-App

  Model
  -------
    
  - todo

        id : number
        title : string
        isCompleted: false
        createdAt  : date
        scheduleAt : date


  Use cases
  -----------

    - addTodo(title)
    - editTodo(id,newTitle)
    - deletedTodo(id)
    - clearCompleted()
    - completeTodo(id)
    - completeAll()
    - viewTodos(ALL|ACTIVE|COMPLETED|TODAY|WEEK|MONTH)


*/

class Todo {
  static nextId = 0;
  constructor(title) {
    Todo.nextId++;
    this.id = Todo.nextId;
    this.title = title;
    this.isCompleted = false;
    this.createdAt = new Date().toLocaleDateString();
  }
}

class TodoService {
  todos = [];
  addTodo(title) {
    const todo = new Todo(title);
    // this.todos.push(todo);

    this.todos = this.todos.concat(todo);
  }
  editTodo(id, newTitle) {
    // const todo = this.todos.find((todo) => todo.id === id);
    // todo.title = newTitle;

    this.todos = this.todos.map((todo) =>
      todo.id === id ? { ...todo, title: newTitle } : todo
    );
  }
  deleteTodo(id) {
    // const idx = this.todos.findIndex((todo) => todo.id === id);
    // this.todos.splice(idx, 1);

    this.todos = this.todos.filter((todo) => todo.id !== id);
  }
  clearCompleted() {
    // const completedTodos = this.todos.filter((todo) => todo.isCompleted);
    // completedTodos.forEach((todo) => {
    //   let idx = this.todos.findIndex((t) => t.id === todo.id);
    //   this.todos.splice(idx, 1);
    // });

    this.todos = this.todos.filter((todo) => !todo.isCompleted);
  }
  completeTodo(id) {
    // const todo = this.todos.find((todo) => todo.id === id);
    // todo.isCompleted = !todo.isCompleted;

    this.todos = this.todos.map((todo) =>
      todo.id === id ? { ...todo, isCompleted: !todo.isCompleted } : todo
    );
  }
  completeAll() {
    const areAllCompleted = this.todos.every((todo) => todo.isCompleted);

    // this.todos.forEach((todo) => {
    //   todo.isCompleted = !areAllCompleted;
    // });

    this.todos = this.todos.map((todo) => ({
      ...todo,
      isCompleted: !areAllCompleted,
    }));
  }
  viewTodos(flag = "ALL") {
    this.todos.filter(todoFilters[flag]).forEach((todo) => console.log(todo));
  }
}

const todoFilters = {
  ALL: () => true,
  ACTIVE: (todo) => !todo.isCompleted,
  COMPLETED: (todo) => todo.isCompleted,
  CREATED_TODAY: (todo) => todo.createdAt === new Date().toLocaleDateString(),
};

const todoService = new TodoService();
todoService.addTodo("item-1");
todoService.addTodo("item-2");
todoService.addTodo("item-3");

// todoService.editTodo(2, "item-two");
// todoService.deleteTodo(1);

todoService.completeTodo(2);
todoService.completeTodo(3);

todoService.clearCompleted();

// todoService.completeAll();

todoService.viewTodos();
// todoService.viewTodos("ACTIVE");
// todoService.viewTodos("COMPLETED");
// todoService.viewTodos("CREATED_TODAY");
