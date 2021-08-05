let nextId = 0

export class Todo {
  id?: number
  title?: string
  completed?: boolean
  constructor(title: string) {
    nextId++
    this.id = nextId
    this.title = title
    this.completed = false
  }
}
