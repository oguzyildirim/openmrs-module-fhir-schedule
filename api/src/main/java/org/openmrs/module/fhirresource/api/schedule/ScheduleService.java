package org.openmrs.module.fhirresource.api.schedule;

import org.openmrs.annotation.Authorized;
import org.openmrs.api.OpenmrsService;

public interface ScheduleService extends OpenmrsService {

    public Schedule saveScheduleStudy(Schedule schedule);


    public Schedule getSchedule(Integer scheduleId);


}
