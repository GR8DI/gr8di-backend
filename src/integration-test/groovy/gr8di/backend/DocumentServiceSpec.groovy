package gr8di.backend

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DocumentServiceSpec extends Specification {

    DocumentService documentService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Document(...).save(flush: true, failOnError: true)
        //new Document(...).save(flush: true, failOnError: true)
        //Document document = new Document(...).save(flush: true, failOnError: true)
        //new Document(...).save(flush: true, failOnError: true)
        //new Document(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //document.id
    }

    void "test get"() {
        setupData()

        expect:
        documentService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Document> documentList = documentService.list(max: 2, offset: 2)

        then:
        documentList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        documentService.count() == 5
    }

    void "test delete"() {
        Long documentId = setupData()

        expect:
        documentService.count() == 5

        when:
        documentService.delete(documentId)
        sessionFactory.currentSession.flush()

        then:
        documentService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Document document = new Document()
        documentService.save(document)

        then:
        document.id != null
    }
}
