// ---------------------------------------
// Model
// ---------------------------------------

class Todo {
  static nextId = 0;
  constructor(title) {
    Todo.nextId++;
    this.id = Todo.nextId;
    this.title = title;
    this.completed = false;
  }
}

// ---------------------------------------
// Service
// ---------------------------------------

class TodoService {
  addTodo(title) {}
  editTodo(id, newTitle) {}
  completeTodo(id) {}
  completeAll() {}
  deleteTodo(id) {}
  clearCompleted() {}
  viewTodos(flag) {}
}

// ---------------------------------------

const todoService = new TodoService();

todoService.addTodo("item-1");
todoService.addTodo("item-2");
todoService.editTodo(2, "item-two");
