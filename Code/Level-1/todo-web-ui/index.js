


//---------------------------------------
// DOM Elements
//---------------------------------------

const newInpEle = document.getElementById("new-input");
const todosEle=document.getElementById('todos-list')


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
  getTodos(filter = "ALL") {
    if (filter === "ALL") {
      return this.todos;
    }
  }
}

const service = new TodoService();
service.addTodo("Title-1")
service.addTodo("Title-2")
service.addTodo("Title-3")


renderTodos(service.getTodos('ALL'))

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

//----------------------------------------
// render
//----------------------------------------

function renderTodos(todos) {
  const trElements = todos.map((todo) => {
    const trEle = `
                <tr>
                    <td><input type="checkbox" ${todo.completed?'checked':''} /></td>
                    <td>${todo.title}</td>
                    <td><button>delete</button></td>
                </tr>
            `;
    return trEle;
  });

  todosEle.innerHTML = trElements.join(" ");
}
