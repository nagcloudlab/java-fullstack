
import 'bootstrap/dist/css/bootstrap.css'
import Todo from '../model/Todo';

import TodoService from '../service/TodoService';

// --------------------------------------
// --------------------------------------

const todoService = new TodoService()
todoService.addTodo("Title-1")
todoService.addTodo("Title-2")
todoService.addTodo("Title-3")


//---------------------------------------
// using DOM api
//---------------------------------------

// ------------------------------
// Query DOM Elements
// ------------------------------


const newInpEle = document.getElementById("new-input");
const todosBodyEle = document.getElementById("todos-body");
const completeAllBtn = document.getElementById("complete-all");
const footerEle = document.getElementById("footer");
const clearCompletedBtn = document.getElementById("clear-completed");


// ------------------------------
// Bind Event Listeners
// ------------------------------


newInpEle.addEventListener("keyup", (e: any) => {
    if (e.key !== "Enter") return;
    let title = e.target.value;
    todoService.addTodo(title);
    e.target.value = "";
    renderTodos(todoService.getTodos("ALL"));
});



todosBodyEle.addEventListener("click", (e: any) => {
    const todoId = Number.parseInt(e.target.dataset["id"]);
    const action = e.target.dataset["action"];
    if (action === "complete") {
        todoService.completeTodo(todoId);
    }
    if (action === "delete") {
        todoService.deleteTodo(todoId);
    }
    renderTodos(todoService.getTodos("ALL"));
});


clearCompletedBtn.addEventListener("click", (e) => {
    todoService.clearCompleted();
    renderTodos(todoService.getTodos("ALL"));
});

completeAllBtn.addEventListener("click", (e) => {
    todoService.completeAll();
    renderTodos(todoService.getTodos("ALL"));
});

footerEle.addEventListener("click", (e:any) => {
    let targetId = e.target.id;
    if (targetId === "view-all") renderTodos(todoService.getTodos("ALL"));
    if (targetId === "view-active") renderTodos(todoService.getTodos("ACTIVE"));
    if (targetId === "view-completed") renderTodos(todoService.getTodos("COMPLETED"));
});


// ------------------------------
// Render
// ------------------------------

function renderTodos(todos: Array<Todo>) {
    const trElements = todos.map((todo) => {
        const trEle = `
                  <tr class="${todo.completed ? "bg-success" : ""}">
                      <td><input data-action="complete" data-id=${todo.id
            } type="checkbox" ${todo.completed ? "checked" : ""} /></td>
                      <td>${todo.title}</td>
                      <td><button data-action="delete" data-id=${todo.id
            }>delete</button></td>
                  </tr>
              `;
        return trEle;
    });

    todosBodyEle.innerHTML = trElements.join(" ");
}

renderTodos(todoService.getTodos("ALL"));