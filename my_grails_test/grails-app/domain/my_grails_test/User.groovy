package my_grails_test

class User {
	String name
	Integer children
	String address

    static constraints = {
		name(blank:false)
		children(min:0, max:15)
		address(blank:false)
    }
}
