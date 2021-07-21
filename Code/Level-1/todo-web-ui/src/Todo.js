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

// module.exports = Todo; // cjm
// or
export default Todo; // esm
