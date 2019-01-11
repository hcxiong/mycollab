package com.mycollab.form.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.form.domain.FormSection;
import com.mycollab.form.domain.FormSectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface FormSectionMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    long countByExample(FormSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int deleteByExample(FormSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int insert(FormSection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int insertSelective(FormSection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    List<FormSection> selectByExample(FormSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    FormSection selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int updateByExampleSelective(@Param("record") FormSection record, @Param("example") FormSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int updateByExample(@Param("record") FormSection record, @Param("example") FormSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int updateByPrimaryKeySelective(FormSection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int updateByPrimaryKey(FormSection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    Integer insertAndReturnKey(FormSection value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    void massUpdateWithSession(@Param("record") FormSection record, @Param("primaryKeys") List primaryKeys);
}