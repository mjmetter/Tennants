import grails.plugin.multitenant.core.Tenant
import shop.PetType
import shop.Speciality
import shop.Vet

class BootStrap {

    def init = { servletContext ->
        def radiology
        def surgery
        def dentistry
        Tenant.withTenantId(1) {
            radiology = new Speciality(name: 'radiology').save(failOnError: true)
            surgery =   new Speciality(name: 'surgery').save(failOnError: true)
            dentistry = new Speciality(name: 'dentistry').save(failOnError: true)

            for (String type in ['dog', 'lizard', 'cat', 'snake', 'bird', 'hamster']) {
                new PetType(name: type).save(failOnError: true)
            }
        }

        1.upto(3) { tenantId ->
            Tenant.withTenantId(tenantId) {
                new Vet(firstName: 'James', lastName: 'Carter').save(failOnError: true)
                new Vet(firstName: 'Helen', lastName: 'Leary')
                        .addToSpecialities(radiology)
                        .save(failOnError: true)
                new Vet(firstName: 'Linda', lastName: 'Douglas')
                        .addToSpecialities(surgery)
                        .addToSpecialities(dentistry)
                        .save(failOnError: true)
                new Vet(firstName: 'Rafael', lastName: 'Ortega')
                        .addToSpecialities(surgery)
                        .save(failOnError: true)
                new Vet(firstName: 'Henry', lastName: 'Stevens')
                        .addToSpecialities(radiology)
                        .save(failOnError: true)
                new Vet(firstName: 'Sharon', lastName: 'Jenkins').save(failOnError: true)
            }
        }
    }
}
