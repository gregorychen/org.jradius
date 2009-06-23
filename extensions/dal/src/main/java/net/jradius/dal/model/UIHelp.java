package net.jradius.dal.model;

import com.coova.dal.Record;

public class UIHelp extends Record {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column uihelp.id
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    private Long id;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column uihelp.keyid
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    private String keyid;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column uihelp.helptext
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    private String helptext;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column uihelp.id
     *
     * @return the value of uihelp.id
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column uihelp.id
     *
     * @param id the value for uihelp.id
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column uihelp.keyid
     *
     * @return the value of uihelp.keyid
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public String getKeyid() {
        return keyid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column uihelp.keyid
     *
     * @param keyid the value for uihelp.keyid
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public void setKeyid(String keyid) {
        this.keyid = keyid == null ? null : keyid.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column uihelp.helptext
     *
     * @return the value of uihelp.helptext
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public String getHelptext() {
        return helptext;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column uihelp.helptext
     *
     * @param helptext the value for uihelp.helptext
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public void setHelptext(String helptext) {
        this.helptext = helptext == null ? null : helptext.trim();
    }

    public Record synchronizedRecord() {
        return new SynchronizedUIHelp(this);
    }
}