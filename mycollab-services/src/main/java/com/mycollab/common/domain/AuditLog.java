/*Domain class of table m_audit_log*/
package com.mycollab.common.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_audit_log")
@Alias("AuditLog")
public class AuditLog extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_audit_log.id
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_audit_log.object_class
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    @NotEmpty
    @Length(max=255, message="Field value is too long")
    @Column("object_class")
    private String objectClass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_audit_log.createdTime
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    @NotNull
    @Column("createdTime")
    private LocalDateTime createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_audit_log.createdUser
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_audit_log.sAccountId
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    @NotNull
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_audit_log.type
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    @NotEmpty
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_audit_log.typeid
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    @NotNull
    @Column("typeid")
    private Integer typeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_audit_log.module
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    @NotEmpty
    @Length(max=45, message="Field value is too long")
    @Column("module")
    private String module;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_audit_log.activityLogId
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    @Column("activityLogId")
    private Integer activitylogid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_audit_log.changeset
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    @NotEmpty
    @Length(max=16777215, message="Field value is too long")
    @Column("changeset")
    private String changeset;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        AuditLog item = (AuditLog)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1863, 1241).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_audit_log.id
     *
     * @return the value of m_audit_log.id
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_audit_log.id
     *
     * @param id the value for m_audit_log.id
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_audit_log.object_class
     *
     * @return the value of m_audit_log.object_class
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public String getObjectClass() {
        return objectClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_audit_log.object_class
     *
     * @param objectClass the value for m_audit_log.object_class
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public void setObjectClass(String objectClass) {
        this.objectClass = objectClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_audit_log.createdTime
     *
     * @return the value of m_audit_log.createdTime
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public LocalDateTime getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_audit_log.createdTime
     *
     * @param createdtime the value for m_audit_log.createdTime
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public void setCreatedtime(LocalDateTime createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_audit_log.createdUser
     *
     * @return the value of m_audit_log.createdUser
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_audit_log.createdUser
     *
     * @param createduser the value for m_audit_log.createdUser
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_audit_log.sAccountId
     *
     * @return the value of m_audit_log.sAccountId
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_audit_log.sAccountId
     *
     * @param saccountid the value for m_audit_log.sAccountId
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_audit_log.type
     *
     * @return the value of m_audit_log.type
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_audit_log.type
     *
     * @param type the value for m_audit_log.type
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_audit_log.typeid
     *
     * @return the value of m_audit_log.typeid
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_audit_log.typeid
     *
     * @param typeid the value for m_audit_log.typeid
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_audit_log.module
     *
     * @return the value of m_audit_log.module
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public String getModule() {
        return module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_audit_log.module
     *
     * @param module the value for m_audit_log.module
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_audit_log.activityLogId
     *
     * @return the value of m_audit_log.activityLogId
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public Integer getActivitylogid() {
        return activitylogid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_audit_log.activityLogId
     *
     * @param activitylogid the value for m_audit_log.activityLogId
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public void setActivitylogid(Integer activitylogid) {
        this.activitylogid = activitylogid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_audit_log.changeset
     *
     * @return the value of m_audit_log.changeset
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public String getChangeset() {
        return changeset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_audit_log.changeset
     *
     * @param changeset the value for m_audit_log.changeset
     *
     * @mbg.generated Fri Jan 11 10:10:20 CST 2019
     */
    public void setChangeset(String changeset) {
        this.changeset = changeset;
    }

    public enum Field {
        id,
        objectClass,
        createdtime,
        createduser,
        saccountid,
        type,
        typeid,
        module,
        activitylogid,
        changeset;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}