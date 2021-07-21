//---------------------------------------
// DOM Elements
//---------------------------------------

const newInpEle = document.getElementById("new-input");
const todosBodyEle = document.getElementById("todos-body");

//---------------------------------------
//Model
//---------------------------------------

class Todo {
  static nextId = 0;
  constructor(title) {
    this.id = ++Todo.nextId;
    this.title = title;
    this.completed = false;
  }
}

//---------------------------------------
// Service
//---------------------------------------

class TodoService {
  todos = [];
  addTodo(title) {
    const todo = new Todo(title);
    this.todos = this.todos.concat(todo);
  }
  deleteTodo(id) {
    this.todos = this.todos.filter((todo) => todo.id !== id);
  }
  completeTodo(id) {
    this.todos = this.todos.map((todo) =>
      todo.id === id ? { ...todo, completed: !todo.completed } : todo
    );
    console.log(this.todos);
  }
  getTodos(filter = "ALL") {
    if (filter === "ALL") {
      return this.todos;
    }
  }
}

const service = new TodoService();
service.addTodo("Title-1");
service.addTodo("Title-2");
service.addTodo("Title-3");

renderTodos(service.getTodos("ALL"));

//---------------------------------------
// bind Event Listsner(s)
//---------------------------------------

newInpEle.addEventListener("keyup", (e) => {
  if (e.key !== "Enter") return;
  let title = e.target.value;
  service.addTodo(title);
  e.target.value = "";
  renderTodos(service.getTodos("ALL"));
});

todosBodyEle.addEventListener("click", (e) => {
  const todoId = Number.parseInt(e.target.dataset["id"]);
  const action = e.target.dataset["action"];
  if (action === "complete") {
    service.completeTodo(todoId);
  }
  if (action === "delete") {
    service.deleteTodo(todoId);
  }
  renderTodos(service.getTodos("ALL"));
});

//----------------------------------------
// render
//----------------------------------------

function renderTodos(todos) {
  const trElements = todos.map((todo) => {
    const trEle = `
                <tr class="${todo.completed ? "bg-success" : ""}">
                    <td><input data-action="complete" data-id=${
                      todo.id
                    } type="checkbox" ${todo.completed ? "checked" : ""} /></td>
                    <td>${todo.title}</td>
                    <td><button data-action="delete" data-id=${
                      todo.id
                    }>delete</button></td>
                </tr>
            `;
    return trEle;
  });

  todosBodyEle.innerHTML = trElements.join(" ");
}
