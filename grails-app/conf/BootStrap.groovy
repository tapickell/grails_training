import tekdays.TekEvent

class BootStrap {

    def init = { servletContext ->

        def event1 = new TekEvent(name: 'Groovy One',
                                    city: 'San Francisco, CA',
                                    organizer: 'John Doe',
                                    venue: 'Moscone Center',
                                    startDate: new Date('6/2/2014'),
                                    endDate: new Date('6/5/2014'),
                                    description: 'This conference will cover...')
        if (!event1.save()){
            event1.errors.allErrors.each { error -> println "An error ocured with event1: ${error}" }
        }

        def event2 = new TekEvent(name: 'Ruby Fest',
                                  city: 'Saint Louis, MO',
                                  organizer: 'Jane Doe',
                                  venue: 'TBD',
                                  startDate: new Date('9/19/2013'),
                                  endDate: new Date('9/21/2013'),
                                  description: '''This conference will bring together Rubyists
                                                  like never before. It will be awesome.''')
        if (!event2.save()){
            event2.errors.allErrors.each { error -> println "An error occured with event2: ${error}" }
        }
    }
    def destroy = {
    }
}
