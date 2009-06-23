package net.jradius.dal.dao;

import java.util.List;
import net.jradius.dal.model.RadPostAuth;
import net.jradius.dal.model.RadPostAuthExample;

public interface RadPostAuthDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radpostauth
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    Long insert(RadPostAuth record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radpostauth
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int updateByPrimaryKey(RadPostAuth record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radpostauth
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int updateByPrimaryKeySelective(RadPostAuth record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radpostauth
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    List<RadPostAuth> selectByExample(RadPostAuthExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radpostauth
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    RadPostAuth selectByPrimaryKey(Long id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radpostauth
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int deleteByExample(RadPostAuthExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radpostauth
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radpostauth
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int countByExample(RadPostAuthExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radpostauth
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int updateByExampleSelective(RadPostAuth record, RadPostAuthExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radpostauth
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int updateByExample(RadPostAuth record, RadPostAuthExample example);
}