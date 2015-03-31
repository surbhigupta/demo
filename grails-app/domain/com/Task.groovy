package com

class Task {
String name
int dueDate
String description
    User user
    Project project
    static belongsTo = [user:User,project:Project]



    static constraints = {
        name()
        dueDate()
        description()
    }
}
