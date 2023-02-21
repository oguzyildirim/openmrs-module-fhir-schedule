package org.openmrs.module.fhirresource.api.schedule;

import org.hibernate.SessionFactory;

public class HibernateScheduleDAO implements ScheduleDAO {

    private SessionFactory sessionFactory;

    /**
     * Set session factory that allows us to connect to the database that Hibernate knows about.
     *
     * @param sessionFactory
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Schedule saveSchedule(Schedule schedule) {
        sessionFactory.getCurrentSession()
                .saveOrUpdate(schedule);
        return schedule;
    }

    @Override
    public Schedule getSchedule(Integer scheduleId) {
        return (Schedule) sessionFactory.getCurrentSession()
                .get(Schedule.class, scheduleId);
    }
}
