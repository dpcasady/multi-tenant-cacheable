package org.grails

import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import org.grails.datastore.mapping.multitenancy.resolvers.SystemPropertyTenantResolver
import spock.lang.Specification

@Rollback
@Integration
class MultiTenantCachingServiceSpec extends Specification {

    BasicCachingService basicCachingService
    MultiTenantCachingService multiTenantCachingService

    void setupSpec() {
        System.setProperty(SystemPropertyTenantResolver.PROPERTY_NAME, "ds2")
    }

    void "basic service method with @Cacheable annotation doesn't throw an exception"() {
        when:
        basicCachingService.serviceMethod()

        then:
        1
    }

    void "multi-tenant service method with @Cacheable annotation doesn't throw an exception"() {
        when:
        multiTenantCachingService.serviceMethod()

        then:
        1
    }
}
