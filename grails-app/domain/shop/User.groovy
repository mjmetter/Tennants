package shop

import grails.plugin.multitenant.core.Tenant

/**
 * TODO: Implement me!
 *
 * @see http://multi-tenant.github.com/grails-multi-tenant-single-db/
 */
class User implements Tenant {

    String name

    static constraints = {
        name blank: false, unique: true
    }

    Integer tenantId() {
        id
    }
}
