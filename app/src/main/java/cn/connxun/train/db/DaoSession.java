package cn.connxun.train.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import cn.connxun.train.entity.VideoClass;

import cn.connxun.train.db.VideoClassDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig videoClassDaoConfig;

    private final VideoClassDao videoClassDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        videoClassDaoConfig = daoConfigMap.get(VideoClassDao.class).clone();
        videoClassDaoConfig.initIdentityScope(type);

        videoClassDao = new VideoClassDao(videoClassDaoConfig, this);

        registerDao(VideoClass.class, videoClassDao);
    }
    
    public void clear() {
        videoClassDaoConfig.clearIdentityScope();
    }

    public VideoClassDao getVideoClassDao() {
        return videoClassDao;
    }

}
