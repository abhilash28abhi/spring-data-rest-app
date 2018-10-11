package com.spring.data.rest.bootstrap;

import com.spring.data.rest.domain.Ticket;
import com.spring.data.rest.repositories.TicketRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class BugtrackerApplicationLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Ticket tick1 = new Ticket("Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick2 = new Ticket("Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick3 = new Ticket("Provide a list of applications for users", "The users need this new feature", 2, 1);
        Ticket tick4 = new Ticket("Provide a list of tickets for an application", "The users need this new feature", 2, 1);
        Ticket tick5 = new Ticket("Provide a list of tickets for a given release", "The users need this new feature", 3, 4);
        Ticket tick6 = new Ticket("Give user the ability to add tickets to a release", "The users need this new feature", 4, 5);
        Ticket tick7 = new Ticket("Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick8 = new Ticket("Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick9 = new Ticket("Provide a list of applications for users", "The users need this new feature", 2, 1);
        Ticket tick10 = new Ticket("Provide a list of tickets for an application", "The users need this new feature", 2, 1);
        Ticket tick11 = new Ticket("Provide a list of tickets for a given release", "The users need this new feature", 3, 4);
        Ticket tick12 = new Ticket("Give user the ability to add tickets to a release", "The users need this new feature", 4, 5);
        Ticket tick13 = new Ticket("Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick14 = new Ticket("Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick15 = new Ticket("Provide a list of applications for users", "The users need this new feature", 2, 1);
        Ticket tick16 = new Ticket("Provide a list of tickets for an application", "The users need this new feature", 2, 1);
        Ticket tick17 = new Ticket("Provide a list of tickets for a given release", "The users need this new feature", 3, 4);
        Ticket tick18 = new Ticket("Give user the ability to add tickets to a release", "The users need this new feature", 4, 5);
        Ticket tick19 = new Ticket("Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick20 = new Ticket("Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick21 = new Ticket("Provide a list of applications for users", "The users need this new feature", 2, 1);
        Ticket tick22 = new Ticket("Provide a list of tickets for an application", "The users need this new feature", 2, 1);
        Ticket tick23 = new Ticket("Provide a list of tickets for a given release", "The users need this new feature", 3, 4);
        Ticket tick24 = new Ticket("Give user the ability to add tickets to a release", "The users need this new feature", 4, 5);
        Ticket tick25 = new Ticket("Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick26 = new Ticket("Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick27 = new Ticket("Provide a list of applications for users", "The users need this new feature", 2, 1);
        Ticket tick28 = new Ticket("Provide a list of tickets for an application", "The users need this new feature", 2, 1);
        Ticket tick29 = new Ticket("Provide a list of tickets for a given release", "The users need this new feature", 3, 4);
        Ticket tick30 = new Ticket("Give user the ability to add tickets to a release", "The users need this new feature", 4, 5);

        ticketRepository.save(tick1);
        ticketRepository.save(tick2);
        ticketRepository.save(tick3);
        ticketRepository.save(tick4);
        ticketRepository.save(tick5);
        ticketRepository.save(tick6);
        ticketRepository.save(tick7);
        ticketRepository.save(tick8);
        ticketRepository.save(tick9);
        ticketRepository.save(tick10);
        ticketRepository.save(tick11);
        ticketRepository.save(tick12);
        ticketRepository.save(tick13);
        ticketRepository.save(tick14);
        ticketRepository.save(tick15);
        ticketRepository.save(tick16);
        ticketRepository.save(tick17);
        ticketRepository.save(tick18);
        ticketRepository.save(tick19);
        ticketRepository.save(tick20);
        ticketRepository.save(tick21);
        ticketRepository.save(tick22);
        ticketRepository.save(tick23);
        ticketRepository.save(tick24);
        ticketRepository.save(tick25);
        ticketRepository.save(tick26);
        ticketRepository.save(tick27);
        ticketRepository.save(tick28);
        ticketRepository.save(tick29);
        ticketRepository.save(tick30);
    }
}
