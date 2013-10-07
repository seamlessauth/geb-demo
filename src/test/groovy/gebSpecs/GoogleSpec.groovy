package gebSpecs

import spock.lang.*
import geb.*
import geb.spock.*
import utils.commonlib

class GoogleSpec extends GebReportingSpec {

   def cl = new commonlib()

    def "the first link should be wikipedia"() {
        when:
        to GoogleHomePage

        and:
        def searchString = cl.getRandomText()
        q = searchString

        then:
        at GoogleResultsPage

        and:
        firstResultLink.text() == searchString

        when:
        firstResultLink.click()

        then:
        waitFor { at WikipediaPage }
    }

}