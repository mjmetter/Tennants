// Place your Spring DSL code here
beans = {
    tenantResolver shop.DomainTenantResolver
    tenantRepository shop.CachingTenantRepository

}


// Activate these bean definitions
// Documentation http://grails.org/doc/latest/guide/single.html#14.2%20Configuring%20Additional%20Beans
// tenantResolver(shop.DomainTenantResolver)
// tenantRepository(shop.CachingTenantRepository)
