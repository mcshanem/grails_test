package my_grails_test

class Room {
	Integer number

    static constraints = {
		number(min:0)
    }
}
