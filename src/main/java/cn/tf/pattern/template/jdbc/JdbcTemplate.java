package cn.tf.pattern.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values){
        try{
            //1、获取连接
            Connection conn =this.getConnection();
            //2、创建语句集
            PreparedStatement pstm = this.createPrepareStatement(conn,sql);
            //3、执行语句集
            ResultSet rs = this.executeQuery(pstm,values);
            //4、处理结果集
            List<?> result = this.paresResultSet(rs,rowMapper);
            //5、关闭结果集
            this.closeResultSet(rs);
            this.closeStatement(pstm);
            this.closeConnection(conn);
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
    return null;

    }

    private void closeStatement(PreparedStatement pstm) throws  Exception{
        pstm.close();
    }

    private void closeConnection(Connection conn) throws Exception{
        conn.close();
    }

    private void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }

    protected  List<?> paresResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<Object>();
        int rowNum = 1;
        while(rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum ++));
        }
        return result;

    }

    private ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws Exception{
        for(int i=0;i<values.length;i++){
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }

    private PreparedStatement createPrepareStatement(Connection conn, String sql) throws  Exception{
        return conn.prepareStatement(sql);
    }

    public Connection getConnection() throws Exception{
        return this.dataSource.getConnection();
    };


}
