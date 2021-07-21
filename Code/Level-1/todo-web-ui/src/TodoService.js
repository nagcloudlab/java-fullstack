
const Todo=require('./Todo')

class TodoService {
  todos = [];
  addTodo(title) {
    const todo = new Todo(title);
    this.todos = this.todos.concat(todo);
  }
  deleteTodo(id) {
    this.todos = this.todos.filter((todo) => todo.id !== id);
  }
  clearCompleted() {
    this.todos = this.todos.filter((todo) => !todo.completed);
  }
  completeTodo(id) {
    this.todos = this.todos.map((todo) =>
      todo.id === id ? { ...todo, completed: !todo.completed } : todo
    );
  }
  completeAll() {
    let areAllCompleted = this.todos.every((todo) => todo.completed);
    this.todos = this.todos.map((todo) => {
      todo.completed = !areAllCompleted;
      return todo;
    });
  }
  getTodos(filter = "ALL") {
    if (filter === "ALL") return this.todos;
    if (filter === "ACTIVE")
      return this.todos.filter((todo) => !todo.completed);
    if (filter === "COMPLETED")
      return this.todos.filter((todo) => todo.completed);
  }
}

module.exports = TodoService;
