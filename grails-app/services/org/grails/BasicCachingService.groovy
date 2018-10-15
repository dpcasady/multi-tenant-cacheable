package org.grails

import grails.gorm.transactions.Transactional
import grails.plugin.cache.Cacheable

@Transactional(readOnly = true)
class BasicCachingService {

    @Cacheable('test')
    def serviceMethod() {

    }
}
