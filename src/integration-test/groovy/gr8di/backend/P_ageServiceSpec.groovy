package gr8di.backend

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class P_ageServiceSpec extends Specification {

    P_ageService pageService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new P_age(...).save(flush: true, failOnError: true)
        //new P_age(...).save(flush: true, failOnError: true)
        //P_age p_age = new P_age(...).save(flush: true, failOnError: true)
        //new P_age(...).save(flush: true, failOnError: true)
        //new P_age(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //p_age.id
    }

    void "test get"() {
        setupData()

        expect:
        pageService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<P_age> pageList = pageService.list(max: 2, offset: 2)

        then:
        pageList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        pageService.count() == 5
    }

    void "test delete"() {
        Long pageId = setupData()

        expect:
        pageService.count() == 5

        when:
        pageService.delete(pageId)
        sessionFactory.currentSession.flush()

        then:
        pageService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        P_age page = new P_age()
        pageService.save(page)

        then:
        page.id != null
    }
}