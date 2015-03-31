package com

class User {
String name
String password
int age
static hasMany = [task:Task,project:Project]
    static constraints = {
        name(nullable: false,blank: false)
        password(nullable: false,blank: false)
        age(nullable: false,blank: false)
    }
}
