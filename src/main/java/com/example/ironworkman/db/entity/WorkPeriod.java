package com.example.ironworkman.db.entity;

import javax.persistence.*;

@Entity
@Table(name="WORK_PERIOD")
public class WorkPeriod {

  @Id
  @Column(name="ID")
  private long id;

  @Column(name="TIME_AMOUNT")
  private long timeAmount;

  @Column(name="DESCRIPTION")
  private String description;

  @Column(name="WORK_PERIODS_DAYS_AND_TIMES_WORK_SCHEDULES_ID")
  private long workPeriodsDaysAndTimesWorkSchedulesId;

  @Column(name="CATEGORIES_ID")
  private long categoriesId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getTimeAmount() {
    return this.timeAmount;
  }

  public void setTimeAmount(long timeAmount) {
    this.timeAmount = timeAmount;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public long getWorkPeriodsDaysAndTimesWorkSchedulesId() {
    return this.workPeriodsDaysAndTimesWorkSchedulesId;
  }

  public void setWorkPeriodsDaysAndTimesWorkSchedulesId(long workPeriodsDaysAndTimesWorkSchedulesId) {
    this.workPeriodsDaysAndTimesWorkSchedulesId = workPeriodsDaysAndTimesWorkSchedulesId;
  }

  public long getCategoriesId() {
    return this.categoriesId;
  }

  public void setCategoriesId(long categoriesId) {
    this.categoriesId = categoriesId;
  }
}
