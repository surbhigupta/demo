package com

class Project {
    String name
    int dueDate
    String description
    User user
    static belongsTo = [user:User]
    static hasMany = [task:Task]

    static constraints = {
        name()
        dueDate()
        description()
    }
}
