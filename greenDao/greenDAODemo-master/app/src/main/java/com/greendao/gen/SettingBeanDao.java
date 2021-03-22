package com.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import top.daxianwill.yuedong.SettingBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "setting".
*/
public class SettingBeanDao extends AbstractDao<SettingBean, Long> {

    public static final String TABLENAME = "setting";

    /**
     * Properties of entity SettingBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property User_id = new Property(1, int.class, "user_id", false, "user_id");
        public final static Property Islogin = new Property(2, int.class, "islogin", false, "islogin");
        public final static Property User_rank = new Property(3, int.class, "user_rank", false, "user_rank");
        public final static Property Hx_phone = new Property(4, int.class, "hx_phone", false, "hx_phone");
        public final static Property User_name = new Property(5, String.class, "user_name", false, "user_name");
        public final static Property User_password = new Property(6, String.class, "user_password", false, "user_password");
        public final static Property User_phone = new Property(7, String.class, "user_phone", false, "user_phone");
    }


    public SettingBeanDao(DaoConfig config) {
        super(config);
    }
    
    public SettingBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"setting\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"user_id\" INTEGER NOT NULL ," + // 1: user_id
                "\"islogin\" INTEGER NOT NULL ," + // 2: islogin
                "\"user_rank\" INTEGER NOT NULL ," + // 3: user_rank
                "\"hx_phone\" INTEGER NOT NULL ," + // 4: hx_phone
                "\"user_name\" TEXT," + // 5: user_name
                "\"user_password\" TEXT," + // 6: user_password
                "\"user_phone\" TEXT);"); // 7: user_phone
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"setting\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SettingBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getUser_id());
        stmt.bindLong(3, entity.getIslogin());
        stmt.bindLong(4, entity.getUser_rank());
        stmt.bindLong(5, entity.getHx_phone());
 
        String user_name = entity.getUser_name();
        if (user_name != null) {
            stmt.bindString(6, user_name);
        }
 
        String user_password = entity.getUser_password();
        if (user_password != null) {
            stmt.bindString(7, user_password);
        }
 
        String user_phone = entity.getUser_phone();
        if (user_phone != null) {
            stmt.bindString(8, user_phone);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, SettingBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getUser_id());
        stmt.bindLong(3, entity.getIslogin());
        stmt.bindLong(4, entity.getUser_rank());
        stmt.bindLong(5, entity.getHx_phone());
 
        String user_name = entity.getUser_name();
        if (user_name != null) {
            stmt.bindString(6, user_name);
        }
 
        String user_password = entity.getUser_password();
        if (user_password != null) {
            stmt.bindString(7, user_password);
        }
 
        String user_phone = entity.getUser_phone();
        if (user_phone != null) {
            stmt.bindString(8, user_phone);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public SettingBean readEntity(Cursor cursor, int offset) {
        SettingBean entity = new SettingBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // user_id
            cursor.getInt(offset + 2), // islogin
            cursor.getInt(offset + 3), // user_rank
            cursor.getInt(offset + 4), // hx_phone
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // user_name
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // user_password
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // user_phone
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, SettingBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUser_id(cursor.getInt(offset + 1));
        entity.setIslogin(cursor.getInt(offset + 2));
        entity.setUser_rank(cursor.getInt(offset + 3));
        entity.setHx_phone(cursor.getInt(offset + 4));
        entity.setUser_name(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setUser_password(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setUser_phone(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(SettingBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(SettingBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(SettingBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
