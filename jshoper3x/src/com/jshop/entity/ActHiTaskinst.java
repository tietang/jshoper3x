package com.jshop.entity;

// Generated 2014-5-27 21:22:57 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ActHiTaskinst generated by hbm2java
 */
@Entity
@Table(name = "act_hi_taskinst", catalog = "jshoper3")
public class ActHiTaskinst implements java.io.Serializable {

	private String id;
	private String procDefId;
	private String taskDefKey;
	private String procInstId;
	private String executionId;
	private String name;
	private String parentTaskId;
	private String description;
	private String owner;
	private String assignee;
	private Date startTime;
	private Date claimTime;
	private Date endTime;
	private Long duration;
	private String deleteReason;
	private Integer priority;
	private Date dueDate;
	private String formKey;

	public ActHiTaskinst() {
	}

	public ActHiTaskinst(String id, Date startTime) {
		this.id = id;
		this.startTime = startTime;
	}

	public ActHiTaskinst(String id, String procDefId, String taskDefKey,
			String procInstId, String executionId, String name,
			String parentTaskId, String description, String owner,
			String assignee, Date startTime, Date claimTime, Date endTime,
			Long duration, String deleteReason, Integer priority, Date dueDate,
			String formKey) {
		this.id = id;
		this.procDefId = procDefId;
		this.taskDefKey = taskDefKey;
		this.procInstId = procInstId;
		this.executionId = executionId;
		this.name = name;
		this.parentTaskId = parentTaskId;
		this.description = description;
		this.owner = owner;
		this.assignee = assignee;
		this.startTime = startTime;
		this.claimTime = claimTime;
		this.endTime = endTime;
		this.duration = duration;
		this.deleteReason = deleteReason;
		this.priority = priority;
		this.dueDate = dueDate;
		this.formKey = formKey;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "PROC_DEF_ID_", length = 64)
	public String getProcDefId() {
		return this.procDefId;
	}

	public void setProcDefId(String procDefId) {
		this.procDefId = procDefId;
	}

	@Column(name = "TASK_DEF_KEY_")
	public String getTaskDefKey() {
		return this.taskDefKey;
	}

	public void setTaskDefKey(String taskDefKey) {
		this.taskDefKey = taskDefKey;
	}

	@Column(name = "PROC_INST_ID_", length = 64)
	public String getProcInstId() {
		return this.procInstId;
	}

	public void setProcInstId(String procInstId) {
		this.procInstId = procInstId;
	}

	@Column(name = "EXECUTION_ID_", length = 64)
	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	@Column(name = "NAME_")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PARENT_TASK_ID_", length = 64)
	public String getParentTaskId() {
		return this.parentTaskId;
	}

	public void setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	@Column(name = "DESCRIPTION_", length = 4000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "OWNER_")
	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Column(name = "ASSIGNEE_")
	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "START_TIME_", nullable = false, length = 0)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CLAIM_TIME_", length = 0)
	public Date getClaimTime() {
		return this.claimTime;
	}

	public void setClaimTime(Date claimTime) {
		this.claimTime = claimTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "END_TIME_", length = 0)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Column(name = "DURATION_")
	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	@Column(name = "DELETE_REASON_", length = 4000)
	public String getDeleteReason() {
		return this.deleteReason;
	}

	public void setDeleteReason(String deleteReason) {
		this.deleteReason = deleteReason;
	}

	@Column(name = "PRIORITY_")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DUE_DATE_", length = 0)
	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Column(name = "FORM_KEY_")
	public String getFormKey() {
		return this.formKey;
	}

	public void setFormKey(String formKey) {
		this.formKey = formKey;
	}

}
