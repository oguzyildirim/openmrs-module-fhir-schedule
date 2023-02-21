package org.openmrs.module.fhirresource.api.schedule;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.APIException;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public class ScheduleServiceImpl extends BaseOpenmrsService implements ScheduleService {

    private static final Log log = LogFactory.getLog(ScheduleServiceImpl.class);

    private ScheduleDAO scheduleDAO;

    public void setScheduleDAO(ScheduleDAO scheduleDAO) {
        this.scheduleDAO = scheduleDAO;
    }

    @Override
    @Transactional
    public Schedule saveScheduleStudy(Schedule schedule) {
        if (schedule == null) {
            throw new IllegalArgumentException("radiologyStudy cannot be null");
        }
        if (schedule.getScheduleId() != null) {
            throw new APIException("RadiologyStudy.cannot.edit.existing");
        }
        return scheduleDAO.saveSchedule(schedule);
    }

    @Override
    public Schedule getSchedule(Integer scheduleId) {
        if (scheduleId == null) {
            throw new IllegalArgumentException("studyId cannot be null");
        }

        return scheduleDAO.getSchedule(scheduleId);
    }

}
