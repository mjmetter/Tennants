package shop

import grails.plugin.multitenant.core.resolve.TenantResolver
import grails.plugin.multitenant.core.exception.TenantResolveException
import javax.servlet.http.HttpServletRequest

/**
 * TODO: Implement me!
 *
 * @see http://multi-tenant.github.com/grails-multi-tenant-single-db/
 */
class DomainTenantResolver implements TenantResolver {

    Integer resolve(HttpServletRequest request) throws TenantResolveException {
        String host = request.getServerName()
//        switch (host) {
//            case "john.greatapp.com":
//                return 1
//            case "mary.greatapp.com":
//                return 2
//            case "paul.greatapp.com":
//                return 3
//
//            default:
//                // WARNING: Returning null will disable the Hibernate filter
//                // don't do this unless you know what you're doing!
//                return null
//        }
        println "host: $host"
        return 1
    }
}
