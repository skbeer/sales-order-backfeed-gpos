package com.monsanto.irdsoapservices.retailseller.dao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.orm.ibatis.SqlMapClientCallback;
import org.apache.log4j.Logger;
import com.monsanto.irdsoapservices.retailseller.domain.SellerInfo;
import com.ibatis.sqlmap.client.SqlMapExecutor;

import java.util.List;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 28, 2010
 * Time: 9:54:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class RetailSellerDaoImpl extends SqlMapClientDaoSupport implements RetailSellerDao {
    Logger logger = Logger.getLogger(this.getClass());

    public int insertSellers(final List<SellerInfo> sellerList) throws Exception {
        logger.info("Begin Batch Insert for "+sellerList.size()+" RetailSeller Records.");
        return (Integer) getSqlMapClientTemplate().execute(new SqlMapClientCallback() {
                    public Object doInSqlMapClient(SqlMapExecutor executor) throws SQLException {
                        for (SellerInfo seller : sellerList) {
                            executor.insert("RetailSeller.insertSellerInfo", seller);
                        }
                        int rowsInserted = executor.executeBatch();
                        return new Integer(rowsInserted);
                    }
        });
    }
    
}
