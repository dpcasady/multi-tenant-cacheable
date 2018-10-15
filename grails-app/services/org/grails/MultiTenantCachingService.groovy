package org.grails

import grails.gorm.multitenancy.CurrentTenant
import grails.gorm.transactions.Transactional
import grails.plugin.cache.Cacheable


@CurrentTenant
@Transactional(readOnly = true)
class MultiTenantCachingService {

    @Cacheable('test')
    def serviceMethod() {

    }
}
