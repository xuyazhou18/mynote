package com.xuyazhou.mynote.mapper;

import com.xuyazhou.mynote.model.Attachment;
import com.xuyazhou.mynote.model.AttachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttachmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbg.generated
     */
    long countByExample(AttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbg.generated
     */
    int deleteByExample(AttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbg.generated
     */
    int insert(Attachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbg.generated
     */
    int insertSelective(Attachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbg.generated
     */
    List<Attachment> selectByExample(AttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbg.generated
     */
    Attachment selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Attachment record, @Param("example") AttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Attachment record, @Param("example") AttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Attachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Attachment record);
}