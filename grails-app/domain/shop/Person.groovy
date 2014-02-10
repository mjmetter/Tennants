package shop

import grails.plugin.multitenant.core.annotation.MultiTenant

@MultiTenant
class Person {

    String firstName
    String lastName

    static constraints = {
        firstName blank: false
        lastName blank: false
    }
}
