console.log("-index.js-");

// -----------------------------------------------
// using DOM
// -----------------------------------------------

/*

 steps working with DOM api

 step-1 : query required DOM element(s)
 step-2 : bind event listener to DOM elements, on event we should react


*/

// const greetBtn=document.getElementById('greet-btn')
// const box=document.getElementsByClassName('box')[0]

const greetBtn = document.querySelector("#greet-btn");
const hideBtn = document.querySelector("#hide-btn");
const showBtn = document.querySelector("#show-btn");
const box = document.querySelector(".box");

greetBtn.addEventListener("click", (e) => {
  box.innerText = "good evening";
});

hideBtn.addEventListener("click", (e) => {
  box.style.display = "none";
});
showBtn.addEventListener("click", (e) => {
  box.style.display = "";
});

// -----------------------------------------------
// using DOM + Timer
// -----------------------------------------------

const images = [
  "./images/1.jpeg",
  "./images/2.jpeg",
  "./images/3.jpeg",
  "./images/4.jpeg",
  "./images/5.jpeg",
];

const startBtn = document.getElementById("start-btn");
const stopBtn = document.getElementById("stop-btn");
const imgEle = document.getElementById("po-img");

stopBtn.disabled = true;

startBtn.addEventListener("click", (e) => {
  startBtn.disabled = true;
  stopBtn.disabled = false;
  let idx = 0;
  const iterval = setInterval(() => {
    idx++;
    let newImage = images[idx];
    imgEle.src = newImage;
    if (idx === images.length - 1) idx = -1;
  }, 1000);

  stopBtn.addEventListener("click", (e) => {
    clearInterval(iterval);
    startBtn.disabled = false;
    stopBtn.disabled = true;
  });
});


// -----------------------------------------------
// using DOM + XHR / Fetch api
// -----------------------------------------------

const top5TodosBtn=document.getElementById('top5-todos-btn');
const todoList=document.getElementById('todos')

top5TodosBtn.addEventListener('click',e=>{


    const url="https://jsonplaceholder.typicode.com/todos?_limit=5"
    const promise=fetch(url)
    promise
    .then(response=>response.json())
    .then(todos=>{
        
        const liElements=todos.map(todo=>{
            const liEle=`
                <li style="color:${todo.completed?'red':''}">${todo.id} ${todo.title} - ${todo.completed}</li>
            `
            return liEle;
        })

        todoList.innerHTML=liElements.join(" ")

    })


})