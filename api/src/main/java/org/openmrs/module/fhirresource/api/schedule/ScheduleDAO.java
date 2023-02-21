package org.openmrs.module.fhirresource.api.schedule;

interface ScheduleDAO {

    public Schedule saveSchedule(Schedule schedule);


    public Schedule getSchedule(Integer scheduleId);

}
