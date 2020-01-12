package com.monsanto.irdsoapservices.constants;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class DBConstants {
	public static final String ADD_ACTION_TYPE = "ADD";
    public static final String INSERT_ACTION_TYPE = "INSERT";
	public static final String UPDATE_ACTION_TYPE = "UPDATE";
	public static final String DELETE_ACTION_TYPE = "DELETE";
	
	public static final String ROW_TASK_ID = "IRDSoapServices";
	public static final String ROW_USER_ID = "IRDPOS_USER";

    public static final String SUCCESS = "Success";

    public static final String PPOS_TRAN_TYPE = "PPOS";
    public static final String COS_TRAN_TYPE = "DOS";
    public static final String GPOS_TRAN_TYPE = "GPOS";
    public static final String FPOS_CREDITLIST_TYPE = "FPOS;CREDITLIST";
    public static final String GPOS_AGRIMINE_TRAN_TYPE = "GPOS;AGRIMINE";
    public static final String GPOS_CLASSIC_TRAN_TYPE = "GPOS;CLASSIC";
    public static final String GPOS_DIRECT_TRAN_TYPE = "GPOS;DIRECT";
    //CUSTPLT-632 - Introducing new Partner Agdata
    public static final String GPOS_AGDATA_TRAN_TYPE = "GPOS;AGDATA";

    public static final String DIRECT_DATA_SOURCE_TYPE = "DIRECT";
    public static final String AGRIMINE_DATA_SOURCE_TYPE = "AGRIMINE";
    public static final String XML_DATA_SOURCE_TYPE = "XML";
    //CUSTPLT-632 - Introducing new Partner Agdata
    public static final String GPOS_AGDATA_SOURCE_TYPE = "AGDATA";
}
