// const TodoService = require("./TodoService");
// or
import TodoService from './TodoService'

const service = new TodoService();
service.addTodo("Title-1");
service.addTodo("Title-2");
service.addTodo("Title-3");

//---------------------------------------
// query DOM Elements
//---------------------------------------

const newInpEle = document.getElementById("new-input");
const todosBodyEle = document.getElementById("todos-body");
const clearCompletedBtn = document.getElementById("clear-completed");
const completeAllBtn = document.getElementById("complete-all");
const footerEle = document.getElementById("footer");

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

clearCompletedBtn.addEventListener("click", (e) => {
  service.clearCompleted();
  renderTodos(service.getTodos("ALL"));
});

completeAllBtn.addEventListener("click", (e) => {
  service.completeAll();
  renderTodos(service.getTodos("ALL"));
});

footerEle.addEventListener("click", (e) => {
  let targetId = e.target.id;
  if (targetId === "view-all") renderTodos(service.getTodos("ALL"));
  if (targetId === "view-active") renderTodos(service.getTodos("ACTIVE"));
  if (targetId === "view-completed") renderTodos(service.getTodos("COMPLETED"));
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
