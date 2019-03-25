package com.example.ironworkman.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WORK_PERIODS_DAYS_AND_TIMES")
public class WorkPeriodsDaysAndTimes {

  @Id
  @Column(name="WORK_SCHEDULES_ID")
  private long workSchedulesId;

  @Column(name="START_DAY_TIME")
  private java.sql.Timestamp startDayTime;

  @Column(name="END_DAY_TIME")
  private java.sql.Timestamp endDayTime;

  @Column(name="PERIOD_MIN")
  private long periodMin;

  @Column(name="USERS_ID")
  private long usersId;


  public long getWorkSchedulesId() {
    return this.workSchedulesId;
  }

  public void setWorkSchedulesId(long workSchedulesId) {
    this.workSchedulesId = workSchedulesId;
  }

  public java.sql.Timestamp getStartDayTime() {
    return this.startDayTime;
  }

  public void setStartDayTime(java.sql.Timestamp startDayTime) {
    this.startDayTime = startDayTime;
  }

  public java.sql.Timestamp getEndDayTime() {
    return this.endDayTime;
  }

  public void setEndDayTime(java.sql.Timestamp endDayTime) {
    this.endDayTime = endDayTime;
  }

  public long getPeriodMin() {
    return this.periodMin;
  }

  public void setPeriodMin(long periodMin) {
    this.periodMin = periodMin;
  }

  public long getUsersId() {
    return this.usersId;
  }

  public void setUsersId(long usersId) {
    this.usersId = usersId;
  }
}
