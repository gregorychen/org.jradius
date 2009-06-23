package net.jradius.dal.dao;

import java.util.List;
import net.jradius.dal.model.RadUserGroup;
import net.jradius.dal.model.RadUserGroupExample;

public interface RadUserGroupDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radusergroup
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    Long insert(RadUserGroup record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radusergroup
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int updateByPrimaryKey(RadUserGroup record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radusergroup
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int updateByPrimaryKeySelective(RadUserGroup record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radusergroup
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    List<RadUserGroup> selectByExample(RadUserGroupExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radusergroup
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    RadUserGroup selectByPrimaryKey(Long id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radusergroup
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int deleteByExample(RadUserGroupExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radusergroup
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radusergroup
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int countByExample(RadUserGroupExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radusergroup
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int updateByExampleSelective(RadUserGroup record, RadUserGroupExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radusergroup
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    int updateByExample(RadUserGroup record, RadUserGroupExample example);
}