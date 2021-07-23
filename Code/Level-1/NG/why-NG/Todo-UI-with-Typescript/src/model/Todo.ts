


class Todo {
    static nextId = 0;
    id: number
    title: string
    completed: boolean = false
    constructor(title: string) {
        this.id = ++Todo.nextId;
        this.title = title;
    }
}

export default Todo;