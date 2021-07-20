//--------------------------------------
// Using DOM Api
//--------------------------------------

const boxEle = document.getElementById("box");
const gmBtn = document.getElementById("gm");
const gnBtn = document.getElementById("gn");
const geBtn = document.getElementById("ge");

gmBtn.addEventListener("click", (e) => {
  boxEle.innerText = "good morning";
});
gnBtn.addEventListener("click", (e) => {
  boxEle.innerText = "good noon";
});
geBtn.addEventListener("click", (e) => {
  boxEle.innerText = "good evening";
});

//--------------------------------------
// Using DOM Api + XHR api
//--------------------------------------

const top5TodosBtn = document.getElementById("top-5-todos");
const todosListEle = document.getElementById("todos");

const url = "https://jsonplaceholder.typicode.com/todos?_limit=200";

top5TodosBtn.addEventListener("click", (e) => {
  //   withXHRApi();
  withFetchApi();
});

async function withFetchApi() {
  //   const promise = fetch(url);
  //   promise
  //     .then((response) => response.json())
  //     .then((todos) => renderTodos(todos));

  // or

  let response = await fetch(url);
  let todos = await response.json();
  renderTodos(todos);
}

function withXHRApi() {
  const xhr = new XMLHttpRequest();
  xhr.open("GET", url, true);
  xhr.send();
  document.getElementById("progress").innerText = "loading todos..";
  xhr.onreadystatechange = function () {
    console.log(xhr.readyState);
    if (xhr.readyState === 4) {
      document.getElementById("progress").innerText = "";
      const jsonText = xhr.responseText;
      const todos = JSON.parse(jsonText);
      renderTodos(todos);
    }
  };
}

function renderTodos(todos) {
  const liElements = todos.map((todo) => {
    const liEle = `
          <li class="list-group-item ${todo.completed ? "bg-success" : ""}">
              <span class="badge bg-danger">${todo.id}</span>
              <span>${todo.title}</span>
              <span class="badge bg-dark">${
                todo.completed ? "completed" : "in-complete"
              }</span>
          </li>
          `;
    return liEle;
  });

  todosListEle.innerHTML = liElements.join(" ");
}

//--------------------------------------
// usind Timer Api
//--------------------------------------

const timeEle = document.getElementById("time");
setInterval(() => {
  timeEle.innerText = new Date().toLocaleTimeString('en-US',{timeZone:'Asia/Kolkata'});
}, 1000);
