package gr8di.backend

import grails.rest.*

@Resource(uri='/messages', formats=['json', 'xml'])
class Message {

    String senderEmail
    String topic
    String messageBody
    Date dateSent = new Date()
    Status status
  
        static constraints = {
        senderEmail email: true
    }
}