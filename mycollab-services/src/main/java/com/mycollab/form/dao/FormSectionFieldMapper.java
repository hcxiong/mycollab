package com.mycollab.form.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.form.domain.FormSectionField;
import com.mycollab.form.domain.FormSectionFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface FormSectionFieldMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    long countByExample(FormSectionFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int deleteByExample(FormSectionFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int insert(FormSectionField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int insertSelective(FormSectionField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    List<FormSectionField> selectByExample(FormSectionFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    FormSectionField selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int updateByExampleSelective(@Param("record") FormSectionField record, @Param("example") FormSectionFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int updateByExample(@Param("record") FormSectionField record, @Param("example") FormSectionFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int updateByPrimaryKeySelective(FormSectionField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    int updateByPrimaryKey(FormSectionField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    Integer insertAndReturnKey(FormSectionField value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Fri Jan 11 10:10:21 CST 2019
     */
    void massUpdateWithSession(@Param("record") FormSectionField record, @Param("primaryKeys") List primaryKeys);
}