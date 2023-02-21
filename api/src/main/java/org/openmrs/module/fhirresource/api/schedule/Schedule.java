package org.openmrs.module.fhirresource.api.schedule;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Reference;
import org.openmrs.Auditable;
import org.openmrs.BaseOpenmrsObject;
import org.openmrs.User;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


public class Schedule extends BaseOpenmrsObject implements Auditable {

    @Id
    @GeneratedValue
    @Column(name = "fhirresource_schedule_id")
    private Integer scheduleId;

    @Column(name = "fhirresource_schedule_identifier")
    private Identifier identifier;

    @Column(name = "fhirresource_schedule_active")
    private boolean active;

    @Column(name = "fhirresource_schedule_service_category")
    private CodeableConcept serviceCategory;

    @Column(name = "fhirresource_schedule_service_type")
    private CodeableConcept serviceType;

    @Column(name = "fhirresource_schedule_specialty")
    private CodeableConcept specialty;

    @Column(name = "fhirresource_schedule_actor")
    private Reference actor;

    @Column(name = "fhirresource_schedule_planning_horizon")
    private Period  planningHorizon;

    @Column(name = "fhirresource_schedule_comment")
    private String comment;

    public Schedule() {

    }

    public Schedule(int scheduleId, Identifier identifier, boolean active, CodeableConcept serviceCategory, CodeableConcept serviceType, CodeableConcept specialty, Reference actor, Period planningHorizon, String comment) {
        this.scheduleId = scheduleId;
        this.identifier = identifier;
        this.active = active;
        this.serviceCategory = serviceCategory;
        this.serviceType = serviceType;
        this.specialty = specialty;
        this.actor = actor;
        this.planningHorizon = planningHorizon;
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Schedule)) return false;
        if (!super.equals(o)) return false;

        Schedule schedule = (Schedule) o;

        return identifier != null ? identifier.equals(schedule.identifier) : schedule.identifier == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (identifier != null ? identifier.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schedule{");
        sb.append("identifier=").append(identifier);
        sb.append(", active=").append(active);
        sb.append(", serviceCategory=").append(serviceCategory);
        sb.append(", serviceType=").append(serviceType);
        sb.append(", specialty=").append(specialty);
        sb.append(", actor=").append(actor);
        sb.append(", planningHorizon=").append(planningHorizon);
        sb.append(", comment='").append(comment).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public User getCreator() {
        return null;
    }

    @Override
    public void setCreator(User user) {

    }


    @Override
    public Date getDateCreated() {
        return null;
    }

    @Override
    public void setDateCreated(Date date) {

    }

    @Override
    public User getChangedBy() {
        return null;
    }

    @Override
    public void setChangedBy(User user) {

    }

    @Override
    public Date getDateChanged() {
        return null;
    }

    @Override
    public void setDateChanged(Date date) {

    }

    @Override
    public Integer getId() {
        return getScheduleId();
    }

    @Override
    public void setId(Integer integer) {
        setScheduleId(integer);
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public CodeableConcept getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(CodeableConcept serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public CodeableConcept getServiceType() {
        return serviceType;
    }

    public void setServiceType(CodeableConcept serviceType) {
        this.serviceType = serviceType;
    }

    public CodeableConcept getSpecialty() {
        return specialty;
    }

    public void setSpecialty(CodeableConcept specialty) {
        this.specialty = specialty;
    }

    public Reference getActor() {
        return actor;
    }

    public void setActor(Reference actor) {
        this.actor = actor;
    }

    public Period getPlanningHorizon() {
        return planningHorizon;
    }

    public void setPlanningHorizon(Period planningHorizon) {
        this.planningHorizon = planningHorizon;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
